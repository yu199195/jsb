package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemAddSchemaGetResponse;

import java.util.Map;

public class TmallItemAddSchemaGetRequest
        extends BaseTaobaoRequest<TmallItemAddSchemaGetResponse> {
    private Long categoryId;
    private Boolean isvInit;
    private Long productId;
    private String type;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setIsvInit(Boolean isvInit) {
        this.isvInit = isvInit;
    }

    public Boolean getIsvInit() {
        return this.isvInit;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String getApiMethodName() {
        return "tmall.item.add.schema.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id", this.categoryId);
        txtParams.put("isv_init", this.isvInit);
        txtParams.put("product_id", this.productId);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallItemAddSchemaGetResponse> getResponseClass() {
        return TmallItemAddSchemaGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.categoryId, "categoryId");
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
    }
}


