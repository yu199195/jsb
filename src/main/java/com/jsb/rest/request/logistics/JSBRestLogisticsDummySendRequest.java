package com.jsb.rest.request.logistics;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.LogisticsDummySendResponse;

import java.util.Map;

public class JSBRestLogisticsDummySendRequest
        extends JSBRequest<LogisticsDummySendResponse> {
    public String getResourceUrl() {
        return "logistics/LogisticsDummySendRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }

    public Class<LogisticsDummySendResponse> getResponseClass() {
        return LogisticsDummySendResponse.class;
    }

    public void setTid(String tid) {
        this.queryMaps.put("tid", tid);
    }

    public void checkParameter()
            throws ApiRuleException {
    }

    public Object getEntity() {
        return null;
    }

    public void postHandler() {
    }

    public String getType() {
        return null;
    }
}


