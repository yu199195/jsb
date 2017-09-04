package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoInventoryProfitlossOrderitemlist
        extends TaobaoObject {
    private static final long serialVersionUID = 7283195871187668174L;
    @ApiField("order_item")
    private CainiaoInventoryProfitlossOrderitem orderItem;

    public CainiaoInventoryProfitlossOrderitem getOrderItem() {
        return this.orderItem;
    }

    public void setOrderItem(CainiaoInventoryProfitlossOrderitem orderItem) {
        this.orderItem = orderItem;
    }
}


