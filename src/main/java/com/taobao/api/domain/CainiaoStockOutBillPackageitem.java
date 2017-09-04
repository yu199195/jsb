package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoStockOutBillPackageitem
        extends TaobaoObject {
    private static final long serialVersionUID = 2242775528525616969L;
    @ApiField("inventory_type")
    private Long inventoryType;
    @ApiField("item_code")
    private String itemCode;
    @ApiField("item_id")
    private String itemId;
    @ApiField("item_qty")
    private Long itemQty;
    @ApiField("order_item_id")
    private String orderItemId;

    public Long getInventoryType() {
        return this.inventoryType;
    }

    public void setInventoryType(Long inventoryType) {
        this.inventoryType = inventoryType;
    }

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

    public Long getItemQty() {
        return this.itemQty;
    }

    public void setItemQty(Long itemQty) {
        this.itemQty = itemQty;
    }

    public String getOrderItemId() {
        return this.orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }
}


