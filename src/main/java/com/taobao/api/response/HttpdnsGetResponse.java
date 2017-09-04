package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class HttpdnsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8534935426599452538L;
    @ApiField("result")
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }
}


