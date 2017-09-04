package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Order;
import com.taobao.api.internal.mapping.ApiField;

public class TradeOrderskuUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3785954794164978911L;
    @ApiField("order")
    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return this.order;
    }
}


