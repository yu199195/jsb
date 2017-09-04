package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WlbInventory
        extends TaobaoObject {
    private static final long serialVersionUID = 1753763825226765345L;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("lock_quantity")
    private Long lockQuantity;
    @ApiField("occupy_quantity")
    private Long occupyQuantity;
    @ApiField("quantity")
    private Long quantity;
    @ApiField("reserve_quantity")
    private Long reserveQuantity;
    @ApiField("store_code")
    private String storeCode;
    @ApiField("type")
    private String type;
    @ApiField("user_id")
    private Long userId;

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

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}


