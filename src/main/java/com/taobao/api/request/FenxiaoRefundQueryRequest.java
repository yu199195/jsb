package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoRefundQueryResponse;

import java.util.Date;
import java.util.Map;

public class FenxiaoRefundQueryRequest
        extends BaseTaobaoRequest<FenxiaoRefundQueryResponse> {
    private Date endDate;
    private Long pageNo;
    private Long pageSize;
    private Boolean querySellerRefund;
    private Date startDate;

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return this.endDate;
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

    public void setQuerySellerRefund(Boolean querySellerRefund) {
        this.querySellerRefund = querySellerRefund;
    }

    public Boolean getQuerySellerRefund() {
        return this.querySellerRefund;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.refund.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_date", this.endDate);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("query_seller_refund", this.querySellerRefund);
        txtParams.put("start_date", this.startDate);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoRefundQueryResponse> getResponseClass() {
        return FenxiaoRefundQueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(this.startDate, "startDate");
    }
}


