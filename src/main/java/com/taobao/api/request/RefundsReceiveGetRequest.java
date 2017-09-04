package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundsReceiveGetResponse;

import java.util.Date;
import java.util.Map;

public class RefundsReceiveGetRequest
        extends BaseTaobaoRequest<RefundsReceiveGetResponse> {
    private String buyerNick;
    private Date endModified;
    private String fields;
    private Long pageNo;
    private Long pageSize;
    private Date startModified;
    private String status;
    private String type;
    private Boolean useHasNext;

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setEndModified(Date endModified) {
        this.endModified = endModified;
    }

    public Date getEndModified() {
        return this.endModified;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
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

    public void setStartModified(Date startModified) {
        this.startModified = startModified;
    }

    public Date getStartModified() {
        return this.startModified;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setUseHasNext(Boolean useHasNext) {
        this.useHasNext = useHasNext;
    }

    public Boolean getUseHasNext() {
        return this.useHasNext;
    }

    public String getApiMethodName() {
        return "taobao.refunds.receive.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("end_modified", this.endModified);
        txtParams.put("fields", this.fields);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_modified", this.startModified);
        txtParams.put("status", this.status);
        txtParams.put("type", this.type);
        txtParams.put("use_has_next", this.useHasNext);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<RefundsReceiveGetResponse> getResponseClass() {
        return RefundsReceiveGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkMaxListSize(this.fields, 100, "fields");
        RequestCheckUtils.checkMinValue(this.pageNo, 1L, "pageNo");
        RequestCheckUtils.checkMaxValue(this.pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(this.pageSize, 1L, "pageSize");
    }
}


