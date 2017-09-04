package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DealerOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoDealerRequisitionorderGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6541392868355711438L;
    @ApiListField("dealer_orders")
    @ApiField("dealer_order")
    private List<DealerOrder> dealerOrders;
    @ApiField("total_results")
    private Long totalResults;

    public void setDealerOrders(List<DealerOrder> dealerOrders) {
        this.dealerOrders = dealerOrders;
    }

    public List<DealerOrder> getDealerOrders() {
        return this.dealerOrders;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


