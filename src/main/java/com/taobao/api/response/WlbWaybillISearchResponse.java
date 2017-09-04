package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WaybillApplySubscriptionInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbWaybillISearchResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4626571369652891769L;
    @ApiListField("subscribtions")
    @ApiField("waybill_apply_subscription_info")
    private List<WaybillApplySubscriptionInfo> subscribtions;

    public void setSubscribtions(List<WaybillApplySubscriptionInfo> subscribtions) {
        this.subscribtions = subscribtions;
    }

    public List<WaybillApplySubscriptionInfo> getSubscribtions() {
        return this.subscribtions;
    }
}


