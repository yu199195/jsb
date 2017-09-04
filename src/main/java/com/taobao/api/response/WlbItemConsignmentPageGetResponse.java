package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbConsignMent;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbItemConsignmentPageGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3882618369871592995L;
    @ApiField("total_count")
    private Long totalCount;
    @ApiListField("wlb_consign_ments")
    @ApiField("wlb_consign_ment")
    private List<WlbConsignMent> wlbConsignMents;

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setWlbConsignMents(List<WlbConsignMent> wlbConsignMents) {
        this.wlbConsignMents = wlbConsignMents;
    }

    public List<WlbConsignMent> getWlbConsignMents() {
        return this.wlbConsignMents;
    }
}


