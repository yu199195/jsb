package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Cooperation;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoCooperationGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6316448374397485633L;
    @ApiListField("cooperations")
    @ApiField("cooperation")
    private List<Cooperation> cooperations;
    @ApiField("total_results")
    private Long totalResults;

    public void setCooperations(List<Cooperation> cooperations) {
        this.cooperations = cooperations;
    }

    public List<Cooperation> getCooperations() {
        return this.cooperations;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


