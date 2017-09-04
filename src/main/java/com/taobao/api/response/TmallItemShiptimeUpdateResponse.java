package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallItemShiptimeUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2686286718252119629L;
    @ApiField("shiptime_update_result")
    private String shiptimeUpdateResult;

    public void setShiptimeUpdateResult(String shiptimeUpdateResult) {
        this.shiptimeUpdateResult = shiptimeUpdateResult;
    }

    public String getShiptimeUpdateResult() {
        return this.shiptimeUpdateResult;
    }
}


