package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopAuthTokenRefreshResponse;

import java.util.Map;

public class TopAuthTokenRefreshRequest
        extends BaseTaobaoRequest<TopAuthTokenRefreshResponse> {
    private String refreshToken;

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String getApiMethodName() {
        return "taobao.top.auth.token.refresh";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("refresh_token", this.refreshToken);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TopAuthTokenRefreshResponse> getResponseClass() {
        return TopAuthTokenRefreshResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.refreshToken, "refreshToken");
    }
}


