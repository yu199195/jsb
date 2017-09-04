package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ProductSpec;
import com.taobao.api.internal.mapping.ApiField;

public class TmallProductSpecGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4633828228828775796L;
    @ApiField("product_spec")
    private ProductSpec productSpec;

    public void setProductSpec(ProductSpec productSpec) {
        this.productSpec = productSpec;
    }

    public ProductSpec getProductSpec() {
        return this.productSpec;
    }
}


