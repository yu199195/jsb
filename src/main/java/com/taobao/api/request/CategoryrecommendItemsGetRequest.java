package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CategoryrecommendItemsGetResponse;

import java.util.Map;

public class CategoryrecommendItemsGetRequest
        extends BaseTaobaoRequest<CategoryrecommendItemsGetResponse> {
    private Long categoryId;
    private Long count;
    private String ext;
    private Long recommendType;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return this.count;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getExt() {
        return this.ext;
    }

    public void setRecommendType(Long recommendType) {
        this.recommendType = recommendType;
    }

    public Long getRecommendType() {
        return this.recommendType;
    }

    public String getApiMethodName() {
        return "taobao.categoryrecommend.items.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id", this.categoryId);
        txtParams.put("count", this.count);
        txtParams.put("ext", this.ext);
        txtParams.put("recommend_type", this.recommendType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<CategoryrecommendItemsGetResponse> getResponseClass() {
        return CategoryrecommendItemsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.categoryId, "categoryId");
        RequestCheckUtils.checkNotEmpty(this.count, "count");
        RequestCheckUtils.checkNotEmpty(this.recommendType, "recommendType");
    }
}


