package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RefundDetail;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoRefundQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6296463429593228769L;
    @ApiListField("refund_list")
    @ApiField("refund_detail")
    private List<RefundDetail> refundList;
    @ApiField("total_results")
    private Long totalResults;

    public void setRefundList(List<RefundDetail> refundList) {
        this.refundList = refundList;
    }

    public List<RefundDetail> getRefundList() {
        return this.refundList;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


