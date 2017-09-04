package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbProcessStatus;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbOrderstatusGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7551713266526674134L;
    @ApiListField("wlb_order_status")
    @ApiField("wlb_process_status")
    private List<WlbProcessStatus> wlbOrderStatus;

    public void setWlbOrderStatus(List<WlbProcessStatus> wlbOrderStatus) {
        this.wlbOrderStatus = wlbOrderStatus;
    }

    public List<WlbProcessStatus> getWlbOrderStatus() {
        return this.wlbOrderStatus;
    }
}


