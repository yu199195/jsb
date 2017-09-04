package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryInitialItemResponse;

import java.util.Map;

public class InventoryInitialItemRequest
        extends BaseTaobaoRequest<InventoryInitialItemResponse> {
    private Long scItemId;
    private String storeInventorys;

    public void setScItemId(Long scItemId) {
        this.scItemId = scItemId;
    }

    public Long getScItemId() {
        return this.scItemId;
    }

    public void setStoreInventorys(String storeInventorys) {
        this.storeInventorys = storeInventorys;
    }

    public String getStoreInventorys() {
        return this.storeInventorys;
    }

    public String getApiMethodName() {
        return "taobao.inventory.initial.item";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("sc_item_id", this.scItemId);
        txtParams.put("store_inventorys", this.storeInventorys);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<InventoryInitialItemResponse> getResponseClass() {
        return InventoryInitialItemResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.scItemId, "scItemId");
        RequestCheckUtils.checkNotEmpty(this.storeInventorys, "storeInventorys");
    }
}


