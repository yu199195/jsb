package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallItemPriceUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3324835517869421354L;
    @ApiField("price_update_result")
    private String priceUpdateResult;

    public void setPriceUpdateResult(String priceUpdateResult) {
        this.priceUpdateResult = priceUpdateResult;
    }

    public String getPriceUpdateResult() {
        return this.priceUpdateResult;
    }
}


