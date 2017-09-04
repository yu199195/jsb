package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class CainiaoConsignOutstockOutstockinfo
        extends TaobaoObject {
    private static final long serialVersionUID = 6625457248522736265L;
    @ApiField("cn_order_code")
    private String cnOrderCode;
    @ApiField("created_time")
    private Date createdTime;
    @ApiField("order_code")
    private String orderCode;
    @ApiListField("order_item_list")
    @ApiField("cainiao_consign_outstock_orderitemlist")
    private List<CainiaoConsignOutstockOrderitemlist> orderItemList;
    @ApiField("store_code")
    private String storeCode;

    public String getCnOrderCode() {
        return this.cnOrderCode;
    }

    public void setCnOrderCode(String cnOrderCode) {
        this.cnOrderCode = cnOrderCode;
    }

    public Date getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public List<CainiaoConsignOutstockOrderitemlist> getOrderItemList() {
        return this.orderItemList;
    }

    public void setOrderItemList(List<CainiaoConsignOutstockOrderitemlist> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }
}


