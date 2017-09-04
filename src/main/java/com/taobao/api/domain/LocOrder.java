package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class LocOrder
        extends TaobaoObject {
    private static final long serialVersionUID = 2385325956422569973L;
    @ApiField("carrier")
    private String carrier;
    @ApiField("currency")
    private String currency;
    @ApiField("customs_fee")
    private Long customsFee;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("shipping_fee")
    private Long shippingFee;
    @ApiField("status_code")
    private String statusCode;
    @ApiField("status_code_desc")
    private String statusCodeDesc;
    @ApiField("tracking_no")
    private String trackingNo;
    @ApiField("trade_id")
    private Long tradeId;
    @ApiField("weight")
    private Long weight;
    @ApiField("weight_unit")
    private String weightUnit;

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getCustomsFee() {
        return this.customsFee;
    }

    public void setCustomsFee(Long customsFee) {
        this.customsFee = customsFee;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Long getShippingFee() {
        return this.shippingFee;
    }

    public void setShippingFee(Long shippingFee) {
        this.shippingFee = shippingFee;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusCodeDesc() {
        return this.statusCodeDesc;
    }

    public void setStatusCodeDesc(String statusCodeDesc) {
        this.statusCodeDesc = statusCodeDesc;
    }

    public String getTrackingNo() {
        return this.trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public Long getTradeId() {
        return this.tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Long getWeight() {
        return this.weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return this.weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }
}


