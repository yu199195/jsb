package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbAuthorization;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbItemAuthorizationQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1428782347588782721L;
    @ApiListField("authorization_list")
    @ApiField("wlb_authorization")
    private List<WlbAuthorization> authorizationList;
    @ApiField("total_count")
    private Long totalCount;

    public void setAuthorizationList(List<WlbAuthorization> authorizationList) {
        this.authorizationList = authorizationList;
    }

    public List<WlbAuthorization> getAuthorizationList() {
        return this.authorizationList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }
}


