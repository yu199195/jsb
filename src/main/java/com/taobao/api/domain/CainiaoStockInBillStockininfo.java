package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class CainiaoStockInBillStockininfo
        extends TaobaoObject {
    private static final long serialVersionUID = 1736482326189878116L;
    @ApiField("cn_order_code")
    private String cnOrderCode;
    @ApiField("confirm_time")
    private Date confirmTime;
    @ApiField("order_code")
    private String orderCode;
    @ApiListField("order_item_list")
    @ApiField("cainiao_stock_in_bill_orderitemlist")
    private List<CainiaoStockInBillOrderitemlist> orderItemList;
    @ApiField("order_type")
    private Long orderType;
    @ApiField("status")
    private String status;

    public String getCnOrderCode() {
        return this.cnOrderCode;
    }

    public void setCnOrderCode(String cnOrderCode) {
        this.cnOrderCode = cnOrderCode;
    }

    public Date getConfirmTime() {
        return this.confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public List<CainiaoStockInBillOrderitemlist> getOrderItemList() {
        return this.orderItemList;
    }

    public void setOrderItemList(List<CainiaoStockInBillOrderitemlist> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


