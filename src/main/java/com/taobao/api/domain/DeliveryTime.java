package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class DeliveryTime
        extends TaobaoObject {
    private static final long serialVersionUID = 1436933426236434636L;
    @ApiField("delivery_time")
    private String deliveryTime;
    @ApiField("delivery_time_type")
    private String deliveryTimeType;
    @ApiField("need_delivery_time")
    private String needDeliveryTime;
    @ApiField("onsale_auto_refund_ratio")
    private Long onsaleAutoRefundRatio;
    @ApiListField("skus_delivery_time_list")
    @ApiField("skus_delivery_time")
    private List<SkusDeliveryTime> skusDeliveryTimeList;

    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryTimeType() {
        return this.deliveryTimeType;
    }

    public void setDeliveryTimeType(String deliveryTimeType) {
        this.deliveryTimeType = deliveryTimeType;
    }

    public String getNeedDeliveryTime() {
        return this.needDeliveryTime;
    }

    public void setNeedDeliveryTime(String needDeliveryTime) {
        this.needDeliveryTime = needDeliveryTime;
    }

    public Long getOnsaleAutoRefundRatio() {
        return this.onsaleAutoRefundRatio;
    }

    public void setOnsaleAutoRefundRatio(Long onsaleAutoRefundRatio) {
        this.onsaleAutoRefundRatio = onsaleAutoRefundRatio;
    }

    public List<SkusDeliveryTime> getSkusDeliveryTimeList() {
        return this.skusDeliveryTimeList;
    }

    public void setSkusDeliveryTimeList(List<SkusDeliveryTime> skusDeliveryTimeList) {
        this.skusDeliveryTimeList = skusDeliveryTimeList;
    }
}


