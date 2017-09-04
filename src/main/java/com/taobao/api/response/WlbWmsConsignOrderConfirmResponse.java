package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbWmsConsignOrderConfirmResp;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsConsignOrderConfirmResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7441863727639135272L;
    @ApiField("result")
    private WlbWmsConsignOrderConfirmResp result;

    public void setResult(WlbWmsConsignOrderConfirmResp result) {
        this.result = result;
    }

    public WlbWmsConsignOrderConfirmResp getResult() {
        return this.result;
    }
}


