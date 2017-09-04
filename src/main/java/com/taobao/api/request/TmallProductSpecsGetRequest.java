package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallProductSpecsGetResponse;

import java.util.Map;

public class TmallProductSpecsGetRequest
        extends BaseTaobaoRequest<TmallProductSpecsGetResponse> {
    private Long catId;
    private Long productId;
    private String properties;

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public Long getCatId() {
        return this.catId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getProperties() {
        return this.properties;
    }

    public String getApiMethodName() {
        return "tmall.product.specs.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cat_id", this.catId);
        txtParams.put("product_id", this.productId);
        txtParams.put("properties", this.properties);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallProductSpecsGetResponse> getResponseClass() {
        return TmallProductSpecsGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


