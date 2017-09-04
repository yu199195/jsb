package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Productitemswlbwmsstockpruductprocessingnotify
        extends TaobaoObject {
    private static final long serialVersionUID = 4471872481875873523L;
    @ApiField("order_item")
    private Orderitemwlbwmsstockpruductprocessingnotify orderItem;

    public Orderitemwlbwmsstockpruductprocessingnotify getOrderItem() {
        return this.orderItem;
    }

    public void setOrderItem(Orderitemwlbwmsstockpruductprocessingnotify orderItem) {
        this.orderItem = orderItem;
    }
}


