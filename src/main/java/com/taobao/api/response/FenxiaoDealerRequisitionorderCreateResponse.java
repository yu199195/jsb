package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class FenxiaoDealerRequisitionorderCreateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5276788882869587634L;
    @ApiField("dealer_order_id")
    private Long dealerOrderId;

    public void setDealerOrderId(Long dealerOrderId) {
        this.dealerOrderId = dealerOrderId;
    }

    public Long getDealerOrderId() {
        return this.dealerOrderId;
    }
}


