package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemSchemaAddResponse;

import java.util.Map;

public class TmallItemSchemaAddRequest
        extends BaseTaobaoRequest<TmallItemSchemaAddResponse> {
    private Long categoryId;
    private Long productId;
    private String xmlData;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
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
        return "tmall.item.schema.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id", this.categoryId);
        txtParams.put("product_id", this.productId);
        txtParams.put("xml_data", this.xmlData);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallItemSchemaAddResponse> getResponseClass() {
        return TmallItemSchemaAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.categoryId, "categoryId");
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
        RequestCheckUtils.checkNotEmpty(this.xmlData, "xmlData");
    }
}


