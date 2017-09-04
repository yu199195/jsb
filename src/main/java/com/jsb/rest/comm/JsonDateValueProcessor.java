package com.jsb.rest.comm;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

public class JsonDateValueProcessor
        implements JsonValueProcessor {
    public Object processObjectValue(String paramString, Object paramObject, JsonConfig paramJsonConfig) {
        if (paramObject == null) {
            return null;
        }
        String ret = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            ret = format.format((Date) paramObject);
        } catch (Exception e) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            ret = format.format((Date) paramObject);
        }
        return ret;
    }

    public Object processArrayValue(Object paramObject, JsonConfig paramJsonConfig) {
        return null;
    }
}


