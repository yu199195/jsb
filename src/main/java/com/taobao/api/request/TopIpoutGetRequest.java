package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopIpoutGetResponse;

import java.util.Map;

public class TopIpoutGetRequest
        extends BaseTaobaoRequest<TopIpoutGetResponse> {
    public String getApiMethodName() {
        return "taobao.top.ipout.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TopIpoutGetResponse> getResponseClass() {
        return TopIpoutGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


