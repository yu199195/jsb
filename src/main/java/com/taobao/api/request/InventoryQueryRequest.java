package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryQueryResponse;

import java.util.Map;

public class InventoryQueryRequest
        extends BaseTaobaoRequest<InventoryQueryResponse> {
    private String scItemCodes;
    private String scItemIds;
    private String sellerNick;
    private String storeCodes;

    public void setScItemCodes(String scItemCodes) {
        this.scItemCodes = scItemCodes;
    }

    public String getScItemCodes() {
        return this.scItemCodes;
    }

    public void setScItemIds(String scItemIds) {
        this.scItemIds = scItemIds;
    }

    public String getScItemIds() {
        return this.scItemIds;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setStoreCodes(String storeCodes) {
        this.storeCodes = storeCodes;
    }

    public String getStoreCodes() {
        return this.storeCodes;
    }

    public String getApiMethodName() {
        return "taobao.inventory.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("sc_item_codes", this.scItemCodes);
        txtParams.put("sc_item_ids", this.scItemIds);
        txtParams.put("seller_nick", this.sellerNick);
        txtParams.put("store_codes", this.storeCodes);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<InventoryQueryResponse> getResponseClass() {
        return InventoryQueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.scItemIds, "scItemIds");
    }
}


