package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDistributorsGetResponse;

import java.util.Map;

public class FenxiaoDistributorsGetRequest
        extends BaseTaobaoRequest<FenxiaoDistributorsGetResponse> {
    private String nicks;

    public void setNicks(String nicks) {
        this.nicks = nicks;
    }

    public String getNicks() {
        return this.nicks;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.distributors.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nicks", this.nicks);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoDistributorsGetResponse> getResponseClass() {
        return FenxiaoDistributorsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.nicks, "nicks");
    }
}


