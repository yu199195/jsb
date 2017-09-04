package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WlbReplenish
        extends TaobaoObject {
    private static final long serialVersionUID = 5222687737396765212L;
    @ApiField("estimate_value")
    private String estimateValue;
    @ApiField("history_value")
    private String historyValue;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("retrieval_count")
    private Long retrievalCount;
    @ApiField("sell_count")
    private Long sellCount;
    @ApiField("store_code")
    private String storeCode;
    @ApiField("transport_count")
    private Long transportCount;
    @ApiField("user_id")
    private Long userId;
    @ApiField("warn_count")
    private Long warnCount;

    public String getEstimateValue() {
        return this.estimateValue;
    }

    public void setEstimateValue(String estimateValue) {
        this.estimateValue = estimateValue;
    }

    public String getHistoryValue() {
        return this.historyValue;
    }

    public void setHistoryValue(String historyValue) {
        this.historyValue = historyValue;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getRetrievalCount() {
        return this.retrievalCount;
    }

    public void setRetrievalCount(Long retrievalCount) {
        this.retrievalCount = retrievalCount;
    }

    public Long getSellCount() {
        return this.sellCount;
    }

    public void setSellCount(Long sellCount) {
        this.sellCount = sellCount;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public Long getTransportCount() {
        return this.transportCount;
    }

    public void setTransportCount(Long transportCount) {
        this.transportCount = transportCount;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getWarnCount() {
        return this.warnCount;
    }

    public void setWarnCount(Long warnCount) {
        this.warnCount = warnCount;
    }
}


