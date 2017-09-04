package com.taobao.api;

import com.taobao.api.internal.util.TaobaoHashMap;

import java.util.Map;

public abstract class BaseTaobaoRequest<T extends TaobaoResponse>
        implements TaobaoRequest<T> {
    protected Map<String, String> headerMap;
    protected TaobaoHashMap udfParams;
    protected Long timestamp;
    protected String targetAppKey;
    protected String topMixParams;
    protected String session;
    protected int order;

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Map<String, String> getHeaderMap() {
        if (this.headerMap == null) {
            this.headerMap = new TaobaoHashMap();
        }
        return this.headerMap;
    }

    public void setHeaderMap(Map<String, String> headerMap) {
        this.headerMap = headerMap;
    }

    public void putHeaderParam(String key, String value) {
        getHeaderMap().put(key, value);
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getTargetAppKey() {
        return this.targetAppKey;
    }

    public void setTargetAppKey(String targetAppKey) {
        this.targetAppKey = targetAppKey;
    }

    public String getTopMixParams() {
        return this.topMixParams;
    }

    public void setTopMixParams(String topMixParams) {
        this.topMixParams = topMixParams;
    }

    public String getBatchApiSession() {
        return this.session;
    }

    public void setBatchApiSession(String session) {
        this.session = session;
    }

    public int getBatchApiOrder() {
        return this.order;
    }

    public void setBatchApiOrder(int order) {
        this.order = order;
    }
}


