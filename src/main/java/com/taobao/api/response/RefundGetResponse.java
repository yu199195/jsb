package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Refund;
import com.taobao.api.internal.mapping.ApiField;

public class RefundGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6448287398939797698L;
    @ApiField("refund")
    private Refund refund;

    public void setRefund(Refund refund) {
        this.refund = refund;
    }

    public Refund getRefund() {
        return this.refund;
    }
}


