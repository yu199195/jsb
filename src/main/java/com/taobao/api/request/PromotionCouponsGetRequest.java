package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionCouponsGetResponse;

import java.util.Date;
import java.util.Map;

public class PromotionCouponsGetRequest
        extends BaseTaobaoRequest<PromotionCouponsGetResponse> {
    private Long couponId;
    private Long denominations;
    private Date endTime;
    private Long pageNo;
    private Long pageSize;

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getCouponId() {
        return this.couponId;
    }

    public void setDenominations(Long denominations) {
        this.denominations = denominations;
    }

    public Long getDenominations() {
        return this.denominations;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getApiMethodName() {
        return "taobao.promotion.coupons.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("coupon_id", this.couponId);
        txtParams.put("denominations", this.denominations);
        txtParams.put("end_time", this.endTime);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PromotionCouponsGetResponse> getResponseClass() {
        return PromotionCouponsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(this.denominations, 100L, "denominations");
        RequestCheckUtils.checkMinValue(this.denominations, 3L, "denominations");
        RequestCheckUtils.checkMinValue(this.pageNo, 1L, "pageNo");
    }
}


