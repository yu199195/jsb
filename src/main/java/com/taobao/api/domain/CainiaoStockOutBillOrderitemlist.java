package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoStockOutBillOrderitemlist
        extends TaobaoObject {
    private static final long serialVersionUID = 8346295543645667936L;
    @ApiField("order_item")
    private CainiaoStockOutBillOrderitem orderItem;

    public CainiaoStockOutBillOrderitem getOrderItem() {
        return this.orderItem;
    }

    public void setOrderItem(CainiaoStockOutBillOrderitem orderItem) {
        this.orderItem = orderItem;
    }
}


