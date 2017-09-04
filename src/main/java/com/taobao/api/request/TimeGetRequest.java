package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TimeGetResponse;

import java.util.Map;

public class TimeGetRequest
        extends BaseTaobaoRequest<TimeGetResponse> {
    public String getApiMethodName() {
        return "taobao.time.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TimeGetResponse> getResponseClass() {
        return TimeGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


