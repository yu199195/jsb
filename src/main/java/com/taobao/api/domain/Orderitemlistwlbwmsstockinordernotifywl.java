package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Orderitemlistwlbwmsstockinordernotifywl
        extends TaobaoObject {
    private static final long serialVersionUID = 4526481964561597853L;
    @ApiField("order_item")
    private Orderitemwlbwmsstockinordernotifywl orderItem;

    public Orderitemwlbwmsstockinordernotifywl getOrderItem() {
        return this.orderItem;
    }

    public void setOrderItem(Orderitemwlbwmsstockinordernotifywl orderItem) {
        this.orderItem = orderItem;
    }
}


