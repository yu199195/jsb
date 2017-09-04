package com.taobao.api.internal.mapping;

import com.qimen.api.QimenResponse;
import com.taobao.api.ApiException;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.util.StringUtils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Converters {
    public static boolean isCheckJsonType = false;

    private static final Map<String, Set<String>> baseProps = new HashMap();
    private static final Map<String, Field> fieldCache = new ConcurrentHashMap();

    static {
        baseProps.put(TaobaoResponse.class.getName(), StringUtils.getClassProperties(TaobaoResponse.class, false));
        baseProps.put(QimenResponse.class.getName(), StringUtils.getClassProperties(QimenResponse.class, false));
    }

    public static <T> T convert(Class<T> clazz, Reader reader)
            throws ApiException {
        T rsp = null;
        try {
            rsp = clazz.newInstance();
            BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
            PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();

            for (PropertyDescriptor pd : pds) {
                Method method = pd.getWriteMethod();
                if (method != null) {
                    String itemName = pd.getName();
                    String listName = null;

                    Field field = null;
                    Set<String> stopProps = (Set) baseProps.get(clazz.getSuperclass().getName());
                    if ((stopProps != null) && (stopProps.contains(itemName))) {
                        field = getField(clazz.getSuperclass(), pd);
                    } else {
                        field = getField(clazz, pd);
                    }
                    if (field != null) {
                        ApiField jsonField = (ApiField) field.getAnnotation(ApiField.class);
                        if (jsonField != null) {
                            itemName = jsonField.value();
                        }
                        ApiListField jsonListField = (ApiListField) field.getAnnotation(ApiListField.class);
                        if (jsonListField != null) {
                            listName = jsonListField.value();
                        }

                        if ((reader.hasReturnField(itemName)) || (
                                (listName != null) && (reader.hasReturnField(listName)))) {
                            Class<?> typeClass = field.getType();

                            if (String.class.isAssignableFrom(typeClass)) {
                                Object value = reader.getPrimitiveObject(itemName);
                                if ((value instanceof String)) {
                                    method.invoke(rsp, new Object[]{value.toString()});
                                } else {
                                    if ((isCheckJsonType) && (value != null)) {
                                        throw new ApiException(itemName + " is not a String");
                                    }
                                    if (value != null) {
                                        method.invoke(rsp, new Object[]{value.toString()});
                                    } else {
                                        method.invoke(rsp, new Object[]{""});
                                    }
                                }
                            } else if (Long.class.isAssignableFrom(typeClass)) {
                                Object value = reader.getPrimitiveObject(itemName);
                                if ((value instanceof Long)) {
                                    method.invoke(rsp, new Object[]{(Long) value});
                                } else {
                                    if ((isCheckJsonType) && (value != null)) {
                                        throw new ApiException(itemName + " is not a Number(Long)");
                                    }
                                    if (StringUtils.isNumeric(value)) {
                                        method.invoke(rsp, new Object[]{Long.valueOf(value.toString())});
                                    }
                                }
                            } else if (Boolean.class.isAssignableFrom(typeClass)) {
                                Object value = reader.getPrimitiveObject(itemName);
                                if ((value instanceof Boolean)) {
                                    method.invoke(rsp, new Object[]{(Boolean) value});
                                } else {
                                    if ((isCheckJsonType) && (value != null)) {
                                        throw new ApiException(itemName + " is not a Boolean");
                                    }
                                    if (value != null) {
                                        method.invoke(rsp, new Object[]{Boolean.valueOf(value.toString())});
                                    }
                                }
                            } else if (Date.class.isAssignableFrom(typeClass)) {
                                Object value = reader.getPrimitiveObject(itemName);
                                if ((value instanceof String)) {
                                    method.invoke(rsp, new Object[]{StringUtils.parseDateTime(value.toString())});
                                }
                            } else if (List.class.isAssignableFrom(typeClass)) {
                                Type fieldType = field.getGenericType();
                                if ((fieldType instanceof ParameterizedType)) {
                                    ParameterizedType paramType = (ParameterizedType) fieldType;
                                    Type[] genericTypes = paramType.getActualTypeArguments();
                                    if ((genericTypes != null) && (genericTypes.length > 0) &&
                                            ((genericTypes[0] instanceof Class))) {
                                        Class<?> subType = (Class) genericTypes[0];
                                        List<?> listObjs = reader.getListObjects(listName, itemName, subType);
                                        if (listObjs != null) {
                                            method.invoke(rsp, new Object[]{listObjs});
                                        }
                                    }
                                }
                            } else if (Integer.class.isAssignableFrom(typeClass)) {
                                Object value = reader.getPrimitiveObject(itemName);
                                if ((value instanceof Integer)) {
                                    method.invoke(rsp, new Object[]{(Integer) value});
                                } else {
                                    if ((isCheckJsonType) && (value != null)) {
                                        throw new ApiException(itemName + " is not a Number(Integer)");
                                    }
                                    if (StringUtils.isNumeric(value)) {
                                        method.invoke(rsp, new Object[]{Integer.valueOf(value.toString())});
                                    }
                                }
                            } else if (Double.class.isAssignableFrom(typeClass)) {
                                Object value = reader.getPrimitiveObject(itemName);
                                if ((value instanceof Double)) {
                                    method.invoke(rsp, new Object[]{(Double) value});
                                } else if ((isCheckJsonType) && (value != null)) {
                                    throw new ApiException(itemName + " is not a Double");
                                }
                            } else if (Number.class.isAssignableFrom(typeClass)) {
                                Object value = reader.getPrimitiveObject(itemName);
                                if ((value instanceof Number)) {
                                    method.invoke(rsp, new Object[]{(Number) value});
                                } else if ((isCheckJsonType) && (value != null)) {
                                    throw new ApiException(itemName + " is not a Number");
                                }
                            } else {
                                Object obj = reader.getObject(itemName, typeClass);
                                if (obj != null)
                                    method.invoke(rsp, new Object[]{obj});
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }

        return rsp;
    }

    private static Field getField(Class<?> clazz, PropertyDescriptor pd) throws Exception {
        String key = clazz.getName() + "_" + pd.getName();
        Field field = (Field) fieldCache.get(key);
        if (field == null) {
            try {
                field = clazz.getDeclaredField(pd.getName());
                fieldCache.put(key, field);
            } catch (NoSuchFieldException e) {
                return null;
            }
        }
        return field;
    }
}


