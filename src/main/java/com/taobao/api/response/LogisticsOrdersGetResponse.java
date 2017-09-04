package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Shipping;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class LogisticsOrdersGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6287484656994428361L;
    @ApiListField("shippings")
    @ApiField("shipping")
    private List<Shipping> shippings;
    @ApiField("total_results")
    private Long totalResults;

    public void setShippings(List<Shipping> shippings) {
        this.shippings = shippings;
    }

    public List<Shipping> getShippings() {
        return this.shippings;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


