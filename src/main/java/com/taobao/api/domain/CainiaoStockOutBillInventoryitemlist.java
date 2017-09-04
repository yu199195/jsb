package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoStockOutBillInventoryitemlist
        extends TaobaoObject {
    private static final long serialVersionUID = 6351695419456678983L;
    @ApiField("inventory_item")
    private CainiaoStockOutBillInventoryitem inventoryItem;

    public CainiaoStockOutBillInventoryitem getInventoryItem() {
        return this.inventoryItem;
    }

    public void setInventoryItem(CainiaoStockOutBillInventoryitem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
}


