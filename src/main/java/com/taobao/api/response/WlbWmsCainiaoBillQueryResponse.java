package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CainiaoBillQueryOrderinfolist;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbWmsCainiaoBillQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8438583923765776717L;
    @ApiListField("order_info_list")
    @ApiField("cainiao_bill_query_orderinfolist")
    private List<CainiaoBillQueryOrderinfolist> orderInfoList;
    @ApiField("total_count")
    private Long totalCount;

    public void setOrderInfoList(List<CainiaoBillQueryOrderinfolist> orderInfoList) {
        this.orderInfoList = orderInfoList;
    }

    public List<CainiaoBillQueryOrderinfolist> getOrderInfoList() {
        return this.orderInfoList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }
}


