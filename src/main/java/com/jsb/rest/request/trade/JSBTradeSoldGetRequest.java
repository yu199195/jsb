package com.jsb.rest.request.trade;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.response.TradesSoldGetResponse;

import java.util.Map;

public class JSBTradeSoldGetRequest
        extends JSBRequest<TradesSoldGetResponse> {
    public void setFields(String fields) {
        this.queryMaps.put("fields", fields);
    }

    public void setStartCreated(String startCreated) {
        this.queryMaps.put("start_created", startCreated);
    }

    public void setEndCreated(String startCreated) {
        this.queryMaps.put("end_created", startCreated);
    }

    public void setTitle(String title) {
        this.queryMaps.put("title", title);
    }

    public void setStatus(String status) {
        this.queryMaps.put("status", status);
    }

    public String getResourceUrl() {
        return "trade/TradesSoldGetRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_GET;
    }

    public Class<TradesSoldGetResponse> getResponseClass() {
        return TradesSoldGetResponse.class;
    }

    public void checkParameter()
            throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.queryMaps.get("fields"), "fields");
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


