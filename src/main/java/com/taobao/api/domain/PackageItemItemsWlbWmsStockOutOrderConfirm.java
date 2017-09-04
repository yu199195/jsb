package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class PackageItemItemsWlbWmsStockOutOrderConfirm
        extends TaobaoObject {
    private static final long serialVersionUID = 2474855538732652525L;
    @ApiField("item_id")
    private String itemId;
    @ApiField("item_quantity")
    private Long itemQuantity;

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
}


