package com.jsb.rest.request.trade;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.response.TradeGetResponse;

import java.util.Map;

public class JSBTradeGetRequest
        extends JSBRequest<TradeGetResponse> {
    public void setFields(String fields) {
        this.queryMaps.put("fields", fields);
    }

    public void setTid(String tid) {
        this.queryMaps.put("tid", tid);
    }

    public String getResourceUrl() {
        return "trade/TradeGetRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_GET;
    }

    public Class<TradeGetResponse> getResponseClass() {
        return TradeGetResponse.class;
    }

    public void checkParameter()
            throws ApiRuleException {
        RequestCheckUtils.checkNumeric((String) this.queryMaps.get("tid"), "tid");
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


