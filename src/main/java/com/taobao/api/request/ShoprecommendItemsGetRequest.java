package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ShoprecommendItemsGetResponse;

import java.util.Map;

public class ShoprecommendItemsGetRequest
        extends BaseTaobaoRequest<ShoprecommendItemsGetResponse> {
    private Long count;
    private String ext;
    private Long recommendType;
    private Long sellerId;

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

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public String getApiMethodName() {
        return "taobao.shoprecommend.items.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("count", this.count);
        txtParams.put("ext", this.ext);
        txtParams.put("recommend_type", this.recommendType);
        txtParams.put("seller_id", this.sellerId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ShoprecommendItemsGetResponse> getResponseClass() {
        return ShoprecommendItemsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.count, "count");
        RequestCheckUtils.checkNotEmpty(this.recommendType, "recommendType");
        RequestCheckUtils.checkNotEmpty(this.sellerId, "sellerId");
    }
}


