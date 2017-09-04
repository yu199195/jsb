package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WirelessBuntingItemShorturlCreateResponse;

import java.util.Map;

public class WirelessBuntingItemShorturlCreateRequest
        extends BaseTaobaoRequest<WirelessBuntingItemShorturlCreateResponse> {
    private String itemId;

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getApiMethodName() {
        return "taobao.wireless.bunting.item.shorturl.create";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WirelessBuntingItemShorturlCreateResponse> getResponseClass() {
        return WirelessBuntingItemShorturlCreateResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


