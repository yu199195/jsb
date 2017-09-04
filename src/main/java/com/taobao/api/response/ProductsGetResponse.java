package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Product;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ProductsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2797228648156428336L;
    @ApiListField("products")
    @ApiField("product")
    private List<Product> products;

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return this.products;
    }
}


