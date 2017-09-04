package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbTmsOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbTmsorderQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8175181589245327567L;
    @ApiListField("tms_order_list")
    @ApiField("wlb_tms_order")
    private List<WlbTmsOrder> tmsOrderList;
    @ApiField("total_count")
    private Long totalCount;

    public void setTmsOrderList(List<WlbTmsOrder> tmsOrderList) {
        this.tmsOrderList = tmsOrderList;
    }

    public List<WlbTmsOrder> getTmsOrderList() {
        return this.tmsOrderList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }
}


