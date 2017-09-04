package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TmcGroup;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TmcGroupsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4857514213357588927L;
    @ApiListField("groups")
    @ApiField("tmc_group")
    private List<TmcGroup> groups;
    @ApiField("total_results")
    private Long totalResults;

    public void setGroups(List<TmcGroup> groups) {
        this.groups = groups;
    }

    public List<TmcGroup> getGroups() {
        return this.groups;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


