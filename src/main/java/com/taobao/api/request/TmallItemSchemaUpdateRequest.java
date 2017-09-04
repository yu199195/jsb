package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemSchemaUpdateResponse;

import java.util.Map;

public class TmallItemSchemaUpdateRequest
        extends BaseTaobaoRequest<TmallItemSchemaUpdateResponse> {
    private Long categoryId;
    private Long itemId;
    private Long productId;
    private String xmlData;

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

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setXmlData(String xmlData) {
        this.xmlData = xmlData;
    }

    public String getXmlData() {
        return this.xmlData;
    }

    public String getApiMethodName() {
        return "tmall.item.schema.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id", this.categoryId);
        txtParams.put("item_id", this.itemId);
        txtParams.put("product_id", this.productId);
        txtParams.put("xml_data", this.xmlData);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallItemSchemaUpdateResponse> getResponseClass() {
        return TmallItemSchemaUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(this.xmlData, "xmlData");
    }
}


