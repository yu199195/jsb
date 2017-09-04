package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Consignorderitemlistwlbwmsconsignordernotify
        extends TaobaoObject {
    private static final long serialVersionUID = 3887463772998944951L;
    @ApiField("consign_order_item")
    private Consignorderitemwlbwmsconsignordernotify consignOrderItem;

    public Consignorderitemwlbwmsconsignordernotify getConsignOrderItem() {
        return this.consignOrderItem;
    }

    public void setConsignOrderItem(Consignorderitemwlbwmsconsignordernotify consignOrderItem) {
        this.consignOrderItem = consignOrderItem;
    }
}


