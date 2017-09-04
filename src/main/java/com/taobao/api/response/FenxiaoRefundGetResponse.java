package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RefundDetail;
import com.taobao.api.internal.mapping.ApiField;

public class FenxiaoRefundGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6778678441555879241L;
    @ApiField("refund_detail")
    private RefundDetail refundDetail;

    public void setRefundDetail(RefundDetail refundDetail) {
        this.refundDetail = refundDetail;
    }

    public RefundDetail getRefundDetail() {
        return this.refundDetail;
    }
}


