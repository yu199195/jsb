package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductcatsGetResponse;

import java.util.Map;

public class FenxiaoProductcatsGetRequest
        extends BaseTaobaoRequest<FenxiaoProductcatsGetResponse> {
    private String fields;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.productcats.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoProductcatsGetResponse> getResponseClass() {
        return FenxiaoProductcatsGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


