package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Product;
import com.taobao.api.internal.mapping.ApiField;

public class ProductGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1277476763137421519L;
    @ApiField("product")
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return this.product;
    }
}


