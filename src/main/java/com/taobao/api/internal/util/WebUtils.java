package com.taobao.api.internal.util;

import com.taobao.api.FileItem;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public abstract class WebUtils {
    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final String METHOD_POST = "POST";
    private static final String METHOD_GET = "GET";
    private static boolean ignoreSSLCheck = true;
    private static boolean ignoreHostCheck = true;

    public static class TrustAllTrustManager implements X509TrustManager {
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        public void checkClientTrusted(X509Certificate[] chain, String authType)
                throws CertificateException {
        }

        public void checkServerTrusted(X509Certificate[] chain, String authType)
                throws CertificateException {
        }
    }

    public static void setIgnoreSSLCheck(boolean ignoreSSLCheck) {
        ignoreSSLCheck = ignoreSSLCheck;
    }

    public static void setIgnoreHostCheck(boolean ignoreHostCheck) {
        ignoreHostCheck = ignoreHostCheck;
    }

    public static String doPost(String url, Map<String, String> params, int connectTimeout, int readTimeout)
            throws IOException {
        return doPost(url, params, "UTF-8", connectTimeout, readTimeout);
    }

    public static String doPost(String url, Map<String, String> params, String charset, int connectTimeout, int readTimeout)
            throws IOException {
        return doPost(url, params, charset, connectTimeout, readTimeout, null);
    }

    public static String doPost(String url, Map<String, String> params, String charset, int connectTimeout, int readTimeout, Map<String, String> headerMap) throws IOException {
        String ctype = new StringBuilder().append("application/x-www-form-urlencoded;charset=").append(charset).toString();
        String query = buildQuery(params, charset);
        byte[] content = new byte[0];
        if (query != null) {
            content = query.getBytes(charset);
        }
        return _doPost(url, ctype, content, connectTimeout, readTimeout, headerMap);
    }

    public static String doPost(String url, String apiBody, String charset, int connectTimeout, int readTimeout, Map<String, String> headerMap) throws IOException {
        String ctype = new StringBuilder().append("text/plain;charset=").append(charset).toString();
        byte[] content = apiBody.getBytes(charset);
        return _doPost(url, ctype, content, connectTimeout, readTimeout, headerMap);
    }

    public static String doPost(String url, String ctype, byte[] content, int connectTimeout, int readTimeout)
            throws IOException {
        return _doPost(url, ctype, content, connectTimeout, readTimeout, null);
    }

    public static String doPost(String url, String ctype, byte[] content, int connectTimeout, int readTimeout, Map<String, String> headerMap)
            throws IOException {
        return _doPost(url, ctype, content, connectTimeout, readTimeout, headerMap);
    }

    private static String _doPost(String url, String ctype, byte[] content, int connectTimeout, int readTimeout, Map<String, String> headerMap) throws IOException {
        HttpURLConnection conn = null;
        OutputStream out = null;
        String rsp = null;
        try {
            conn = getConnection(new URL(url), "POST", ctype, headerMap);
            conn.setConnectTimeout(connectTimeout);
            conn.setReadTimeout(readTimeout);
            out = conn.getOutputStream();
            out.write(content);
            rsp = getResponseAsString(conn);
        } finally {
            if (out != null) {
                out.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }

        return rsp;
    }

    public static String doPost(String url, Map<String, String> params, Map<String, FileItem> fileParams, int connectTimeout, int readTimeout)
            throws IOException {
        if ((fileParams == null) || (fileParams.isEmpty())) {
            return doPost(url, params, "UTF-8", connectTimeout, readTimeout);
        }
        return doPost(url, params, fileParams, "UTF-8", connectTimeout, readTimeout);
    }

    public static String doPost(String url, Map<String, String> params, Map<String, FileItem> fileParams, String charset, int connectTimeout, int readTimeout) throws IOException {
        return doPost(url, params, fileParams, charset, connectTimeout, readTimeout, null);
    }

    public static String doPost(String url, Map<String, String> params, Map<String, FileItem> fileParams, String charset, int connectTimeout, int readTimeout, Map<String, String> headerMap)
            throws IOException {
        if ((fileParams == null) || (fileParams.isEmpty())) {
            return doPost(url, params, charset, connectTimeout, readTimeout, headerMap);
        }
        return _doPostWithFile(url, params, fileParams, charset, connectTimeout, readTimeout, headerMap);
    }

    private static String _doPostWithFile(String url, Map<String, String> params, Map<String, FileItem> fileParams, String charset, int connectTimeout, int readTimeout, Map<String, String> headerMap)
            throws IOException {
        String boundary = String.valueOf(System.nanoTime());
        HttpURLConnection conn = null;
        OutputStream out = null;
        String rsp = null;
        try {
            String ctype = new StringBuilder().append("multipart/form-data;charset=").append(charset).append(";boundary=").append(boundary).toString();
            conn = getConnection(new URL(url), "POST", ctype, headerMap);
            conn.setConnectTimeout(connectTimeout);
            conn.setReadTimeout(readTimeout);
            out = conn.getOutputStream();
            byte[] entryBoundaryBytes = new StringBuilder().append("\r\n--").append(boundary).append("\r\n").toString().getBytes(charset);
            Entry textEntry;
            Set<Entry<String, String>> textEntrySet = params.entrySet();
            for (Iterator localIterator = textEntrySet.iterator(); localIterator.hasNext(); ) {
                textEntry = (Entry) localIterator.next();
                byte[] textBytes = getTextEntry((String) textEntry.getKey(), (String) textEntry.getValue(), charset);
                out.write(entryBoundaryBytes);
                out.write(textBytes);
            }


            final Set<Entry<String, FileItem>> fileEntrySet = fileParams.entrySet();
            for (Entry<String, FileItem> fileEntry : fileEntrySet) {
                FileItem fileItem = fileEntry.getValue();
                if (!fileItem.isValid()) {
                    throw new IOException("FileItem is invalid");
                }
                byte[] fileBytes = getFileEntry((String) fileEntry.getKey(), fileItem.getFileName(), fileItem.getMimeType(), charset);
                out.write(entryBoundaryBytes);
                out.write(fileBytes);
                fileItem.write(out);
            }

            byte[] endBoundaryBytes = new StringBuilder().append("\r\n--").append(boundary).append("--\r\n").toString().getBytes(charset);
            out.write(endBoundaryBytes);
            rsp = getResponseAsString(conn);
        } finally {
            if (out != null) {
                out.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }

        return rsp;
    }

    private static byte[] getTextEntry(String fieldName, String fieldValue, String charset) throws IOException {
        StringBuilder entry = new StringBuilder();
        entry.append("Content-Disposition:form-data;name=\"");
        entry.append(fieldName);
        entry.append("\"\r\nContent-Type:text/plain\r\n\r\n");
        entry.append(fieldValue);
        return entry.toString().getBytes(charset);
    }

    private static byte[] getFileEntry(String fieldName, String fileName, String mimeType, String charset) throws IOException {
        StringBuilder entry = new StringBuilder();
        entry.append("Content-Disposition:form-data;name=\"");
        entry.append(fieldName);
        entry.append("\";filename=\"");
        entry.append(fileName);
        entry.append("\"\r\nContent-Type:");
        entry.append(mimeType);
        entry.append("\r\n\r\n");
        return entry.toString().getBytes(charset);
    }

    public static String doGet(String url, Map<String, String> params)
            throws IOException {
        return doGet(url, params, "UTF-8");
    }

    public static String doGet(String url, Map<String, String> params, String charset)
            throws IOException {
        HttpURLConnection conn = null;
        String rsp = null;
        try {
            String ctype = new StringBuilder().append("application/x-www-form-urlencoded;charset=").append(charset).toString();
            String query = buildQuery(params, charset);
            conn = getConnection(buildGetUrl(url, query), "GET", ctype, null);
            rsp = getResponseAsString(conn);
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }

        return rsp;
    }

    private static HttpURLConnection getConnection(URL url, String method, String ctype, Map<String, String> headerMap) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        HttpsURLConnection connHttps;
        if ((conn instanceof HttpsURLConnection)) {
            connHttps = (HttpsURLConnection) conn;
            if (ignoreSSLCheck) {
                try {
                    SSLContext ctx = SSLContext.getInstance("TLS");
                    ctx.init(null, new TrustManager[]{new TrustAllTrustManager()}, new SecureRandom());
                    connHttps.setSSLSocketFactory(ctx.getSocketFactory());
                    connHttps.setHostnameVerifier(new HostnameVerifier() {
                        public boolean verify(String hostname, SSLSession session) {
                            return true;
                        }
                    });
                } catch (Exception e) {
                    throw new IOException(e.toString());
                }

            } else if (ignoreHostCheck) {
                connHttps.setHostnameVerifier(new HostnameVerifier() {
                    public boolean verify(String hostname, SSLSession session) {
                        return true;
                    }
                });
            }

            conn = connHttps;
        }

        conn.setRequestMethod(method);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setRequestProperty("Host", url.getHost());
        conn.setRequestProperty("Accept", "text/xml,text/javascript");
        conn.setRequestProperty("User-Agent", "top-sdk-java");
        conn.setRequestProperty("Content-Type", ctype);
        if (headerMap != null) {
            for (Entry<String, String> entry : headerMap.entrySet()) {
                conn.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return conn;
    }

    private static URL buildGetUrl(String url, String query) throws IOException {
        if (StringUtils.isEmpty(query)) {
            return new URL(url);
        }

        return new URL(buildRequestUrl(url, new String[]{query}));
    }

    public static String buildRequestUrl(String url, String... queries) {
        if ((queries == null) || (queries.length == 0)) {
            return url;
        }

        StringBuilder newUrl = new StringBuilder(url);
        boolean hasQuery = url.contains("?");
        boolean hasPrepend = (url.endsWith("?")) || (url.endsWith("&"));

        for (String query : queries) {
            if (!StringUtils.isEmpty(query)) {
                if (!hasPrepend) {
                    if (hasQuery) {
                        newUrl.append("&");
                    } else {
                        newUrl.append("?");
                        hasQuery = true;
                    }
                }
                newUrl.append(query);
                hasPrepend = false;
            }
        }
        return newUrl.toString();
    }

    public static String buildQuery(Map<String, String> params, String charset) throws IOException {
        if ((params == null) || (params.isEmpty())) {
            return null;
        }

        StringBuilder query = new StringBuilder();
        Set<Entry<String, String>> entries = params.entrySet();
        boolean hasParam = false;

        for (Entry<String, String> entry : entries) {
            String name = (String) entry.getKey();
            String value = (String) entry.getValue();

            if (StringUtils.areNotEmpty(new String[]{name, value})) {
                if (hasParam) {
                    query.append("&");
                } else {
                    hasParam = true;
                }

                query.append(name).append("=").append(URLEncoder.encode(value, charset));
            }
        }

        return query.toString();
    }

    protected static String getResponseAsString(HttpURLConnection conn) throws IOException {
        String charset = getResponseCharset(conn.getContentType());
        if (conn.getResponseCode() < 400) {
            String contentEncoding = conn.getContentEncoding();
            if ("gzip".equalsIgnoreCase(contentEncoding)) {
                return getStreamAsString(new GZIPInputStream(conn.getInputStream()), charset);
            }
            return getStreamAsString(conn.getInputStream(), charset);
        }

        throw new IOException(new StringBuilder().append(conn.getResponseCode()).append(" ").append(conn.getResponseMessage()).toString());
    }

    public static String getStreamAsString(InputStream stream, String charset) throws IOException {
        try {
            Reader reader = new InputStreamReader(stream, charset);
            StringBuilder response = new StringBuilder();

            char[] buff = new char[1024];
            int read = 0;
            while ((read = reader.read(buff)) > 0) {
                response.append(buff, 0, read);
            }

            return response.toString();
        } finally {
            if (stream != null) {
                stream.close();
            }
        }
    }

    public static String getResponseCharset(String ctype) {
        String charset = "UTF-8";

        if (!StringUtils.isEmpty(ctype)) {
            String[] params = ctype.split(";");
            for (String param : params) {
                param = param.trim();
                if (param.startsWith("charset")) {
                    String[] pair = param.split("=", 2);
                    if ((pair.length != 2) ||
                            (StringUtils.isEmpty(pair[1]))) break;
                    charset = pair[1].trim();
                    break;
                }
            }
        }

        return charset;
    }

    public static String decode(String value) {
        return decode(value, "UTF-8");
    }

    public static String encode(String value) {
        return encode(value, "UTF-8");
    }

    public static String decode(String value, String charset) {
        String result = null;
        if (!StringUtils.isEmpty(value)) {
            try {
                result = URLDecoder.decode(value, charset);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }

    public static String encode(String value, String charset) {
        String result = null;
        if (!StringUtils.isEmpty(value)) {
            try {
                result = URLEncoder.encode(value, charset);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }

    public static Map<String, String> splitUrlQuery(String query) {
        Map<String, String> result = new HashMap();

        String[] pairs = query.split("&");
        if ((pairs != null) && (pairs.length > 0)) {
            for (String pair : pairs) {
                String[] param = pair.split("=", 2);
                if ((param != null) && (param.length == 2)) {
                    result.put(param[0], param[1]);
                }
            }
        }

        return result;
    }
}


