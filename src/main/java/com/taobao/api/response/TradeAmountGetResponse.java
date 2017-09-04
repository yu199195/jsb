package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TradeAmount;
import com.taobao.api.internal.mapping.ApiField;

public class TradeAmountGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1139719289828534654L;
    @ApiField("trade_amount")
    private TradeAmount tradeAmount;

    public void setTradeAmount(TradeAmount tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public TradeAmount getTradeAmount() {
        return this.tradeAmount;
    }
}


