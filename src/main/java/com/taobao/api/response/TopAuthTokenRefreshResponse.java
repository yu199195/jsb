package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TopAuthTokenRefreshResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2713656982545932245L;
    @ApiField("token_result")
    private String tokenResult;

    public void setTokenResult(String tokenResult) {
        this.tokenResult = tokenResult;
    }

    public String getTokenResult() {
        return this.tokenResult;
    }
}


