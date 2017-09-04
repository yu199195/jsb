package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbReplenish;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbReplenishStatisticsResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7634431988298287876L;
    @ApiListField("replenish_list")
    @ApiField("wlb_replenish")
    private List<WlbReplenish> replenishList;
    @ApiField("total_count")
    private Long totalCount;

    public void setReplenishList(List<WlbReplenish> replenishList) {
        this.replenishList = replenishList;
    }

    public List<WlbReplenish> getReplenishList() {
        return this.replenishList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }
}


