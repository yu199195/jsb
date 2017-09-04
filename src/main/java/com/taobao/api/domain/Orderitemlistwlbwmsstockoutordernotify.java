package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Orderitemlistwlbwmsstockoutordernotify
        extends TaobaoObject {
    private static final long serialVersionUID = 3443744366756551621L;
    @ApiField("order_item")
    private Orderitemwlbwmsstockoutordernotify orderItem;

    public Orderitemwlbwmsstockoutordernotify getOrderItem() {
        return this.orderItem;
    }

    public void setOrderItem(Orderitemwlbwmsstockoutordernotify orderItem) {
        this.orderItem = orderItem;
    }
}


