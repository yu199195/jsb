package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WaybillApplyNewInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 8234972817143155682L;
    @ApiField("consignee_branch_code")
    private String consigneeBranchCode;
    @ApiField("consignee_branch_name")
    private String consigneeBranchName;
    @ApiField("feature")
    private String feature;
    @ApiField("package_center_code")
    private String packageCenterCode;
    @ApiField("package_center_name")
    private String packageCenterName;
    @ApiField("print_config")
    private String printConfig;
    @ApiField("result")
    private Long result;
    @ApiField("shipping_branch_code")
    private String shippingBranchCode;
    @ApiField("shipping_branch_name")
    private String shippingBranchName;
    @ApiField("short_address")
    private String shortAddress;
    @ApiField("trade_order_info")
    private TradeOrderInfo tradeOrderInfo;
    @ApiField("waybill_code")
    private String waybillCode;

    public String getConsigneeBranchCode() {
        return this.consigneeBranchCode;
    }

    public void setConsigneeBranchCode(String consigneeBranchCode) {
        this.consigneeBranchCode = consigneeBranchCode;
    }

    public String getConsigneeBranchName() {
        return this.consigneeBranchName;
    }

    public void setConsigneeBranchName(String consigneeBranchName) {
        this.consigneeBranchName = consigneeBranchName;
    }

    public String getFeature() {
        return this.feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public void setFeatureString(String feature) {
        this.feature = feature;
    }

    public String getPackageCenterCode() {
        return this.packageCenterCode;
    }

    public void setPackageCenterCode(String packageCenterCode) {
        this.packageCenterCode = packageCenterCode;
    }

    public String getPackageCenterName() {
        return this.packageCenterName;
    }

    public void setPackageCenterName(String packageCenterName) {
        this.packageCenterName = packageCenterName;
    }

    public String getPrintConfig() {
        return this.printConfig;
    }

    public void setPrintConfig(String printConfig) {
        this.printConfig = printConfig;
    }

    public Long getResult() {
        return this.result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public String getShippingBranchCode() {
        return this.shippingBranchCode;
    }

    public void setShippingBranchCode(String shippingBranchCode) {
        this.shippingBranchCode = shippingBranchCode;
    }

    public String getShippingBranchName() {
        return this.shippingBranchName;
    }

    public void setShippingBranchName(String shippingBranchName) {
        this.shippingBranchName = shippingBranchName;
    }

    public String getShortAddress() {
        return this.shortAddress;
    }

    public void setShortAddress(String shortAddress) {
        this.shortAddress = shortAddress;
    }

    public TradeOrderInfo getTradeOrderInfo() {
        return this.tradeOrderInfo;
    }

    public void setTradeOrderInfo(TradeOrderInfo tradeOrderInfo) {
        this.tradeOrderInfo = tradeOrderInfo;
    }

    public String getWaybillCode() {
        return this.waybillCode;
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }
}


