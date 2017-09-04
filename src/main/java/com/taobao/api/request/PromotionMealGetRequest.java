package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionMealGetResponse;

import java.util.Map;

public class PromotionMealGetRequest
        extends BaseTaobaoRequest<PromotionMealGetResponse> {
    private Long mealId;
    private String status;

    public void setMealId(Long mealId) {
        this.mealId = mealId;
    }

    public Long getMealId() {
        return this.mealId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public String getApiMethodName() {
        return "taobao.promotion.meal.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("meal_id", this.mealId);
        txtParams.put("status", this.status);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PromotionMealGetResponse> getResponseClass() {
        return PromotionMealGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


