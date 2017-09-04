package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoStockInBillOrderitemlist
        extends TaobaoObject {
    private static final long serialVersionUID = 6593512587737772816L;
    @ApiField("order_item")
    private CainiaoStockInBillOrderitem orderItem;

    public CainiaoStockInBillOrderitem getOrderItem() {
        return this.orderItem;
    }

    public void setOrderItem(CainiaoStockInBillOrderitem orderItem) {
        this.orderItem = orderItem;
    }
}


