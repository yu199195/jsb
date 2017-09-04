package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWmsItemCombinationDeleteResponse;

import java.util.Map;

public class WlbWmsItemCombinationDeleteRequest
        extends BaseTaobaoRequest<WlbWmsItemCombinationDeleteResponse> {
    private Long itemId;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.item.combination.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsItemCombinationDeleteResponse> getResponseClass() {
        return WlbWmsItemCombinationDeleteResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


