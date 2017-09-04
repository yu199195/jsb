package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class OrderWarehouseRouteGetItem
        extends TaobaoObject {
    private static final long serialVersionUID = 5877929825919992499L;
    @ApiField("cn_order_code")
    private String cnOrderCode;
    @ApiField("item_qty")
    private Long itemQty;
    @ApiField("order_item_id")
    private String orderItemId;
    @ApiField("rout_status")
    private String routStatus;
    @ApiField("store_code")
    private String storeCode;

    public String getCnOrderCode() {
        return this.cnOrderCode;
    }

    public void setCnOrderCode(String cnOrderCode) {
        this.cnOrderCode = cnOrderCode;
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

    public void setOrderItemIdString(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getRoutStatus() {
        return this.routStatus;
    }

    public void setRoutStatus(String routStatus) {
        this.routStatus = routStatus;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }
}


