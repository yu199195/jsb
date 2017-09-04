package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbSellerSubscription;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbSubscriptionQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3115156226773697672L;
    @ApiListField("seller_subscription_list")
    @ApiField("wlb_seller_subscription")
    private List<WlbSellerSubscription> sellerSubscriptionList;
    @ApiField("total_count")
    private Long totalCount;

    public void setSellerSubscriptionList(List<WlbSellerSubscription> sellerSubscriptionList) {
        this.sellerSubscriptionList = sellerSubscriptionList;
    }

    public List<WlbSellerSubscription> getSellerSubscriptionList() {
        return this.sellerSubscriptionList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }
}


