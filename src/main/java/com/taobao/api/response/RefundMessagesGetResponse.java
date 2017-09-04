package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RefundMessage;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class RefundMessagesGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6464517132669158878L;
    @ApiListField("refund_messages")
    @ApiField("refund_message")
    private List<RefundMessage> refundMessages;
    @ApiField("total_results")
    private Long totalResults;

    public void setRefundMessages(List<RefundMessage> refundMessages) {
        this.refundMessages = refundMessages;
    }

    public List<RefundMessage> getRefundMessages() {
        return this.refundMessages;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


