package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WaybillApplyCancelRequest
        extends TaobaoObject {
    private static final long serialVersionUID = 7687342655192286585L;
    @ApiField("app_key")
    private String appKey;
    @ApiField("cp_code")
    private String cpCode;
    @ApiField("package_id")
    private String packageId;
    @ApiField("real_user_id")
    private Long realUserId;
    @ApiField("seller_id")
    private Long sellerId;
    @ApiListField("trade_order_list")
    @ApiField("string")
    private List<String> tradeOrderList;
    @ApiField("waybill_code")
    private String waybillCode;

    public String getAppKey() {
        return this.appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getCpCode() {
        return this.cpCode;
    }

    public void setCpCode(String cpCode) {
        this.cpCode = cpCode;
    }

    public String getPackageId() {
        return this.packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public Long getRealUserId() {
        return this.realUserId;
    }

    public void setRealUserId(Long realUserId) {
        this.realUserId = realUserId;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public List<String> getTradeOrderList() {
        return this.tradeOrderList;
    }

    public void setTradeOrderList(List<String> tradeOrderList) {
        this.tradeOrderList = tradeOrderList;
    }

    public String getWaybillCode() {
        return this.waybillCode;
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }
}


