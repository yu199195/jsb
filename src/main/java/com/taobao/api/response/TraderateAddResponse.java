package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TradeRate;
import com.taobao.api.internal.mapping.ApiField;

public class TraderateAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6262352772681344528L;
    @ApiField("trade_rate")
    private TradeRate tradeRate;

    public void setTradeRate(TradeRate tradeRate) {
        this.tradeRate = tradeRate;
    }

    public TradeRate getTradeRate() {
        return this.tradeRate;
    }
}


