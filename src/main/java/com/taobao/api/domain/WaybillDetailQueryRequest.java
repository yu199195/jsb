package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WaybillDetailQueryRequest
        extends TaobaoObject {
    private static final long serialVersionUID = 1628923265195197415L;
    @ApiField("app_key")
    private String appKey;
    @ApiField("cp_code")
    private String cpCode;
    @ApiField("query_by")
    private Long queryBy;
    @ApiField("seller_id")
    private Long sellerId;
    @ApiListField("trade_order_list")
    @ApiField("string")
    private List<String> tradeOrderList;
    @ApiListField("waybill_codes")
    @ApiField("string")
    private List<String> waybillCodes;

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

    public Long getQueryBy() {
        return this.queryBy;
    }

    public void setQueryBy(Long queryBy) {
        this.queryBy = queryBy;
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

    public List<String> getWaybillCodes() {
        return this.waybillCodes;
    }

    public void setWaybillCodes(List<String> waybillCodes) {
        this.waybillCodes = waybillCodes;
    }
}


