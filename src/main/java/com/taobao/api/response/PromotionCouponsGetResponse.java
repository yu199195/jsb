package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Coupon;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class PromotionCouponsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1228871416721128138L;
    @ApiListField("coupons")
    @ApiField("coupon")
    private List<Coupon> coupons;
    @ApiField("total_results")
    private Long totalResults;

    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }

    public List<Coupon> getCoupons() {
        return this.coupons;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


