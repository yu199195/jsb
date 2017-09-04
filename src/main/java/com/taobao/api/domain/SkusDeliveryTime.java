package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class SkusDeliveryTime
        extends TaobaoObject {
    private static final long serialVersionUID = 5517499123112614539L;
    @ApiField("sku_delivery_time")
    private String skuDeliveryTime;
    @ApiField("sku_id")
    private Long skuId;

    public String getSkuDeliveryTime() {
        return this.skuDeliveryTime;
    }

    public void setSkuDeliveryTime(String skuDeliveryTime) {
        this.skuDeliveryTime = skuDeliveryTime;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}


