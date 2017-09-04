package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsAddressSearchResponse;

import java.util.Map;

public class LogisticsAddressSearchRequest
        extends BaseTaobaoRequest<LogisticsAddressSearchResponse> {
    private String rdef;

    public void setRdef(String rdef) {
        this.rdef = rdef;
    }

    public String getRdef() {
        return this.rdef;
    }

    public String getApiMethodName() {
        return "taobao.logistics.address.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("rdef", this.rdef);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsAddressSearchResponse> getResponseClass() {
        return LogisticsAddressSearchResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


