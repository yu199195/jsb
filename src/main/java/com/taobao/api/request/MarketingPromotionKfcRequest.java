package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MarketingPromotionKfcResponse;

import java.util.Map;

public class MarketingPromotionKfcRequest
        extends BaseTaobaoRequest<MarketingPromotionKfcResponse> {
    private String promotionDesc;
    private String promotionTitle;

    public void setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc;
    }

    public String getPromotionDesc() {
        return this.promotionDesc;
    }

    public void setPromotionTitle(String promotionTitle) {
        this.promotionTitle = promotionTitle;
    }

    public String getPromotionTitle() {
        return this.promotionTitle;
    }

    public String getApiMethodName() {
        return "taobao.marketing.promotion.kfc";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("promotion_desc", this.promotionDesc);
        txtParams.put("promotion_title", this.promotionTitle);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<MarketingPromotionKfcResponse> getResponseClass() {
        return MarketingPromotionKfcResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.promotionDesc, "promotionDesc");
        RequestCheckUtils.checkNotEmpty(this.promotionTitle, "promotionTitle");
    }
}


