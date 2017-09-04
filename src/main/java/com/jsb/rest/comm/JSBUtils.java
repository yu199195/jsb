package com.jsb.rest.comm;

import com.jsb.rest.client.JSBClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class JSBUtils {
    /**
     * logger
     */
    private static final Logger log = LoggerFactory.getLogger(JSBClient.class);


    public static String captureName(String name) {
        char[] cs = name.toCharArray();
        int
                tmp7_6 = 0;
        char[] tmp7_5 = cs;
        tmp7_5[tmp7_6] = ((char) (tmp7_5[tmp7_6] - ' '));
        return String.valueOf(cs);
    }

    public static String getGmtTimeStr() {
        Calendar cd = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssZ");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        return sdf.format(cd.getTime());
    }

    private static final String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static byte[] HmacSHA256(String data, byte[] key)
            throws NoSuchAlgorithmException, InvalidKeyException, IllegalStateException, UnsupportedEncodingException {
        String algorithm = "HmacSHA256";
        Mac mac = Mac.getInstance(algorithm);
        mac.init(new SecretKeySpec(key, algorithm));
        return mac.doFinal(data.getBytes("UTF-8"));
    }

    private static String byteToHexString(byte b) {
        int ret = b;

        if (ret < 0) {
            ret += 256;
        }
        int m = ret / 16;
        int n = ret % 16;
        return hexDigits[m] + hexDigits[n];
    }

    public static String byteArrayToHexString(byte[] bytes) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(byteToHexString(bytes[i]));
        }
        return sb.toString();
    }

    public static String genUserSk(String token, String userId)
            throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, IllegalStateException {
        byte[] kSecret = ("JSB4" + userId).getBytes("UTF-8");
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        sha1.update(token.getBytes("UTF-8"));
        String hexDigest = byteArrayToHexString(sha1.digest());
        byte[] kSigning = HmacSHA256(hexDigest, kSecret);
        String secretKey = byteArrayToHexString(kSigning);
        log.info("generate secret key for user " + userId + ",the token is " + token + "; generated secretkey is " + secretKey);

        return secretKey;
    }

    public static String genUserAk(String userId, String usernick)
            throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, IllegalStateException {
        byte[] kSecret = ("JSB4" + userId).getBytes("UTF-8");
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        sha1.update(usernick.getBytes("UTF-8"));
        String hexDigest = byteArrayToHexString(sha1.digest());
        byte[] kSigning = HmacSHA256(hexDigest, kSecret);
        String accessKey = byteArrayToHexString(kSigning);
        log.info("generate access key for user " + userId + ",the nick is " + usernick + ";generated accesskey is " + accessKey);

        return accessKey;
    }

    public static String getSignatureKey(String key, String reqId, String strToSign)
            throws Exception {
        System.out.println(strToSign);

        byte[] kSecret = ("JSB4" + key).getBytes("UTF-8");
        byte[] kReqid = HmacSHA256(reqId, kSecret);

        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        sha1.update(strToSign.getBytes("UTF-8"));
        String hexDigest = byteArrayToHexString(sha1.digest());
        byte[] kSigning = HmacSHA256(hexDigest, kReqid);
        String signature = byteArrayToHexString(kSigning);
        return signature;
    }
}


