package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbInventorySyncResponse;

import java.util.Map;

public class WlbInventorySyncRequest
        extends BaseTaobaoRequest<WlbInventorySyncResponse> {
    private Long itemId;
    private String itemType;
    private Long quantity;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemType() {
        return this.itemType;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public String getApiMethodName() {
        return "taobao.wlb.inventory.sync";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("item_type", this.itemType);
        txtParams.put("quantity", this.quantity);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbInventorySyncResponse> getResponseClass() {
        return WlbInventorySyncResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(this.itemType, "itemType");
        RequestCheckUtils.checkNotEmpty(this.quantity, "quantity");
    }
}


