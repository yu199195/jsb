package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AftersaleGetResponse;

import java.util.Map;

public class AftersaleGetRequest
        extends BaseTaobaoRequest<AftersaleGetResponse> {
    public String getApiMethodName() {
        return "taobao.aftersale.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<AftersaleGetResponse> getResponseClass() {
        return AftersaleGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


