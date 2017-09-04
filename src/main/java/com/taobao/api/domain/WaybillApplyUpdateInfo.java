package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WaybillApplyUpdateInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 7545218893192582432L;
    @ApiField("consignee_branch_code")
    private String consigneeBranchCode;
    @ApiField("consignee_branch_name")
    private String consigneeBranchName;
    @ApiField("desc")
    private String desc;
    @ApiField("package_center_code")
    private String packageCenterCode;
    @ApiField("package_center_name")
    private String packageCenterName;
    @ApiField("result")
    private Long result;
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

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public Long getResult() {
        return this.result;
    }

    public void setResult(Long result) {
        this.result = result;
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


