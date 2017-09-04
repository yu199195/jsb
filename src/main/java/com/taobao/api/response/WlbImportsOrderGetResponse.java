package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LocOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbImportsOrderGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3889352962565522451L;
    @ApiListField("orders")
    @ApiField("loc_order")
    private List<LocOrder> orders;
    @ApiField("total_results")
    private Long totalResults;

    public void setOrders(List<LocOrder> orders) {
        this.orders = orders;
    }

    public List<LocOrder> getOrders() {
        return this.orders;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


