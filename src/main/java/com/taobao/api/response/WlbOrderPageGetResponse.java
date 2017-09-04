package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbOrderPageGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3898815943634169212L;
    @ApiListField("order_list")
    @ApiField("wlb_order")
    private List<WlbOrder> orderList;
    @ApiField("total_count")
    private Long totalCount;

    public void setOrderList(List<WlbOrder> orderList) {
        this.orderList = orderList;
    }

    public List<WlbOrder> getOrderList() {
        return this.orderList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }
}


