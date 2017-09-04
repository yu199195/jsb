package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UserrecommendItemsGetResponse;

import java.util.Map;

public class UserrecommendItemsGetRequest
        extends BaseTaobaoRequest<UserrecommendItemsGetResponse> {
    private Long count;
    private String ext;
    private Long recommendType;

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
        return "taobao.userrecommend.items.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("count", this.count);
        txtParams.put("ext", this.ext);
        txtParams.put("recommend_type", this.recommendType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<UserrecommendItemsGetResponse> getResponseClass() {
        return UserrecommendItemsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.count, "count");
        RequestCheckUtils.checkNotEmpty(this.recommendType, "recommendType");
    }
}


