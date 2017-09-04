package com.jsb.rest.request;

import com.jsb.rest.client.JSBHttpMethod;
import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class JSBRequest<T extends TaobaoResponse> {
    protected Map<String, String> queryMaps;

    public JSBRequest() {
        this.queryMaps = new HashMap();
    }

    public abstract String getResourceUrl();

    public abstract JSBHttpMethod getMethod();

    public abstract Class<T> getResponseClass();

    public abstract Object getEntity();

    public abstract void postHandler();

    public abstract String getType();

    public abstract void checkParameter() throws ApiRuleException;

    public String getQueryStr() {
        StringBuilder builder = new StringBuilder();

        for (Map.Entry<String, String> entry : this.queryMaps.entrySet()) {
            builder.append((String) entry.getKey()).append("=").append((String) entry.getValue()).append("&");
        }
        String result = builder.toString();
        if (result.contains("&")) {
            result = result.substring(0, result.lastIndexOf("&"));
        }
        return result;
    }
}


