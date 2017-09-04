package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallProductSchemaAddResponse;

import java.util.Map;

public class TmallProductSchemaAddRequest
        extends BaseTaobaoRequest<TmallProductSchemaAddResponse> {
    private Long brandId;
    private Long categoryId;
    private String xmlData;

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setXmlData(String xmlData) {
        this.xmlData = xmlData;
    }

    public String getXmlData() {
        return this.xmlData;
    }

    public String getApiMethodName() {
        return "tmall.product.schema.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("brand_id", this.brandId);
        txtParams.put("category_id", this.categoryId);
        txtParams.put("xml_data", this.xmlData);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallProductSchemaAddResponse> getResponseClass() {
        return TmallProductSchemaAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.categoryId, "categoryId");
        RequestCheckUtils.checkNotEmpty(this.xmlData, "xmlData");
    }
}


