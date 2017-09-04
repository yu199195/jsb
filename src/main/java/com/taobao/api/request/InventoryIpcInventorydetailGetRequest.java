package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryIpcInventorydetailGetResponse;

import java.util.Map;

public class InventoryIpcInventorydetailGetRequest
        extends BaseTaobaoRequest<InventoryIpcInventorydetailGetResponse> {
    private Long bizOrderId;
    private Long bizSubOrderId;
    private Long pageIndex;
    private Long pageSize;
    private Long scItemId;
    private Long statusQuery;

    public void setBizOrderId(Long bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public Long getBizOrderId() {
        return this.bizOrderId;
    }

    public void setBizSubOrderId(Long bizSubOrderId) {
        this.bizSubOrderId = bizSubOrderId;
    }

    public Long getBizSubOrderId() {
        return this.bizSubOrderId;
    }

    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Long getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setScItemId(Long scItemId) {
        this.scItemId = scItemId;
    }

    public Long getScItemId() {
        return this.scItemId;
    }

    public void setStatusQuery(Long statusQuery) {
        this.statusQuery = statusQuery;
    }

    public Long getStatusQuery() {
        return this.statusQuery;
    }

    public String getApiMethodName() {
        return "taobao.inventory.ipc.inventorydetail.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_order_id", this.bizOrderId);
        txtParams.put("biz_sub_order_id", this.bizSubOrderId);
        txtParams.put("page_index", this.pageIndex);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("sc_item_id", this.scItemId);
        txtParams.put("status_query", this.statusQuery);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<InventoryIpcInventorydetailGetResponse> getResponseClass() {
        return InventoryIpcInventorydetailGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMinValue(this.bizOrderId, 0L, "bizOrderId");
        RequestCheckUtils.checkMinValue(this.bizSubOrderId, 0L, "bizSubOrderId");
        RequestCheckUtils.checkNotEmpty(this.pageIndex, "pageIndex");
        RequestCheckUtils.checkMinValue(this.pageIndex, 0L, "pageIndex");
        RequestCheckUtils.checkNotEmpty(this.pageSize, "pageSize");
        RequestCheckUtils.checkNotEmpty(this.scItemId, "scItemId");
        RequestCheckUtils.checkNotEmpty(this.statusQuery, "statusQuery");
        RequestCheckUtils.checkMinValue(this.statusQuery, 1L, "statusQuery");
    }
}


