package com.taobao.api.internal.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TaobaoHashMap
        extends HashMap<String, String> {
    private static final long serialVersionUID = -1277791390393392630L;

    public TaobaoHashMap() {
    }

    public TaobaoHashMap(Map<? extends String, ? extends String> m) {
        super(m);
    }

    public String put(String key, Object value) {
        String strValue = "";
        if (value == null) {
            strValue = null;
        } else {
            if ((value instanceof String)) {
                strValue = (String) value;
            } else {
                if ((value instanceof Integer)) {
                    strValue = value.toString();
                } else {
                    if ((value instanceof Long)) {
                        strValue = value.toString();
                    } else {
                        if ((value instanceof Float)) {
                            strValue = value.toString();
                        } else {
                            if ((value instanceof Double)) {
                                strValue = value.toString();
                            } else {
                                if ((value instanceof Boolean)) {
                                    strValue = value.toString();
                                } else {
                                    if ((value instanceof Date)) {
                                        strValue = StringUtils.formatDateTime((Date) value);
                                    } else
                                        strValue = value.toString();
                                }
                            }
                        }
                    }
                }
            }
        }
        return put(key, strValue);
    }

    public String put(String key, String value) {
        if (StringUtils.areNotEmpty(new String[]{key, value})) {
            return super.put(key, value);
        }
        return null;
    }
}


