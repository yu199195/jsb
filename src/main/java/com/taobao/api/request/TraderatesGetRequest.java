package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TraderatesGetResponse;

import java.util.Date;
import java.util.Map;

public class TraderatesGetRequest
        extends BaseTaobaoRequest<TraderatesGetResponse> {
    private Date endDate;
    private String fields;
    private Long numIid;
    private Long pageNo;
    private Long pageSize;
    private String peerNick;
    private String rateType;
    private String result;
    private String role;
    private Date startDate;
    private Long tid;
    private Boolean useHasNext;

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

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
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

    public void setPeerNick(String peerNick) {
        this.peerNick = peerNick;
    }

    public String getPeerNick() {
        return this.peerNick;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public String getRateType() {
        return this.rateType;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public void setUseHasNext(Boolean useHasNext) {
        this.useHasNext = useHasNext;
    }

    public Boolean getUseHasNext() {
        return this.useHasNext;
    }

    public String getApiMethodName() {
        return "taobao.traderates.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_date", this.endDate);
        txtParams.put("fields", this.fields);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("peer_nick", this.peerNick);
        txtParams.put("rate_type", this.rateType);
        txtParams.put("result", this.result);
        txtParams.put("role", this.role);
        txtParams.put("start_date", this.startDate);
        txtParams.put("tid", this.tid);
        txtParams.put("use_has_next", this.useHasNext);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TraderatesGetResponse> getResponseClass() {
        return TraderatesGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkMaxListSize(this.fields, 20, "fields");
        RequestCheckUtils.checkMaxValue(this.pageSize, 150L, "pageSize");
        RequestCheckUtils.checkMinValue(this.pageSize, 1L, "pageSize");
        RequestCheckUtils.checkMaxLength(this.peerNick, 32, "peerNick");
        RequestCheckUtils.checkNotEmpty(this.rateType, "rateType");
        RequestCheckUtils.checkNotEmpty(this.role, "role");
    }
}


