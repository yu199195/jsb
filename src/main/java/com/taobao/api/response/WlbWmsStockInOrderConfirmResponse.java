package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Responsewlbwmsstockinorderconfirm;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsStockInOrderConfirmResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5139751517528398479L;
    @ApiField("result")
    private Responsewlbwmsstockinorderconfirm result;

    public void setResult(Responsewlbwmsstockinorderconfirm result) {
        this.result = result;
    }

    public Responsewlbwmsstockinorderconfirm getResult() {
        return this.result;
    }
}


