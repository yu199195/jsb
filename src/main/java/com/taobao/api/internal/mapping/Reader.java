package com.taobao.api.internal.mapping;

import com.taobao.api.ApiException;

import java.util.List;

public abstract interface Reader {
    public abstract boolean hasReturnField(Object paramObject);

    public abstract Object getPrimitiveObject(Object paramObject);

    public abstract Object getObject(Object paramObject, Class<?> paramClass)
            throws ApiException;

    public abstract List<?> getListObjects(Object paramObject1, Object paramObject2, Class<?> paramClass)
            throws ApiException;
}


