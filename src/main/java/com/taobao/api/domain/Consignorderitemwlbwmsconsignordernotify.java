package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Consignorderitemwlbwmsconsignordernotify
        extends TaobaoObject {
    private static final long serialVersionUID = 8379343185183644371L;
    @ApiField("item_code")
    private String itemCode;
    @ApiField("item_id")
    private String itemId;
    @ApiField("item_quantity")
    private Long itemQuantity;
    @ApiField("order_item_id")
    private String orderItemId;

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Long getItemQuantity() {
        return this.itemQuantity;
    }

    public void setItemQuantity(Long itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getOrderItemId() {
        return this.orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }
}


