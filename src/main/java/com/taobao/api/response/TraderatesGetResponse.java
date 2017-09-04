package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TradeRate;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TraderatesGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3779169933174415473L;
    @ApiField("has_next")
    private Boolean hasNext;
    @ApiField("total_results")
    private Long totalResults;
    @ApiListField("trade_rates")
    @ApiField("trade_rate")
    private List<TradeRate> tradeRates;

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Boolean getHasNext() {
        return this.hasNext;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setTradeRates(List<TradeRate> tradeRates) {
        this.tradeRates = tradeRates;
    }

    public List<TradeRate> getTradeRates() {
        return this.tradeRates;
    }
}


