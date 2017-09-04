package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FenxiaoProduct;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoProductsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7161461252983715795L;
    @ApiListField("products")
    @ApiField("fenxiao_product")
    private List<FenxiaoProduct> products;
    @ApiField("total_results")
    private Long totalResults;

    public void setProducts(List<FenxiaoProduct> products) {
        this.products = products;
    }

    public List<FenxiaoProduct> getProducts() {
        return this.products;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


