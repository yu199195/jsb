package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LimitDiscount;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class PromotionLimitdiscountGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4683947372819456985L;
    @ApiListField("limit_discount_list")
    @ApiField("limit_discount")
    private List<LimitDiscount> limitDiscountList;
    @ApiField("total_count")
    private Long totalCount;

    public void setLimitDiscountList(List<LimitDiscount> limitDiscountList) {
        this.limitDiscountList = limitDiscountList;
    }

    public List<LimitDiscount> getLimitDiscountList() {
        return this.limitDiscountList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }
}


