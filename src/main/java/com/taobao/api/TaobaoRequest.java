package com.taobao.api;

import java.util.Map;

public abstract interface TaobaoRequest<T extends TaobaoResponse> {
    public abstract String getApiMethodName();

    public abstract Map<String, String> getTextParams();

    public abstract Long getTimestamp();

    public abstract String getTargetAppKey();

    public abstract Class<T> getResponseClass();

    public abstract Map<String, String> getHeaderMap();

    public abstract void check()
            throws ApiRuleException;

    public abstract String getBatchApiSession();

    public abstract void setBatchApiSession(String paramString);

    public abstract int getBatchApiOrder();

    public abstract void setBatchApiOrder(int paramInt);
}


