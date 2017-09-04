package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbWmsStockOutOrderConfirmResp;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsStockOutOrderConfirmResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6241697759488975943L;
    @ApiField("result")
    private WlbWmsStockOutOrderConfirmResp result;

    public void setResult(WlbWmsStockOutOrderConfirmResp result) {
        this.result = result;
    }

    public WlbWmsStockOutOrderConfirmResp getResult() {
        return this.result;
    }
}


