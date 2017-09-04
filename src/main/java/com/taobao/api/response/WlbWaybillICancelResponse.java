package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWaybillICancelResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5182111476782995465L;
    @ApiField("cancel_result")
    private Boolean cancelResult;

    public void setCancelResult(Boolean cancelResult) {
        this.cancelResult = cancelResult;
    }

    public Boolean getCancelResult() {
        return this.cancelResult;
    }
}


