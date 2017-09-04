package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.MsgGroupDO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class JushitaJmsGroupGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7443581938118317993L;
    @ApiListField("groups")
    @ApiField("msg_group_d_o")
    private List<MsgGroupDO> groups;
    @ApiField("total_results")
    private Long totalResults;

    public void setGroups(List<MsgGroupDO> groups) {
        this.groups = groups;
    }

    public List<MsgGroupDO> getGroups() {
        return this.groups;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


