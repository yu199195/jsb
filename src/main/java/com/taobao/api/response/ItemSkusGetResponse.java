package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Sku;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ItemSkusGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8788582251251238751L;
    @ApiListField("skus")
    @ApiField("sku")
    private List<Sku> skus;

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }

    public List<Sku> getSkus() {
        return this.skus;
    }
}


