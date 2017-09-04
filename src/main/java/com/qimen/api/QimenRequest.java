package com.qimen.api;

import com.taobao.api.internal.util.TaobaoHashMap;

public abstract class QimenRequest<T extends QimenResponse> {
    protected String customerId;
    protected Long timestamp;
    protected String version = "1.0";
    protected String testType;
    protected String body;
    protected TaobaoHashMap queryParams;

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTestType() {
        return this.testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return this.body;
    }

    public TaobaoHashMap getQueryParams() {
        return this.queryParams;
    }

    public void addQueryParam(String key, String value) {
        if (this.queryParams == null) {
            this.queryParams = new TaobaoHashMap();
        }
        this.queryParams.put(key, value);
    }

    public abstract String getApiMethodName();

    public abstract Class<T> getResponseClass();
}


