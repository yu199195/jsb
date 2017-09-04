package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemSynchronizeDeleteResponse;

import java.util.Map;

public class WlbItemSynchronizeDeleteRequest
        extends BaseTaobaoRequest<WlbItemSynchronizeDeleteResponse> {
    private Long extEntityId;
    private String extEntityType;
    private Long itemId;

    public void setExtEntityId(Long extEntityId) {
        this.extEntityId = extEntityId;
    }

    public Long getExtEntityId() {
        return this.extEntityId;
    }

    public void setExtEntityType(String extEntityType) {
        this.extEntityType = extEntityType;
    }

    public String getExtEntityType() {
        return this.extEntityType;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.synchronize.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ext_entity_id", this.extEntityId);
        txtParams.put("ext_entity_type", this.extEntityType);
        txtParams.put("item_id", this.itemId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbItemSynchronizeDeleteResponse> getResponseClass() {
        return WlbItemSynchronizeDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.extEntityId, "extEntityId");
        RequestCheckUtils.checkNotEmpty(this.extEntityType, "extEntityType");
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
    }
}


