package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ScitemOutercodeGetResponse;

import java.util.Map;

public class ScitemOutercodeGetRequest
        extends BaseTaobaoRequest<ScitemOutercodeGetResponse> {
    private String outerCode;

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public String getOuterCode() {
        return this.outerCode;
    }

    public String getApiMethodName() {
        return "taobao.scitem.outercode.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("outer_code", this.outerCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ScitemOutercodeGetResponse> getResponseClass() {
        return ScitemOutercodeGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.outerCode, "outerCode");
    }
}


