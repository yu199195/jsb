package com.jsb.rest.comm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JsonConfig;
import net.sf.json.processors.DefaultValueProcessor;

public class JSONHelper {

    private static Map<String, Map<String, String>> respMap;
    public static JsonConfig dateFormaterConfig = new JsonConfig();

    static {
        dateFormaterConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
        dateFormaterConfig.registerDefaultValueProcessor(Integer.class, new DefaultValueProcessor() {
            public Object getDefaultValue(Class type) {
                return null;
            }
        });
        dateFormaterConfig.registerDefaultValueProcessor(Long.class, new DefaultValueProcessor() {
            public Object getDefaultValue(Class type) {
                return null;
            }

        });
        dateFormaterConfig.registerDefaultValueProcessor(Boolean.class, new DefaultValueProcessor() {
            public Object getDefaultValue(Class type) {
                return null;
            }
        });
    }

    public static Map<String, Class<?>> getMap(String respName)
    {
        Map<String, String> respEntities = respMap.get(respName);
        Map<String, Class<?>> ret = new HashMap<String, Class<?>>();
        if (null == respEntities)
        {
            return ret;
        }
        for (Map.Entry<String, String> entry : respEntities.entrySet())
        {
            try
            {
                ret.put(entry.getKey(), Class.forName(entry.getValue()));
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
        return ret;
    }
}


