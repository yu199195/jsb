package com.taobao.api.internal.util;

import com.taobao.api.ApiException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public abstract class AtsUtils {
    private static final Set<String> CONTENT_TYPES = new HashSet();
    private static final Pattern REGEX_FILE_NAME = Pattern.compile("attachment;filename=\"([\\w\\-]+)\"");

    static {
        CONTENT_TYPES.add("application/octet-stream");
        CONTENT_TYPES.add("application/java-archive");
    }

    public static File ungzip(File gzip, File toDir)
            throws IOException {
        toDir.mkdirs();
        File out = new File(toDir, gzip.getName());
        GZIPInputStream gin = null;
        FileOutputStream fout = null;
        try {
            FileInputStream fin = new FileInputStream(gzip);
            gin = new GZIPInputStream(fin);
            fout = new FileOutputStream(out);
            copy(gin, fout);
            gin.close();
            fout.close();
        } finally {
            closeQuietly(gin);
            closeQuietly(fout);
        }
        return out;
    }

    public static List<File> unzip(File zip, File toDir)
            throws IOException {
        ZipFile zf = null;
        List<File> files = null;
        try {
            zf = new ZipFile(zip);
            files = new ArrayList();
            Enumeration<?> entries = zf.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                if (entry.isDirectory()) {
                    new File(toDir, entry.getName()).mkdirs();
                } else {
                    InputStream input = null;
                    OutputStream output = null;
                    try {
                        File f = new File(toDir, entry.getName());
                        input = zf.getInputStream(entry);
                        output = new FileOutputStream(f);
                        copy(input, output);
                        files.add(f);
                    } finally {
                        closeQuietly(output);
                        closeQuietly(input);
                    }
                }
            }
        } finally {
            if (zf != null) {
                zf.close();
            }
        }
        return files;
    }

    public static File download(String url, File toDir)
            throws ApiException {
        toDir.mkdirs();
        HttpURLConnection conn = null;
        OutputStream output = null;
        File file = null;
        try {
            conn = getConnection(new URL(url));
            String ctype = conn.getContentType();
            if (CONTENT_TYPES.contains(ctype)) {
                String fileName = getFileName(conn);
                file = new File(toDir, fileName);
                output = new FileOutputStream(file);
                copy(conn.getInputStream(), output);
            } else {
                String rsp = WebUtils.getResponseAsString(conn);
                throw new ApiException(rsp);
            }
        } catch (IOException e) {
            throw new ApiException(e);
        } finally {
            closeQuietly(output);
            if (conn != null) {
                conn.disconnect();
            }
        }
        return file;
    }

    public static File download(String url, File toDir, String fileName)
            throws ApiException {
        toDir.mkdirs();
        HttpURLConnection conn = null;
        OutputStream output = null;
        File file = null;
        try {
            conn = getConnection(new URL(url));
            String ctype = conn.getContentType();
            if (CONTENT_TYPES.contains(ctype)) {
                file = new File(toDir, fileName);
                output = new FileOutputStream(file);
                copy(conn.getInputStream(), output);
            } else {
                String rsp = WebUtils.getResponseAsString(conn);
                throw new ApiException(rsp);
            }
        } catch (IOException e) {
            throw new ApiException(e);
        } finally {
            closeQuietly(output);
            if (conn != null) {
                conn.disconnect();
            }
        }
        return file;
    }

    public static boolean checkMd5sum(File file, String checkCode)
            throws IOException {
        DigestInputStream dInput = null;
        try {
            FileInputStream fInput = new FileInputStream(file);
            dInput = new DigestInputStream(fInput, getMd5Instance());
            byte[] buf = new byte[8192];
            while (dInput.read(buf) > 0) {
            }

            byte[] bytes = dInput.getMessageDigest().digest();
            return bytes2hex(bytes).equals(checkCode);
        } finally {
            closeQuietly(dInput);
        }
    }

    private static String bytes2hex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(bytes[i] & 0xFF);
            if (hex.length() == 1) {
                sb.append("0").append(hex);
            } else {
                sb.append(hex);
            }
        }
        return sb.toString();
    }

    private static MessageDigest getMd5Instance() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String getFileName(HttpURLConnection conn) {
        String fileName = conn.getHeaderField("Content-Disposition");
        Matcher matcher = REGEX_FILE_NAME.matcher(fileName);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private static HttpURLConnection getConnection(URL url) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setRequestProperty("Accept", "application/zip;text/html");
        return conn;
    }

    private static int copy(InputStream input, OutputStream output) throws IOException {
        long count = copyStream(input, output);
        if (count > 2147483647L) {
            return -1;
        }
        return (int) count;
    }

    private static long copyStream(InputStream input, OutputStream output) throws IOException {
        byte[] buffer = new byte[1024];
        long count = 0L;
        int n = 0;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
            count += n;
        }
        return count;
    }

    private static void closeQuietly(OutputStream output) {
        try {
            if (output != null) {
                output.close();
            }
        } catch (IOException ioe) {
        }
    }

    private static void closeQuietly(InputStream input) {
        try {
            if (input != null) {
                input.close();
            }
        } catch (IOException ioe) {
        }
    }
}


