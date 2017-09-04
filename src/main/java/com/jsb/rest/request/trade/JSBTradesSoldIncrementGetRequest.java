package com.jsb.rest.request.trade;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.TradesSoldIncrementGetResponse;

import java.util.Map;

public class JSBTradesSoldIncrementGetRequest
        extends JSBRequest<TradesSoldIncrementGetResponse> {
    public void setFields(String fields) {
        this.queryMaps.put("fields", fields);
    }

    public void setStartModified(String start_modified) {
        this.queryMaps.put("start_modified", start_modified);
    }

    public void setEndModified(String end_modified) {
        this.queryMaps.put("end_modified", end_modified);
    }

    public void setStatus(String status) {
        this.queryMaps.put("status", status);
    }

    public void setType(String type) {
        this.queryMaps.put("type", type);
    }

    public void setBuyerNick(String buyer_nick) {
        this.queryMaps.put("buyer_nick", buyer_nick);
    }

    public void setExtType(String ext_type) {
        this.queryMaps.put("ext_type", ext_type);
    }

    public void setTag(String tag) {
        this.queryMaps.put("tag", tag);
    }

    public void setPageNo(String page_no) {
        this.queryMaps.put("page_no", page_no);
    }

    public void setPageSize(String page_size) {
        this.queryMaps.put("page_size", page_size);
    }

    public void setUseHasNext(String use_has_next) {
        this.queryMaps.put("use_has_next", use_has_next);
    }

    public String getResourceUrl() {
        return "trade/TradesSoldGetRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_GET;
    }

    public Class<TradesSoldIncrementGetResponse> getResponseClass() {
        return TradesSoldIncrementGetResponse.class;
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


