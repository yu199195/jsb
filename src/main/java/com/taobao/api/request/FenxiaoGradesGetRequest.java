package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoGradesGetResponse;

import java.util.Map;

public class FenxiaoGradesGetRequest
        extends BaseTaobaoRequest<FenxiaoGradesGetResponse> {
    public String getApiMethodName() {
        return "taobao.fenxiao.grades.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoGradesGetResponse> getResponseClass() {
        return FenxiaoGradesGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


