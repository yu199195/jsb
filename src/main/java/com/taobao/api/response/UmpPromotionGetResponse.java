package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PromotionDisplayTop;
import com.taobao.api.internal.mapping.ApiField;

public class UmpPromotionGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7148124811642596472L;
    @ApiField("promotions")
    private PromotionDisplayTop promotions;

    public void setPromotions(PromotionDisplayTop promotions) {
        this.promotions = promotions;
    }

    public PromotionDisplayTop getPromotions() {
        return this.promotions;
    }
}


