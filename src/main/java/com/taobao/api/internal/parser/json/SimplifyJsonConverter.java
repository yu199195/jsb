package com.taobao.api.internal.parser.json;

import com.taobao.api.ApiException;
import com.taobao.api.internal.mapping.Converter;
import com.taobao.api.internal.mapping.Converters;
import com.taobao.api.internal.mapping.Reader;
import com.taobao.api.internal.util.json.ExceptionErrorListener;
import com.taobao.api.internal.util.json.JSONReader;
import com.taobao.api.internal.util.json.JSONValidatingReader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SimplifyJsonConverter
        implements Converter {
    public <T> T toResponse(String rsp, Class<T> clazz)
            throws ApiException {
        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(rsp);
        if ((rootObj instanceof Map)) {
            Map<?, ?> rootJson = (Map) rootObj;
            Object errorJson = rootJson.get("error_response");
            if ((errorJson instanceof Map)) {
                return fromJson((Map) errorJson, clazz);
            }
            return fromJson(rootJson, clazz);
        }

        return null;
    }

    public <T> T fromJson(final Map<?, ?> json, Class<T> clazz)
            throws ApiException {
        return Converters.convert(clazz, new Reader() {
            public boolean hasReturnField(Object name) {
                return json.containsKey(name);
            }

            public Object getPrimitiveObject(Object name) {
                return json.get(name);
            }

            public Object getObject(Object name, Class<?> type) throws ApiException {
                Object tmp = json.get(name);
                if ((tmp instanceof Map)) {
                    Map<?, ?> map = (Map) tmp;
                    return SimplifyJsonConverter.this.fromJson(map, type);
                }
                return tmp;
            }

            public List<?> getListObjects(Object listName, Object itemName, Class<?> subType) throws ApiException {
                List<Object> listObjs = null;

                Object jsonList = json.get(listName);
                Iterator localIterator;
                if ((jsonList instanceof List)) {
                    listObjs = new ArrayList();
                    List<?> listObj = (List) jsonList;
                    for (localIterator = listObj.iterator(); localIterator.hasNext(); ) {
                        Object tmp = localIterator.next();
                        if ((tmp instanceof Map)) {
                            Map<?, ?> subMap = (Map) tmp;
                            Object subObj = SimplifyJsonConverter.this.fromJson(subMap, subType);
                            if (subObj != null) {
                                listObjs.add(subObj);
                            }
                        } else if (!(tmp instanceof List)) {
                            listObjs.add(tmp);
                        }
                    }
                }

                return listObjs;
            }
        });
    }
}


