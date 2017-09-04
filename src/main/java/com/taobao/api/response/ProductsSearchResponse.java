package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Product;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ProductsSearchResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7557278258398752494L;
    @ApiListField("products")
    @ApiField("product")
    private List<Product> products;
    @ApiField("total_results")
    private Long totalResults;

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


