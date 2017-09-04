package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoStockInBillInventoryitemlist
        extends TaobaoObject {
    private static final long serialVersionUID = 1311334382255834479L;
    @ApiField("inventory_item")
    private CainiaoStockInBillInventoryitem inventoryItem;

    public CainiaoStockInBillInventoryitem getInventoryItem() {
        return this.inventoryItem;
    }

    public void setInventoryItem(CainiaoStockInBillInventoryitem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
}


