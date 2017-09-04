package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Trade;
import com.taobao.api.internal.mapping.ApiField;

public class TradeMemoAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4188232524988142442L;
    @ApiField("trade")
    private Trade trade;

    public void setTrade(Trade trade) {
        this.trade = trade;
    }

    public Trade getTrade() {
        return this.trade;
    }
}


