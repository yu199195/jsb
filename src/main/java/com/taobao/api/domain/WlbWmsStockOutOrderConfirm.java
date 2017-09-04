package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsStockOutOrderConfirm
        extends TaobaoObject {
    private static final long serialVersionUID = 4486642562176647641L;
    @ApiField("carriers_name")
    private String carriersName;
    @ApiField("confirm_type")
    private Long confirmType;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("order_confirm_time")
    private String orderConfirmTime;
    @ApiField("order_items")
    private OrderItemsWlbWmsStockOutOrderConfirm orderItems;
    @ApiField("order_type")
    private Long orderType;
    @ApiField("out_biz_code")
    private String outBizCode;
    @ApiField("package_infos")
    private PackageInfosWlbWmsStockOutOrderConfirm packageInfos;
    @ApiField("store_order_code")
    private String storeOrderCode;
    @ApiField("tms_order_code")
    private String tmsOrderCode;
    @ApiField("total_package_qty")
    private Long totalPackageQty;
    @ApiField("total_package_volume")
    private Long totalPackageVolume;
    @ApiField("total_package_weight")
    private Long totalPackageWeight;

    public String getCarriersName() {
        return this.carriersName;
    }

    public void setCarriersName(String carriersName) {
        this.carriersName = carriersName;
    }

    public Long getConfirmType() {
        return this.confirmType;
    }

    public void setConfirmType(Long confirmType) {
        this.confirmType = confirmType;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderConfirmTime() {
        return this.orderConfirmTime;
    }

    public void setOrderConfirmTime(String orderConfirmTime) {
        this.orderConfirmTime = orderConfirmTime;
    }

    public OrderItemsWlbWmsStockOutOrderConfirm getOrderItems() {
        return this.orderItems;
    }

    public void setOrderItems(OrderItemsWlbWmsStockOutOrderConfirm orderItems) {
        this.orderItems = orderItems;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public String getOutBizCode() {
        return this.outBizCode;
    }

    public void setOutBizCode(String outBizCode) {
        this.outBizCode = outBizCode;
    }

    public PackageInfosWlbWmsStockOutOrderConfirm getPackageInfos() {
        return this.packageInfos;
    }

    public void setPackageInfos(PackageInfosWlbWmsStockOutOrderConfirm packageInfos) {
        this.packageInfos = packageInfos;
    }

    public String getStoreOrderCode() {
        return this.storeOrderCode;
    }

    public void setStoreOrderCode(String storeOrderCode) {
        this.storeOrderCode = storeOrderCode;
    }

    public String getTmsOrderCode() {
        return this.tmsOrderCode;
    }

    public void setTmsOrderCode(String tmsOrderCode) {
        this.tmsOrderCode = tmsOrderCode;
    }

    public Long getTotalPackageQty() {
        return this.totalPackageQty;
    }

    public void setTotalPackageQty(Long totalPackageQty) {
        this.totalPackageQty = totalPackageQty;
    }

    public Long getTotalPackageVolume() {
        return this.totalPackageVolume;
    }

    public void setTotalPackageVolume(Long totalPackageVolume) {
        this.totalPackageVolume = totalPackageVolume;
    }

    public Long getTotalPackageWeight() {
        return this.totalPackageWeight;
    }

    public void setTotalPackageWeight(Long totalPackageWeight) {
        this.totalPackageWeight = totalPackageWeight;
    }
}


