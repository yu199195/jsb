package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDealerRequisitionorderGetResponse;

import java.util.Date;
import java.util.Map;

public class FenxiaoDealerRequisitionorderGetRequest
        extends BaseTaobaoRequest<FenxiaoDealerRequisitionorderGetResponse> {
    private Date endDate;
    private String fields;
    private Long identity;
    private Long orderStatus;
    private Long pageNo;
    private Long pageSize;
    private Date startDate;

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setIdentity(Long identity) {
        this.identity = identity;
    }

    public Long getIdentity() {
        return this.identity;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getOrderStatus() {
        return this.orderStatus;
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

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.dealer.requisitionorder.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_date", this.endDate);
        txtParams.put("fields", this.fields);
        txtParams.put("identity", this.identity);
        txtParams.put("order_status", this.orderStatus);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_date", this.startDate);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoDealerRequisitionorderGetResponse> getResponseClass() {
        return FenxiaoDealerRequisitionorderGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(this.identity, "identity");
        RequestCheckUtils.checkNotEmpty(this.startDate, "startDate");
    }
}


