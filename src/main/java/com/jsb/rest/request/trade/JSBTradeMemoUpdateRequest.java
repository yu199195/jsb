package com.jsb.rest.request.trade;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.response.TradeMemoUpdateResponse;

import java.util.Map;

public class JSBTradeMemoUpdateRequest
        extends JSBRequest<TradeMemoUpdateResponse> {
    public void setMemo(String memo) {
        this.queryMaps.put("memo", memo);
    }

    public void setTid(String tid) {
        this.queryMaps.put("tid", tid);
    }

    public void setFlag(String flag) {
        this.queryMaps.put("flag", flag);
    }

    public void setReset(String reset) {
        this.queryMaps.put("reset", reset);
    }

    public String getResourceUrl() {
        return "trade/TradeMemoUpdateRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }

    public Class<TradeMemoUpdateResponse> getResponseClass() {
        return TradeMemoUpdateResponse.class;
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


