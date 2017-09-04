package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Refund;
import com.taobao.api.internal.mapping.ApiField;

public class RefundRefuseResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7134155377459317553L;
    @ApiField("is_success")
    private Boolean isSuccess;
    @ApiField("refund")
    private Refund refund;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setRefund(Refund refund) {
        this.refund = refund;
    }

    public Refund getRefund() {
        return this.refund;
    }
}


