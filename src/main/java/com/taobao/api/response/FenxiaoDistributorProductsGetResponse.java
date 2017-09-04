package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FenxiaoProduct;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoDistributorProductsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4417222644336167985L;
    @ApiField("has_next")
    private Boolean hasNext;
    @ApiListField("products")
    @ApiField("fenxiao_product")
    private List<FenxiaoProduct> products;

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Boolean getHasNext() {
        return this.hasNext;
    }

    public void setProducts(List<FenxiaoProduct> products) {
        this.products = products;
    }

    public List<FenxiaoProduct> getProducts() {
        return this.products;
    }
}


