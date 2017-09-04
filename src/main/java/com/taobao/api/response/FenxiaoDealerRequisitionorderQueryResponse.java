package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DealerOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoDealerRequisitionorderQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1614853515668588854L;
    @ApiListField("dealer_orders")
    @ApiField("dealer_order")
    private List<DealerOrder> dealerOrders;

    public void setDealerOrders(List<DealerOrder> dealerOrders) {
        this.dealerOrders = dealerOrders;
    }

    public List<DealerOrder> getDealerOrders() {
        return this.dealerOrders;
    }
}


