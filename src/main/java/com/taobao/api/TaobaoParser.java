package com.taobao.api;

public abstract interface TaobaoParser<T> {
    public abstract T parse(String paramString)
            throws ApiException;

    public abstract Class<T> getResponseClass()
            throws ApiException;
}


