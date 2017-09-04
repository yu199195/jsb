package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WaybillApplyRequest
        extends TaobaoObject {
    private static final long serialVersionUID = 4223499625832332798L;
    @ApiField("app_key")
    private String appKey;
    @ApiField("cp_code")
    private String cpCode;
    @ApiField("seller_id")
    private Long sellerId;
    @ApiField("shipping_address")
    private WaybillAddress shippingAddress;

    public String getAppKey() {
        return this.appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getCpCode() {
        return this.cpCode;
    }

    public void setCpCode(String cpCode) {
        this.cpCode = cpCode;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public WaybillAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public void setShippingAddress(WaybillAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}


