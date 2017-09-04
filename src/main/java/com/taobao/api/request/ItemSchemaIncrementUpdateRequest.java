package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemSchemaIncrementUpdateResponse;

import java.util.Map;

public class ItemSchemaIncrementUpdateRequest
        extends BaseTaobaoRequest<ItemSchemaIncrementUpdateResponse> {
    private Long categoryId;
    private Long itemId;
    private String parameters;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getParameters() {
        return this.parameters;
    }

    public String getApiMethodName() {
        return "taobao.item.schema.increment.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id", this.categoryId);
        txtParams.put("item_id", this.itemId);
        txtParams.put("parameters", this.parameters);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemSchemaIncrementUpdateResponse> getResponseClass() {
        return ItemSchemaIncrementUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(this.parameters, "parameters");
    }
}


