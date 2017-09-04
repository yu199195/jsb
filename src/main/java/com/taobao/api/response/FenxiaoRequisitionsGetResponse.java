package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Requisition;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoRequisitionsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4132566279197798337L;
    @ApiField("is_success")
    private Boolean isSuccess;
    @ApiListField("requisitions")
    @ApiField("requisition")
    private List<Requisition> requisitions;
    @ApiField("total_results")
    private Long totalResults;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setRequisitions(List<Requisition> requisitions) {
        this.requisitions = requisitions;
    }

    public List<Requisition> getRequisitions() {
        return this.requisitions;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


