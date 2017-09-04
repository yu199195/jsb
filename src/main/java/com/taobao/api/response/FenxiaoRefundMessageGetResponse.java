package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.OrderMessage;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoRefundMessageGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6152364392399285982L;
    @ApiListField("order_messages")
    @ApiField("order_message")
    private List<OrderMessage> orderMessages;
    @ApiField("total_results")
    private Long totalResults;

    public void setOrderMessages(List<OrderMessage> orderMessages) {
        this.orderMessages = orderMessages;
    }

    public List<OrderMessage> getOrderMessages() {
        return this.orderMessages;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


