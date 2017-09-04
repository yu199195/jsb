package com.jsb.rest.request.trade;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.response.TradeMemoAddResponse;

import java.util.Map;

public class JSBTradeMemoAddRequest
        extends JSBRequest<TradeMemoAddResponse> {
    public void setMemo(String memo) {
        this.queryMaps.put("memo", memo);
    }

    public void setTid(String tid) {
        this.queryMaps.put("tid", tid);
    }

    public String getResourceUrl() {
        return "trade/TradeMemoAddRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }

    public Class<TradeMemoAddResponse> getResponseClass() {
        return TradeMemoAddResponse.class;
    }

    public void checkParameter()
            throws ApiRuleException {
        RequestCheckUtils.checkNumeric((String) this.queryMaps.get("tid"), "tid");
        RequestCheckUtils.checkNotEmpty(this.queryMaps.get("memo"), "memo");
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


