package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbTradeorderGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4776381917514978454L;
    @ApiListField("wlb_order_list")
    @ApiField("wlb_order")
    private List<WlbOrder> wlbOrderList;

    public void setWlbOrderList(List<WlbOrder> wlbOrderList) {
        this.wlbOrderList = wlbOrderList;
    }

    public List<WlbOrder> getWlbOrderList() {
        return this.wlbOrderList;
    }
}


