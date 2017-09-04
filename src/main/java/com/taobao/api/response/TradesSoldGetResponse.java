package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Trade;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TradesSoldGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7278964676715844783L;
    @ApiField("has_next")
    private Boolean hasNext;
    @ApiField("total_results")
    private Long totalResults;
    @ApiListField("trades")
    @ApiField("trade")
    private List<Trade> trades;

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

    public void setTrades(List<Trade> trades) {
        this.trades = trades;
    }

    public List<Trade> getTrades() {
        return this.trades;
    }
}


