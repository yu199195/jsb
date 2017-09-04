package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Materialitemswlbwmsstockpruductprocessingnotify
        extends TaobaoObject {
    private static final long serialVersionUID = 5749372865136355116L;
    @ApiField("order_item")
    private Orderitemwlbwmsstockpruductprocessingnotify orderItem;

    public Orderitemwlbwmsstockpruductprocessingnotify getOrderItem() {
        return this.orderItem;
    }

    public void setOrderItem(Orderitemwlbwmsstockpruductprocessingnotify orderItem) {
        this.orderItem = orderItem;
    }
}


