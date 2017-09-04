package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class OrderWarehouseRouteGetItems
        extends TaobaoObject {
    private static final long serialVersionUID = 6363913824658777671L;
    @ApiField("item")
    private OrderWarehouseRouteGetItem item;

    public OrderWarehouseRouteGetItem getItem() {
        return this.item;
    }

    public void setItem(OrderWarehouseRouteGetItem item) {
        this.item = item;
    }
}


