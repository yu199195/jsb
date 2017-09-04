package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ProductSpec;
import com.taobao.api.internal.mapping.ApiField;

public class TmallProductSpecAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5861247743596194964L;
    @ApiField("product_spec")
    private ProductSpec productSpec;

    public void setProductSpec(ProductSpec productSpec) {
        this.productSpec = productSpec;
    }

    public ProductSpec getProductSpec() {
        return this.productSpec;
    }
}


