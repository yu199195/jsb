package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWmsSkuGetResponse;

import java.util.Map;

public class WlbWmsSkuGetRequest
        extends BaseTaobaoRequest<WlbWmsSkuGetResponse> {
    private String itemCode;
    private String itemId;
    private String ownerUserId;

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.sku.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_code", this.itemCode);
        txtParams.put("item_id", this.itemId);
        txtParams.put("owner_user_id", this.ownerUserId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsSkuGetResponse> getResponseClass() {
        return WlbWmsSkuGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


