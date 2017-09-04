package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class WlbProcessStatus
        extends TaobaoObject {
    private static final long serialVersionUID = 8528429932983857686L;
    @ApiField("content")
    private String content;
    @ApiField("operate_time")
    private Date operateTime;
    @ApiField("operater")
    private String operater;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("remark")
    private String remark;
    @ApiField("status_code")
    private String statusCode;
    @ApiField("store_code")
    private String storeCode;
    @ApiField("store_tp_code")
    private String storeTpCode;
    @ApiField("tms_order_code")
    private String tmsOrderCode;
    @ApiField("tms_tp_code")
    private String tmsTpCode;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getOperateTime() {
        return this.operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperater() {
        return this.operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreTpCode() {
        return this.storeTpCode;
    }

    public void setStoreTpCode(String storeTpCode) {
        this.storeTpCode = storeTpCode;
    }

    public String getTmsOrderCode() {
        return this.tmsOrderCode;
    }

    public void setTmsOrderCode(String tmsOrderCode) {
        this.tmsOrderCode = tmsOrderCode;
    }

    public String getTmsTpCode() {
        return this.tmsTpCode;
    }

    public void setTmsTpCode(String tmsTpCode) {
        this.tmsTpCode = tmsTpCode;
    }
}


