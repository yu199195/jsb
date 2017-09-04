package com.taobao.api;

public abstract interface TaobaoClient {
    public abstract <T extends TaobaoResponse> T execute(TaobaoRequest<T> paramTaobaoRequest)
            throws ApiException;

    public abstract <T extends TaobaoResponse> T execute(TaobaoRequest<T> paramTaobaoRequest, String paramString)
            throws ApiException;
}


