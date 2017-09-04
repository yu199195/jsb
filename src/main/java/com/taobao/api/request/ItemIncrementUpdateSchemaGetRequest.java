package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemIncrementUpdateSchemaGetResponse;

import java.util.Map;

public class ItemIncrementUpdateSchemaGetRequest
        extends BaseTaobaoRequest<ItemIncrementUpdateSchemaGetResponse> {
    private Long categoryId;
    private Long itemId;
    private String updateFields;

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

    public void setUpdateFields(String updateFields) {
        this.updateFields = updateFields;
    }

    public String getUpdateFields() {
        return this.updateFields;
    }

    public String getApiMethodName() {
        return "taobao.item.increment.update.schema.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id", this.categoryId);
        txtParams.put("item_id", this.itemId);
        txtParams.put("update_fields", this.updateFields);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemIncrementUpdateSchemaGetResponse> getResponseClass() {
        return ItemIncrementUpdateSchemaGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
    }
}


