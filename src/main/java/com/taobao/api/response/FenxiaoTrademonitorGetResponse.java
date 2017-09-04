package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TradeMonitor;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoTrademonitorGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1536792266791342779L;
    @ApiField("total_results")
    private Long totalResults;
    @ApiListField("trade_monitors")
    @ApiField("trade_monitor")
    private List<TradeMonitor> tradeMonitors;

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setTradeMonitors(List<TradeMonitor> tradeMonitors) {
        this.tradeMonitors = tradeMonitors;
    }

    public List<TradeMonitor> getTradeMonitors() {
        return this.tradeMonitors;
    }
}


