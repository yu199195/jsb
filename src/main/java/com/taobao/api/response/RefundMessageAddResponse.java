package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RefundMessage;
import com.taobao.api.internal.mapping.ApiField;

public class RefundMessageAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8445891869735266465L;
    @ApiField("refund_message")
    private RefundMessage refundMessage;

    public void setRefundMessage(RefundMessage refundMessage) {
        this.refundMessage = refundMessage;
    }

    public RefundMessage getRefundMessage() {
        return this.refundMessage;
    }
}


