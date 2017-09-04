package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallItemOuteridUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5715561272246523856L;
    @ApiField("outerid_update_result")
    private String outeridUpdateResult;

    public void setOuteridUpdateResult(String outeridUpdateResult) {
        this.outeridUpdateResult = outeridUpdateResult;
    }

    public String getOuteridUpdateResult() {
        return this.outeridUpdateResult;
    }
}


