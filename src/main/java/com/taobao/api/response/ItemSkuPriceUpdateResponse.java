package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Sku;
import com.taobao.api.internal.mapping.ApiField;

public class ItemSkuPriceUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1755336385385128211L;
    @ApiField("sku")
    private Sku sku;

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public Sku getSku() {
        return this.sku;
    }
}


