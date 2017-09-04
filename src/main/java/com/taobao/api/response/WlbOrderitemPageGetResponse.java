package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbOrderItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbOrderitemPageGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7249279977365577221L;
    @ApiListField("order_item_list")
    @ApiField("wlb_order_item")
    private List<WlbOrderItem> orderItemList;
    @ApiField("total_count")
    private Long totalCount;

    public void setOrderItemList(List<WlbOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public List<WlbOrderItem> getOrderItemList() {
        return this.orderItemList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }
}


