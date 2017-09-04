package com.taobao.api.internal.util;

import com.taobao.api.ApiException;
import com.taobao.api.SecretException;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.parser.json.ObjectJsonParser;
import com.taobao.api.internal.util.json.JSONReader;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.internal.util.json.JSONWriter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class TaobaoUtils {
    private static final String AES = "AES";
    private static String intranetIp;

    public static String signTopRequest(RequestParametersHolder requestHolder, String secret, String signMethod)
            throws IOException {
        return signTopRequest(requestHolder.getAllParams(), null, secret, signMethod);
    }

    public static String signTopRequest(Map<String, String> params, String body, String secret, String signMethod)
            throws IOException {
        String[] keys = (String[]) params.keySet().toArray(new String[0]);
        Arrays.sort(keys);

        StringBuilder query = new StringBuilder();
        if ("md5".equals(signMethod)) {
            query.append(secret);
        }
        for (String key : keys) {
            String value = (String) params.get(key);
            if (StringUtils.areNotEmpty(new String[]{key, value})) {
                query.append(key).append(value);
            }
        }

        if (body != null) {
            query.append(body);
        }

        byte[] bytes;
        if ("hmac".equals(signMethod)) {
            bytes = encryptHMAC(query.toString(), secret);
        } else {
            query.append(secret);
            bytes = encryptMD5(query.toString());
        }

        return byte2hex(bytes);
    }

    public static String signTopRequestWithBody(RequestParametersHolder requestHolder, String body, String secret, String signMethod)
            throws IOException {
        Map<String, String> params = requestHolder.getAllParams();
        return signTopRequest(params, body, secret, signMethod);
    }

    private static byte[] encryptHMAC(String data, String secret) throws IOException {
        byte[] bytes = null;
        try {
            SecretKey secretKey = new SecretKeySpec(secret.getBytes("UTF-8"), "HmacMD5");
            Mac mac = Mac.getInstance(secretKey.getAlgorithm());
            mac.init(secretKey);
            bytes = mac.doFinal(data.getBytes("UTF-8"));
        } catch (GeneralSecurityException gse) {
            throw new IOException(gse.toString());
        }
        return bytes;
    }

    public static byte[] encryptMD5(String data)
            throws IOException {
        return encryptMD5(data.getBytes("UTF-8"));
    }

    public static byte[] encryptMD5(byte[] data)
            throws IOException {
        byte[] bytes = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            bytes = md.digest(data);
        } catch (GeneralSecurityException gse) {
            throw new IOException(gse.toString());
        }
        return bytes;
    }

    public static String byte2hex(byte[] bytes) {
        StringBuilder sign = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(bytes[i] & 0xFF);
            if (hex.length() == 1) {
                sign.append("0");
            }
            sign.append(hex.toUpperCase());
        }
        return sign.toString();
    }

    public static <V> Map<String, V> cleanupMap(Map<String, V> map) {
        if ((map == null) || (map.isEmpty())) {
            return null;
        }

        Map<String, V> result = new HashMap(map.size());
        Set<Entry<String, V>> entries = map.entrySet();

        for (Entry<String, V> entry : entries) {
            if (entry.getValue() != null) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        return result;
    }

    public static Object jsonToObject(String json) {
        JSONReader jr = new JSONValidatingReader();
        return jr.read(json);
    }

    public static String objectToJson(Object object) {
        JSONWriter writer = new JSONWriter(false, true);
        return writer.write(object);
    }

    public static String objectToXml(Object object) {
        XmlWriter writer = new XmlWriter();
        return writer.write(object);
    }

    public static <T extends TaobaoResponse> T parseResponse(String json, Class<T> clazz)
            throws ApiException {
        ObjectJsonParser<T> parser = new ObjectJsonParser(clazz);
        T rsp = parser.parse(json);
        rsp.setBody(json);
        return rsp;
    }

    public static String getIntranetIp() {
        if (intranetIp == null) {
            try {
                intranetIp = InetAddress.getLocalHost().getHostAddress();
            } catch (Exception e) {
                intranetIp = "127.0.0.1";
            }
        }
        return intranetIp;
    }

    public static String aesEncrypt(String content, byte[] encryptKey) throws SecretException {
        try {
            return aesEncrypt(content.getBytes("UTF-8"), encryptKey);
        } catch (Exception e) {
            throw new SecretException(e);
        }
    }

    public static String aesDecrypt(String content, byte[] decryptKey)
            throws SecretException {
        try {
            return new String(aesDecrypt(content.getBytes("UTF-8"), decryptKey), "UTF-8");
        } catch (Exception e) {
            throw new SecretException(e);
        }
    }

    public static byte[] aesDecrypt(byte[] encryptBytes, byte[] decryptKey)
            throws SecretException {
        IvParameterSpec iv = new IvParameterSpec("0102030405060708".getBytes());
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(decryptKey, "AES"), iv);
            return cipher.doFinal(Base64.decode(encryptBytes));
        } catch (Exception e) {
            throw new SecretException(e);
        }
    }

    public static String aesEncrypt(byte[] content, byte[] encryptKey)
            throws SecretException {
        try {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            kgen.init(new SecureRandom(encryptKey));

            IvParameterSpec iv = new IvParameterSpec("0102030405060708".getBytes());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(encryptKey, "AES"), iv);

            return base64Encode(cipher.doFinal(content));
        } catch (Exception e) {
            throw new SecretException(e);
        }
    }

    public static String base64Encode(byte[] src) {
        try {
            return base64Encode(src, "UTF-8");
        } catch (UnsupportedEncodingException e) {
        }
        return null;
    }

    public static String base64Encode(byte[] src, String charsetName)
            throws UnsupportedEncodingException {
        byte[] res = Base64.encodeToByte(src, false);
        return src != null ? new String(res, charsetName) : null;
    }
}


