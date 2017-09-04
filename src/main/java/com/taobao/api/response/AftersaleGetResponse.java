package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AfterSale;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class AftersaleGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3297143277958139728L;
    @ApiListField("after_sales")
    @ApiField("after_sale")
    private List<AfterSale> afterSales;

    public void setAfterSales(List<AfterSale> afterSales) {
        this.afterSales = afterSales;
    }

    public List<AfterSale> getAfterSales() {
        return this.afterSales;
    }
}


