package com.jsb.rest.request.trade;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;

import java.util.Map;

public class JSBTradeAddressGetRequest
        extends JSBRequest<JSBTradeAddressGetResponse> {
    public void setTid(String tid) {
        this.queryMaps.put("tid", tid);
    }

    public String getResourceUrl() {
        return "extention/TradeAddress";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_GET;
    }

    public Class<JSBTradeAddressGetResponse> getResponseClass() {
        return JSBTradeAddressGetResponse.class;
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


