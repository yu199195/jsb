package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ProductCat;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoProductcatsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2796247585537594313L;
    @ApiListField("productcats")
    @ApiField("product_cat")
    private List<ProductCat> productcats;
    @ApiField("total_results")
    private Long totalResults;

    public void setProductcats(List<ProductCat> productcats) {
        this.productcats = productcats;
    }

    public List<ProductCat> getProductcats() {
        return this.productcats;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


