package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Discount;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoDiscountsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1416947329529418565L;
    @ApiListField("discounts")
    @ApiField("discount")
    private List<Discount> discounts;
    @ApiField("total_results")
    private Long totalResults;

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public List<Discount> getDiscounts() {
        return this.discounts;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


