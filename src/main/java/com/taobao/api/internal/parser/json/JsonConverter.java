package com.taobao.api.internal.parser.json;

import com.taobao.api.ApiException;
import com.taobao.api.internal.mapping.Converter;
import com.taobao.api.internal.mapping.Converters;
import com.taobao.api.internal.mapping.Reader;
import com.taobao.api.internal.util.json.ExceptionErrorListener;
import com.taobao.api.internal.util.json.JSONReader;
import com.taobao.api.internal.util.json.JSONValidatingReader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JsonConverter
        implements Converter {
    public <T> T toResponse(String rsp, Class<T> clazz)
            throws ApiException {
        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(rsp);
        Iterator localIterator;
        if ((rootObj instanceof Map)) {
            Map<?, ?> rootJson = (Map) rootObj;
            Collection<?> values = rootJson.values();
            for (localIterator = values.iterator(); localIterator.hasNext(); ) {
                Object rspObj = localIterator.next();

                if ((rspObj instanceof Map)) {
                    Map<?, ?> rspJson = (Map) rspObj;
                    return fromJson(rspJson, clazz);
                }
            }
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

            public Object getObject(Object name, Class<?> type)
                    throws ApiException {
                Object tmp = json.get(name);
                if ((tmp instanceof Map)) {
                    Map<?, ?> map = (Map) tmp;
                    return JsonConverter.this.fromJson(map, type);
                }

                return tmp;
            }

            public List<?> getListObjects(Object listName, Object itemName, Class<?> subType)
                    throws ApiException {
                List<Object> listObjs = null;

                Object listTmp = json.get(listName);
                Iterator localIterator;
                if ((listTmp instanceof Map)) {
                    Map<?, ?> jsonMap = (Map) listTmp;
                    Object itemTmp = jsonMap.get(itemName);
                    if ((itemTmp == null) && (listName != null)) {
                        String listNameStr = listName.toString();
                        itemTmp = jsonMap.get(listNameStr.substring(0, listNameStr.length() - 1));
                    }
                    if ((itemTmp instanceof List)) {
                        listObjs = new ArrayList();
                        List<?> tmpList = (List) itemTmp;
                        for (localIterator = tmpList.iterator(); localIterator.hasNext(); ) {
                            Object subTmp = localIterator.next();

                            if ((subTmp instanceof Map)) {
                                Map<?, ?> subMap = (Map) subTmp;
                                Object subObj = JsonConverter.this.fromJson(subMap, subType);
                                if (subObj != null) {
                                    listObjs.add(subObj);
                                }
                            } else if (!(subTmp instanceof List)) {
                                listObjs.add(subTmp);
                            }
                        }
                    }
                }

                return listObjs;
            }
        });
    }
}


