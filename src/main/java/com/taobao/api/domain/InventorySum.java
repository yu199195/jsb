package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class InventorySum
        extends TaobaoObject {
    private static final long serialVersionUID = 5182647863628932452L;
    @ApiField("inventory_type")
    private Long inventoryType;
    @ApiField("inventory_type_name")
    private String inventoryTypeName;
    @ApiField("occupy_quantity")
    private Long occupyQuantity;
    @ApiField("quantity")
    private Long quantity;
    @ApiField("reserve_quantity")
    private Long reserveQuantity;
    @ApiField("sc_item_code")
    private String scItemCode;
    @ApiField("sc_item_id")
    private Long scItemId;
    @ApiField("store_code")
    private String storeCode;

    public Long getInventoryType() {
        return this.inventoryType;
    }

    public void setInventoryType(Long inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getInventoryTypeName() {
        return this.inventoryTypeName;
    }

    public void setInventoryTypeName(String inventoryTypeName) {
        this.inventoryTypeName = inventoryTypeName;
    }

    public Long getOccupyQuantity() {
        return this.occupyQuantity;
    }

    public void setOccupyQuantity(Long occupyQuantity) {
        this.occupyQuantity = occupyQuantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getReserveQuantity() {
        return this.reserveQuantity;
    }

    public void setReserveQuantity(Long reserveQuantity) {
        this.reserveQuantity = reserveQuantity;
    }

    public String getScItemCode() {
        return this.scItemCode;
    }

    public void setScItemCode(String scItemCode) {
        this.scItemCode = scItemCode;
    }

    public Long getScItemId() {
        return this.scItemId;
    }

    public void setScItemId(Long scItemId) {
        this.scItemId = scItemId;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }
}


