package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionLimitdiscountGetResponse;

import java.util.Date;
import java.util.Map;

public class PromotionLimitdiscountGetRequest
        extends BaseTaobaoRequest<PromotionLimitdiscountGetResponse> {
    private Date endTime;
    private Long limitDiscountId;
    private Long pageNumber;
    private Date startTime;
    private String status;

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setLimitDiscountId(Long limitDiscountId) {
        this.limitDiscountId = limitDiscountId;
    }

    public Long getLimitDiscountId() {
        return this.limitDiscountId;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public String getApiMethodName() {
        return "taobao.promotion.limitdiscount.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_time", this.endTime);
        txtParams.put("limit_discount_id", this.limitDiscountId);
        txtParams.put("page_number", this.pageNumber);
        txtParams.put("start_time", this.startTime);
        txtParams.put("status", this.status);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PromotionLimitdiscountGetResponse> getResponseClass() {
        return PromotionLimitdiscountGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


