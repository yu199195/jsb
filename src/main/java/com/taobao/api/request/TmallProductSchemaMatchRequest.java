package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallProductSchemaMatchResponse;

import java.util.Map;

public class TmallProductSchemaMatchRequest
        extends BaseTaobaoRequest<TmallProductSchemaMatchResponse> {
    private Long categoryId;
    private String propvalues;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setPropvalues(String propvalues) {
        this.propvalues = propvalues;
    }

    public String getPropvalues() {
        return this.propvalues;
    }

    public String getApiMethodName() {
        return "tmall.product.schema.match";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id", this.categoryId);
        txtParams.put("propvalues", this.propvalues);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallProductSchemaMatchResponse> getResponseClass() {
        return TmallProductSchemaMatchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.categoryId, "categoryId");
        RequestCheckUtils.checkNotEmpty(this.propvalues, "propvalues");
    }
}


