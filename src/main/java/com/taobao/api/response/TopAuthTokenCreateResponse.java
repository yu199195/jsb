package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TopAuthTokenCreateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4314634931798843179L;
    @ApiField("token_result")
    private String tokenResult;

    public void setTokenResult(String tokenResult) {
        this.tokenResult = tokenResult;
    }

    public String getTokenResult() {
        return this.tokenResult;
    }
}


