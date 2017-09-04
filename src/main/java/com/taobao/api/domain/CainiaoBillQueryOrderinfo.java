package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class CainiaoBillQueryOrderinfo
        extends TaobaoObject {
    private static final long serialVersionUID = 5819513393593812813L;
    @ApiField("cn_order_code")
    private String cnOrderCode;
    @ApiField("modified_time")
    private Date modifiedTime;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("order_source")
    private String orderSource;
    @ApiListField("order_source_codes")
    @ApiField("string")
    private List<String> orderSourceCodes;
    @ApiField("order_type")
    private Long orderType;
    @ApiField("remark")
    private String remark;
    @ApiField("status")
    private String status;
    @ApiField("store_code")
    private String storeCode;

    public String getCnOrderCode() {
        return this.cnOrderCode;
    }

    public void setCnOrderCode(String cnOrderCode) {
        this.cnOrderCode = cnOrderCode;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderSource() {
        return this.orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public List<String> getOrderSourceCodes() {
        return this.orderSourceCodes;
    }

    public void setOrderSourceCodes(List<String> orderSourceCodes) {
        this.orderSourceCodes = orderSourceCodes;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setOrderType(Long orderType) {
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

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }
}


