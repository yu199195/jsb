package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Trade;
import com.taobao.api.internal.mapping.ApiField;

public class TradeFullinfoGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4127513576151563798L;
    @ApiField("trade")
    private Trade trade;

    public void setTrade(Trade trade) {
        this.trade = trade;
    }

    public Trade getTrade() {
        return this.trade;
    }
}


