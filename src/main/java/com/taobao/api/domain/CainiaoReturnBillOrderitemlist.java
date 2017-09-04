package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoReturnBillOrderitemlist
        extends TaobaoObject {
    private static final long serialVersionUID = 2373653947389715453L;
    @ApiField("order_item")
    private CainiaoReturnBillOrderitem orderItem;

    public CainiaoReturnBillOrderitem getOrderItem() {
        return this.orderItem;
    }

    public void setOrderItem(CainiaoReturnBillOrderitem orderItem) {
        this.orderItem = orderItem;
    }
}


