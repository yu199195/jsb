package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoConsignOutstockOrderitemlist
        extends TaobaoObject {
    private static final long serialVersionUID = 2399835633145818224L;
    @ApiField("order_item")
    private CainiaoConsignOutstockOrderitem orderItem;

    public CainiaoConsignOutstockOrderitem getOrderItem() {
        return this.orderItem;
    }

    public void setOrderItem(CainiaoConsignOutstockOrderitem orderItem) {
        this.orderItem = orderItem;
    }
}


