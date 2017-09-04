package com.qimen.api;

import com.taobao.api.ApiException;

public abstract interface QimenClient {
    public abstract <T extends QimenResponse> T execute(QimenRequest<T> paramQimenRequest)
            throws ApiException;

    public abstract <T extends QimenResponse> T execute(QimenRequest<T> paramQimenRequest, String paramString)
            throws ApiException;
}


