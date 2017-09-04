package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoBimTradeorderConsignResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5297285598436591845L;
    @ApiField("lg_order_code")
    private String lgOrderCode;
    @ApiField("store_order_code")
    private String storeOrderCode;

    public void setLgOrderCode(String lgOrderCode) {
        this.lgOrderCode = lgOrderCode;
    }

    public String getLgOrderCode() {
        return this.lgOrderCode;
    }

    public void setStoreOrderCode(String storeOrderCode) {
        this.storeOrderCode = storeOrderCode;
    }

    public String getStoreOrderCode() {
        return this.storeOrderCode;
    }
}


