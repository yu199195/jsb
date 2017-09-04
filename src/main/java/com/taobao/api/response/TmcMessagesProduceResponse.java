package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TmcProduceResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TmcMessagesProduceResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4421312537419996339L;
    @ApiField("is_all_success")
    private Boolean isAllSuccess;
    @ApiListField("results")
    @ApiField("tmc_produce_result")
    private List<TmcProduceResult> results;

    public void setIsAllSuccess(Boolean isAllSuccess) {
        this.isAllSuccess = isAllSuccess;
    }

    public Boolean getIsAllSuccess() {
        return this.isAllSuccess;
    }

    public void setResults(List<TmcProduceResult> results) {
        this.results = results;
    }

    public List<TmcProduceResult> getResults() {
        return this.results;
    }
}


