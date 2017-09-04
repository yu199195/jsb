package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoReturnBillInventoryitemlist
        extends TaobaoObject {
    private static final long serialVersionUID = 4445525336168135727L;
    @ApiField("inventory_item")
    private CainiaoReturnBillInventoryitem inventoryItem;

    public CainiaoReturnBillInventoryitem getInventoryItem() {
        return this.inventoryItem;
    }

    public void setInventoryItem(CainiaoReturnBillInventoryitem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
}


