package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemAnchorGetResponse;

import java.util.Map;

public class ItemAnchorGetRequest
        extends BaseTaobaoRequest<ItemAnchorGetResponse> {
    private Long catId;
    private Long type;

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public Long getCatId() {
        return this.catId;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }

    public String getApiMethodName() {
        return "taobao.item.anchor.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cat_id", this.catId);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemAnchorGetResponse> getResponseClass() {
        return ItemAnchorGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.catId, "catId");
        RequestCheckUtils.checkNotEmpty(this.type, "type");
        RequestCheckUtils.checkMaxValue(this.type, 1L, "type");
        RequestCheckUtils.checkMinValue(this.type, -1L, "type");
    }
}


