package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ResourceResult
        extends TaobaoObject {
    private static final long serialVersionUID = 7738163416857687353L;
    @ApiField("delivery_price")
    private DeliveryPrice deliveryPrice;
    @ApiField("delivery_time")
    private Long deliveryTime;
    @ApiField("res_code")
    private String resCode;
    @ApiField("res_id")
    private Long resId;
    @ApiField("resource_name")
    private String resourceName;

    public DeliveryPrice getDeliveryPrice() {
        return this.deliveryPrice;
    }

    public void setDeliveryPrice(DeliveryPrice deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Long getDeliveryTime() {
        return this.deliveryTime;
    }

    public void setDeliveryTime(Long deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getResCode() {
        return this.resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public Long getResId() {
        return this.resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public String getResourceName() {
        return this.resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}


