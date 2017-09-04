package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PurchaseOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoOrdersGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8197986682847424453L;
    @ApiListField("purchase_orders")
    @ApiField("purchase_order")
    private List<PurchaseOrder> purchaseOrders;
    @ApiField("total_results")
    private Long totalResults;

    public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    public List<PurchaseOrder> getPurchaseOrders() {
        return this.purchaseOrders;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


