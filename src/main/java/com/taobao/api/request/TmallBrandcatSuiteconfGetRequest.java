package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallBrandcatSuiteconfGetResponse;

import java.util.Map;

public class TmallBrandcatSuiteconfGetRequest
        extends BaseTaobaoRequest<TmallBrandcatSuiteconfGetResponse> {
    public String getApiMethodName() {
        return "tmall.brandcat.suiteconf.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallBrandcatSuiteconfGetResponse> getResponseClass() {
        return TmallBrandcatSuiteconfGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


