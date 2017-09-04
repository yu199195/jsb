package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TradeConfirmFee;
import com.taobao.api.internal.mapping.ApiField;

public class TradeConfirmfeeGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8725886367636463819L;
    @ApiField("trade_confirm_fee")
    private TradeConfirmFee tradeConfirmFee;

    public void setTradeConfirmFee(TradeConfirmFee tradeConfirmFee) {
        this.tradeConfirmFee = tradeConfirmFee;
    }

    public TradeConfirmFee getTradeConfirmFee() {
        return this.tradeConfirmFee;
    }
}


