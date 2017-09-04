package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbOrderDetail;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbOrderdetailDateGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6858339876611196981L;
    @ApiListField("order_detail_list")
    @ApiField("wlb_order_detail")
    private List<WlbOrderDetail> orderDetailList;
    @ApiField("total_count")
    private Long totalCount;

    public void setOrderDetailList(List<WlbOrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public List<WlbOrderDetail> getOrderDetailList() {
        return this.orderDetailList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }
}


