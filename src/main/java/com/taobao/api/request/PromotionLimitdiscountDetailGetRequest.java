package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionLimitdiscountDetailGetResponse;

import java.util.Map;

public class PromotionLimitdiscountDetailGetRequest
        extends BaseTaobaoRequest<PromotionLimitdiscountDetailGetResponse> {
    private Long limitDiscountId;

    public void setLimitDiscountId(Long limitDiscountId) {
        this.limitDiscountId = limitDiscountId;
    }

    public Long getLimitDiscountId() {
        return this.limitDiscountId;
    }

    public String getApiMethodName() {
        return "taobao.promotion.limitdiscount.detail.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("limit_discount_id", this.limitDiscountId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PromotionLimitdiscountDetailGetResponse> getResponseClass() {
        return PromotionLimitdiscountDetailGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.limitDiscountId, "limitDiscountId");
    }
}


