package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbInventoryDetailGetResponse;

import java.util.Map;

public class WlbInventoryDetailGetRequest
        extends BaseTaobaoRequest<WlbInventoryDetailGetResponse> {
    private String inventoryTypeList;
    private Long itemId;
    private String storeCode;

    public void setInventoryTypeList(String inventoryTypeList) {
        this.inventoryTypeList = inventoryTypeList;
    }

    public String getInventoryTypeList() {
        return this.inventoryTypeList;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public String getApiMethodName() {
        return "taobao.wlb.inventory.detail.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("inventory_type_list", this.inventoryTypeList);
        txtParams.put("item_id", this.itemId);
        txtParams.put("store_code", this.storeCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbInventoryDetailGetResponse> getResponseClass() {
        return WlbInventoryDetailGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(this.inventoryTypeList, 20, "inventoryTypeList");
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
    }
}


