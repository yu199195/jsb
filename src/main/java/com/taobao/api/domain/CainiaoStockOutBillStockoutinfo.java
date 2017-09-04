package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class CainiaoStockOutBillStockoutinfo
        extends TaobaoObject {
    private static final long serialVersionUID = 4382531234927187137L;
    @ApiField("cn_order_code")
    private String cnOrderCode;
    @ApiField("confirm_time")
    private Date confirmTime;
    @ApiField("order_code")
    private String orderCode;
    @ApiListField("order_item_list")
    @ApiField("cainiao_stock_out_bill_orderitemlist")
    private List<CainiaoStockOutBillOrderitemlist> orderItemList;
    @ApiField("order_type")
    private Long orderType;
    @ApiListField("package_info_list")
    @ApiField("cainiao_stock_out_bill_packageinfolist")
    private List<CainiaoStockOutBillPackageinfolist> packageInfoList;
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

    public List<CainiaoStockOutBillOrderitemlist> getOrderItemList() {
        return this.orderItemList;
    }

    public void setOrderItemList(List<CainiaoStockOutBillOrderitemlist> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public List<CainiaoStockOutBillPackageinfolist> getPackageInfoList() {
        return this.packageInfoList;
    }

    public void setPackageInfoList(List<CainiaoStockOutBillPackageinfolist> packageInfoList) {
        this.packageInfoList = packageInfoList;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


