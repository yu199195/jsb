package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsOrderStatusUpload
        extends TaobaoObject {
    private static final long serialVersionUID = 4899536786125332311L;
    @ApiField("content")
    private String content;
    @ApiField("features")
    private String features;
    @ApiField("operate_date")
    private String operateDate;
    @ApiField("operator")
    private String operator;
    @ApiField("operator_contact")
    private String operatorContact;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("order_type")
    private String orderType;
    @ApiField("remark")
    private String remark;
    @ApiField("status")
    private String status;
    @ApiField("store_order_code")
    private String storeOrderCode;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFeatures() {
        return this.features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getOperateDate() {
        return this.operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatorContact() {
        return this.operatorContact;
    }

    public void setOperatorContact(String operatorContact) {
        this.operatorContact = operatorContact;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStoreOrderCode() {
        return this.storeOrderCode;
    }

    public void setStoreOrderCode(String storeOrderCode) {
        this.storeOrderCode = storeOrderCode;
    }
}


