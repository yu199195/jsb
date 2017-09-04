package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class UserInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 8469259577548756345L;
    @ApiField("available_space")
    private String availableSpace;
    @ApiField("free_space")
    private String freeSpace;
    @ApiField("order_expiry_date")
    private String orderExpiryDate;
    @ApiField("order_space")
    private String orderSpace;
    @ApiField("remaining_space")
    private String remainingSpace;
    @ApiField("used_space")
    private String usedSpace;
    @ApiField("water_mark")
    private String waterMark;

    public String getAvailableSpace() {
        return this.availableSpace;
    }

    public void setAvailableSpace(String availableSpace) {
        this.availableSpace = availableSpace;
    }

    public String getFreeSpace() {
        return this.freeSpace;
    }

    public void setFreeSpace(String freeSpace) {
        this.freeSpace = freeSpace;
    }

    public String getOrderExpiryDate() {
        return this.orderExpiryDate;
    }

    public void setOrderExpiryDate(String orderExpiryDate) {
        this.orderExpiryDate = orderExpiryDate;
    }

    public String getOrderSpace() {
        return this.orderSpace;
    }

    public void setOrderSpace(String orderSpace) {
        this.orderSpace = orderSpace;
    }

    public String getRemainingSpace() {
        return this.remainingSpace;
    }

    public void setRemainingSpace(String remainingSpace) {
        this.remainingSpace = remainingSpace;
    }

    public String getUsedSpace() {
        return this.usedSpace;
    }

    public void setUsedSpace(String usedSpace) {
        this.usedSpace = usedSpace;
    }

    public String getWaterMark() {
        return this.waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}


