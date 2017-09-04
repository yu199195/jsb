package com.taobao.api.internal.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

public abstract class StringUtils {
    private static final TimeZone TZ_GMT8 = TimeZone.getTimeZone("GMT+8");

    private static final String QUOT = "&quot;";

    private static final String AMP = "&amp;";

    private static final String APOS = "&apos;";

    private static final String GT = "&gt;";

    private static final String LT = "&lt;";

    public static boolean isEmpty(String value) {
        int strLen;

        if ((value == null) || ((strLen = value.length()) == 0))
            return true;
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumeric(Object obj) {
        if (obj == null) {
            return false;
        }
        char[] chars = obj.toString().toCharArray();
        int length = chars.length;
        if (length < 1) {
            return false;
        }
        int i = 0;
        if ((length > 1) && (chars[0] == '-')) {
        }
        for (i = 1;

             i < length; i++) {
            if (!Character.isDigit(chars[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean areNotEmpty(String... values) {
        boolean result = true;
        if ((values == null) || (values.length == 0)) {
            result = false;
        } else {
            for (String value : values) {
                result &= !isEmpty(value);
            }
        }
        return result;
    }

    public static String unicodeToChinese(String unicode) {
        StringBuilder out = new StringBuilder();
        if (!isEmpty(unicode)) {
            for (int i = 0; i < unicode.length(); i++) {
                out.append(unicode.charAt(i));
            }
        }
        return out.toString();
    }

    public static String toUnderlineStyle(String name) {
        StringBuilder newName = new StringBuilder();
        int len = name.length();
        for (int i = 0; i < len; i++) {
            char c = name.charAt(i);
            if (Character.isUpperCase(c)) {
                if (i > 0) {
                    newName.append("_");
                }
                newName.append(Character.toLowerCase(c));
            } else {
                newName.append(c);
            }
        }
        return newName.toString();
    }

    public static String toCamelStyle(String name) {
        StringBuilder newName = new StringBuilder();
        int len = name.length();
        for (int i = 0; i < len; i++) {
            char c = name.charAt(i);
            if (i == 0) {
                newName.append(Character.toLowerCase(c));
            } else {
                newName.append(c);
            }
        }
        return newName.toString();
    }

    public static Date parseDateTime(String str) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        format.setTimeZone(TZ_GMT8);
        try {
            return format.parse(str);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String formatDateTime(Date date) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        format.setTimeZone(TZ_GMT8);
        return format.format(date);
    }

    public static String formatDateTime(Date date, String pattern) {
        DateFormat format = new SimpleDateFormat(pattern);
        format.setTimeZone(TZ_GMT8);
        return format.format(date);
    }

    public static String escapeXml(String value) {
        StringBuilder writer = new StringBuilder();
        char[] chars = value.trim().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            switch (c) {
                case '<':
                    writer.append("&lt;");
                    break;
                case '>':
                    writer.append("&gt;");
                    break;
                case '\'':
                    writer.append("&apos;");
                    break;
                case '&':
                    writer.append("&amp;");
                    break;
                case '"':
                    writer.append("&quot;");
                    break;
                default:
                    if ((c == '\t') || (c == '\n') || (c == '\r') || ((c >= ' ') && (c <= 55295)) || ((c >= 57344) && (c <= 65533)) || ((c >= 65536) && (c <= 1114111))) {
                        writer.append(c);
                    }
                    break;
            }
        }
        return writer.toString();
    }

    public static Set<String> getClassProperties(Class<?> clazz, boolean isGet) {
        Set<String> propNames = new HashSet();
        try {
            BeanInfo info = Introspector.getBeanInfo(clazz);
            PropertyDescriptor[] props = info.getPropertyDescriptors();
            for (PropertyDescriptor prop : props) {
                String name = prop.getName();
                Method method;
                if (isGet) {
                    method = prop.getReadMethod();
                } else {
                    method = prop.getWriteMethod();
                }
                if ((!"class".equals(name)) && (method != null)) {
                    propNames.add(name);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return propNames;
    }

    public static boolean isDigits(String str) {
        if (isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}


