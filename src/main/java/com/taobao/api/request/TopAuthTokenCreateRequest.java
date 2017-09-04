package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopAuthTokenCreateResponse;

import java.util.Map;

public class TopAuthTokenCreateRequest
        extends BaseTaobaoRequest<TopAuthTokenCreateResponse> {
    private String code;
    private String uuid;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getApiMethodName() {
        return "taobao.top.auth.token.create";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("code", this.code);
        txtParams.put("uuid", this.uuid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TopAuthTokenCreateResponse> getResponseClass() {
        return TopAuthTokenCreateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.code, "code");
    }
}


