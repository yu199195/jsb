package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WlbItemInventory
        extends TaobaoObject {
    private static final long serialVersionUID = 3881573762689473417L;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("lock_quantity")
    private Long lockQuantity;
    @ApiField("quantity")
    private Long quantity;
    @ApiField("store_code")
    private String storeCode;
    @ApiField("type")
    private String type;

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getLockQuantity() {
        return this.lockQuantity;
    }

    public void setLockQuantity(Long lockQuantity) {
        this.lockQuantity = lockQuantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


