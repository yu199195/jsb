package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CainiaoReturnBillReturnorderinfo;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsReturnBillGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3759439995376544393L;
    @ApiField("return_order_info")
    private CainiaoReturnBillReturnorderinfo returnOrderInfo;

    public void setReturnOrderInfo(CainiaoReturnBillReturnorderinfo returnOrderInfo) {
        this.returnOrderInfo = returnOrderInfo;
    }

    public CainiaoReturnBillReturnorderinfo getReturnOrderInfo() {
        return this.returnOrderInfo;
    }
}


