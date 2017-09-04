package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoGradeAddResponse;

import java.util.Map;

public class FenxiaoGradeAddRequest
        extends BaseTaobaoRequest<FenxiaoGradeAddResponse> {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.grade.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("name", this.name);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoGradeAddResponse> getResponseClass() {
        return FenxiaoGradeAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.name, "name");
        RequestCheckUtils.checkMaxLength(this.name, 20, "name");
    }
}


