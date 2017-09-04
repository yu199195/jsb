package com.taobao.api.internal.mapping;

import com.taobao.api.ApiException;

public abstract interface Converter {
    public abstract <T> T toResponse(String paramString, Class<T> paramClass)
            throws ApiException;
}


