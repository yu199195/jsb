package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbOrder;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWlborderGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1336333354665226539L;
    @ApiField("wlb_order")
    private WlbOrder wlbOrder;

    public void setWlbOrder(WlbOrder wlbOrder) {
        this.wlbOrder = wlbOrder;
    }

    public WlbOrder getWlbOrder() {
        return this.wlbOrder;
    }
}


