package com.taobao.api.internal.util;

import java.util.HashMap;
import java.util.Map;

public class RequestParametersHolder {
    private String requestUrl;
    private String responseBody;
    private TaobaoHashMap protocalMustParams;
    private TaobaoHashMap protocalOptParams;
    private TaobaoHashMap applicationParams;

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getResponseBody() {
        return this.responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public TaobaoHashMap getProtocalMustParams() {
        return this.protocalMustParams;
    }

    public void setProtocalMustParams(TaobaoHashMap protocalMustParams) {
        this.protocalMustParams = protocalMustParams;
    }

    public TaobaoHashMap getProtocalOptParams() {
        return this.protocalOptParams;
    }

    public void setProtocalOptParams(TaobaoHashMap protocalOptParams) {
        this.protocalOptParams = protocalOptParams;
    }

    public TaobaoHashMap getApplicationParams() {
        return this.applicationParams;
    }

    public void setApplicationParams(TaobaoHashMap applicationParams) {
        this.applicationParams = applicationParams;
    }

    public Map<String, String> getAllParams() {
        Map<String, String> params = new HashMap();
        if ((this.protocalMustParams != null) && (!this.protocalMustParams.isEmpty())) {
            params.putAll(this.protocalMustParams);
        }
        if ((this.protocalOptParams != null) && (!this.protocalOptParams.isEmpty())) {
            params.putAll(this.protocalOptParams);
        }
        if ((this.applicationParams != null) && (!this.applicationParams.isEmpty())) {
            params.putAll(this.applicationParams);
        }
        return params;
    }
}


