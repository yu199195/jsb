package com.taobao.api.internal.util;

import com.taobao.api.ApiException;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public final class XmlUtils {
    private static final Log log = LogFactory.getLog(XmlUtils.class);

    private static final String XMLNS_XSI = "xmlns:xsi";

    private static final String XSI_SCHEMA_LOCATION = "xsi:schemaLocation";

    private static final String LOGIC_YES = "yes";

    private static final String DEFAULT_CHARSET = "UTF-8";

    public static Document newDocument()
            throws ApiException {
        Document doc = null;
        try {
            doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException e) {
            throw new ApiException(e);
        }

        return doc;
    }

    public static Document getDocument(File file)
            throws ApiException {
        InputStream in = getInputStream(file);
        return getDocument(new InputSource(in), null);
    }

    public static Document getDocument(InputSource xml, InputStream xsd)
            throws ApiException {
        Document doc = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            if (xsd != null) {
                dbf.setNamespaceAware(true);
            }

            DocumentBuilder builder = dbf.newDocumentBuilder();
            doc = builder.parse(xml);

            if (xsd != null) {
                validateXml(doc, xsd);
            }
        } catch (ParserConfigurationException e) {
            throw new ApiException(e);
        } catch (SAXException e) {
            throw new ApiException("XML_PARSE_ERROR", e);
        } catch (IOException e) {
            throw new ApiException("XML_READ_ERROR", e);
        } finally {
            closeStream(xml.getByteStream());
        }

        return doc;
    }

    public static Element createRootElement(String tagName)
            throws ApiException {
        Document doc = newDocument();
        Element root = doc.createElement(tagName);
        doc.appendChild(root);
        return root;
    }

    public static Element getRootElementFromStream(InputStream xml)
            throws ApiException {
        return getDocument(new InputSource(xml), null).getDocumentElement();
    }

    public static Element getRootElementFromStream(InputStream xml, InputStream xsd)
            throws ApiException {
        return getDocument(new InputSource(xml), xsd).getDocumentElement();
    }

    public static Element getRootElementFromFile(File xml)
            throws ApiException {
        return getDocument(xml).getDocumentElement();
    }

    public static Element getRootElementFromString(String payload)
            throws ApiException {
        if ((payload == null) || (payload.length() < 1)) {
            throw new ApiException("XML_PAYLOAD_EMPTY");
        }

        StringReader sr = new StringReader(escapeXml(payload));
        InputSource source = new InputSource(sr);
        return getDocument(source, null).getDocumentElement();
    }

    public static List<Element> getElements(Element parent, String tagName) {
        NodeList nodes = parent.getElementsByTagName(tagName);
        List<Element> elements = new ArrayList();

        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if ((node instanceof Element)) {
                elements.add((Element) node);
            }
        }

        return elements;
    }

    public static Element getElement(Element parent, String tagName) {
        List<Element> children = getElements(parent, tagName);

        if (children.isEmpty()) {
            return null;
        }
        return (Element) children.get(0);
    }

    public static List<Element> getChildElements(Element parent, String tagName) {
        NodeList nodes = parent.getElementsByTagName(tagName);
        List<Element> elements = new ArrayList();

        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (((node instanceof Element)) && (node.getParentNode() == parent)) {
                elements.add((Element) node);
            }
        }

        return elements;
    }

    public static List<Element> getChildElements(Element parent) {
        NodeList nodes = parent.getChildNodes();
        List<Element> elements = new ArrayList();

        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (((node instanceof Element)) && (node.getParentNode() == parent)) {
                elements.add((Element) node);
            }
        }

        return elements;
    }

    public static Element getChildElement(Element parent, String tagName) {
        List<Element> children = getChildElements(parent, tagName);

        if (children.isEmpty()) {
            return null;
        }
        return (Element) children.get(0);
    }

    public static String getElementValue(Element parent, String tagName) {
        Element element = getElement(parent, tagName);
        if (element != null) {
            return element.getTextContent();
        }
        return null;
    }

    public static String getChildElementValue(Element parent, String tagName) {
        Element element = getChildElement(parent, tagName);
        if (element != null) {
            return element.getTextContent();
        }
        return null;
    }

    public static String getElementValue(Element element) {
        if (element != null) {
            NodeList nodes = element.getChildNodes();
            if ((nodes != null) && (nodes.getLength() > 0)) {
                for (int i = 0; i < nodes.getLength(); i++) {
                    Node node = nodes.item(i);
                    if ((node instanceof Text)) {
                        return ((Text) node).getData();
                    }
                }
            }
        }

        return null;
    }

    public static String getAttributeValue(Element current, String attrName) {
        if (current.hasAttribute(attrName)) {
            return current.getAttribute(attrName);
        }
        return null;
    }

    public static Element appendElement(Element parent, String tagName) {
        Element child = parent.getOwnerDocument().createElement(tagName);
        parent.appendChild(child);
        return child;
    }

    public static Element appendElement(Element parent, String tagName, String value) {
        Element child = appendElement(parent, tagName);
        child.setTextContent(value);
        return child;
    }

    public static void appendElement(Element parent, Element child) {
        Node tmp = parent.getOwnerDocument().importNode(child, true);
        parent.appendChild(tmp);
    }

    public static Element appendCDATAElement(Element parent, String tagName, String value) {
        Element child = appendElement(parent, tagName);
        if (value == null) {
            value = "";
        }

        Node cdata = child.getOwnerDocument().createCDATASection(value);
        child.appendChild(cdata);
        return child;
    }

    public static String childNodeToString(Node node)
            throws ApiException {
        String payload = null;
        try {
            Transformer tf = TransformerFactory.newInstance().newTransformer();

            Properties props = tf.getOutputProperties();
            props.setProperty("omit-xml-declaration", "yes");
            props.setProperty("encoding", "UTF-8");
            tf.setOutputProperties(props);

            StringWriter writer = new StringWriter();
            tf.transform(new DOMSource(node), new StreamResult(writer));
            payload = escapeXml(writer.toString());
        } catch (TransformerException e) {
            throw new ApiException("XML_TRANSFORM_ERROR", e);
        }

        return payload;
    }

    public static String nodeToString(Node node)
            throws ApiException {
        String payload = null;
        try {
            Transformer tf = TransformerFactory.newInstance().newTransformer();

            Properties props = tf.getOutputProperties();
            props.setProperty("encoding", "UTF-8");
            props.setProperty("indent", "yes");
            tf.setOutputProperties(props);

            StringWriter writer = new StringWriter();
            tf.transform(new DOMSource(node), new StreamResult(writer));
            payload = escapeXml(writer.toString());
        } catch (TransformerException e) {
            throw new ApiException("XML_TRANSFORM_ERROR", e);
        }

        return payload;
    }

    public static String escapeXml(String payload) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < payload.length(); i++) {
            char c = payload.charAt(i);
            if ((c == '\t') || (c == '\n') || (c == '\r') || ((c >= ' ') && (c <= 55295)) || ((c >= 57344) && (c <= 65533)) || ((c >= 65536) && (c <= 1114111))) {
                out.append(c);
            }
        }
        return out.toString();
    }

    public static String xmlToString(File file)
            throws ApiException {
        Element root = getRootElementFromFile(file);
        return nodeToString(root);
    }

    public static String xmlToString(InputStream in)
            throws ApiException {
        Element root = getRootElementFromStream(in);
        return nodeToString(root);
    }

    public static void saveToXml(Node doc, File file)
            throws ApiException {
        saveToXml(doc, file, "UTF-8");
    }

    public static void saveToXml(Node doc, File file, String charset)
            throws ApiException {
        Writer writer = null;
        try {
            Transformer tf = TransformerFactory.newInstance().newTransformer();

            Properties props = tf.getOutputProperties();
            props.setProperty("method", "xml");
            props.setProperty("indent", "yes");
            tf.setOutputProperties(props);

            DOMSource dom = new DOMSource(doc);
            writer = new OutputStreamWriter(getOutputStream(file), charset);
            Result result = new StreamResult(writer);
            tf.transform(dom, result);
        } catch (Exception e) {
            throw new ApiException("XML_WRITE_FILE_ERROR", e);
        } finally {
            closeStream(writer);
        }
    }

    public static void validateXml(InputStream xml, InputStream xsd)
            throws ApiException {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            Document doc = dbf.newDocumentBuilder().parse(xml);
            validateXml(doc, xsd);
        } catch (SAXException e) {
            throw new ApiException("XML_VALIDATE_ERROR", e);
        } catch (Exception e) {
            throw new ApiException("XML_READ_ERROR", e);
        } finally {
            closeStream(xml);
            closeStream(xsd);
        }
    }

    public static void validateXml(Node root, InputStream xsd)
            throws ApiException {
        try {
            Source source = new StreamSource(xsd);
            Schema schema = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema").newSchema(source);

            Validator validator = schema.newValidator();
            validator.validate(new DOMSource(root));
        } catch (SAXException e) {
            if (log.isErrorEnabled()) {
                log.error(new StringBuilder().append("验证XML文件出错：\n").append(nodeToString(root)).toString());
            }
            throw new ApiException("XML_VALIDATE_ERROR", e);
        } catch (Exception e) {
            throw new ApiException("XML_READ_ERROR", e);
        } finally {
            closeStream(xsd);
        }
    }

    public static String xmlToHtml(String payload, File xsltFile)
            throws ApiException {
        String result = null;
        try {
            Source template = new StreamSource(xsltFile);
            Transformer transformer = TransformerFactory.newInstance().newTransformer(template);

            Properties props = transformer.getOutputProperties();
            props.setProperty("omit-xml-declaration", "yes");
            transformer.setOutputProperties(props);

            StreamSource source = new StreamSource(new StringReader(payload));
            StreamResult sr = new StreamResult(new StringWriter());
            transformer.transform(source, sr);

            result = sr.getWriter().toString();
        } catch (TransformerException e) {
            throw new ApiException("XML_TRANSFORM_ERROR", e);
        }

        return result;
    }

    public static void setNamespace(Element element, String namespace, String schemaLocation) {
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", namespace);
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
        element.setAttributeNS("http://www.w3.org/2001/XMLSchema-instance", "xsi:schemaLocation", schemaLocation);
    }

    public static String encodeXml(String payload)
            throws ApiException {
        Element root = createRootElement("xml");
        root.setTextContent(payload);
        return childNodeToString(root.getFirstChild());
    }

    private static void closeStream(Closeable stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (IOException e) {
            }
        }
    }

    private static InputStream getInputStream(File file) throws ApiException {
        InputStream in = null;
        try {
            in = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new ApiException("XML_FILE_NOT_FOUND", e);
        }

        return in;
    }

    private static OutputStream getOutputStream(File file) throws ApiException {
        OutputStream in = null;
        try {
            in = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new ApiException("XML_FILE_NOT_FOUND", e);
        }

        return in;
    }
}


