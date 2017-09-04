package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradesSoldIncrementGetResponse;

import java.util.Date;
import java.util.Map;

public class TradesSoldIncrementGetRequest
        extends BaseTaobaoRequest<TradesSoldIncrementGetResponse> {
    private String buyerNick;
    private Date endModified;
    private String extType;
    private String fields;
    private Long pageNo;
    private Long pageSize;
    private String rateStatus;
    private Date startModified;
    private String status;
    private String tag;
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

    public void setExtType(String extType) {
        this.extType = extType;
    }

    public String getExtType() {
        return this.extType;
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

    public void setRateStatus(String rateStatus) {
        this.rateStatus = rateStatus;
    }

    public String getRateStatus() {
        return this.rateStatus;
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

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return this.tag;
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
        return "taobao.trades.sold.increment.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("end_modified", this.endModified);
        txtParams.put("ext_type", this.extType);
        txtParams.put("fields", this.fields);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("rate_status", this.rateStatus);
        txtParams.put("start_modified", this.startModified);
        txtParams.put("status", this.status);
        txtParams.put("tag", this.tag);
        txtParams.put("type", this.type);
        txtParams.put("use_has_next", this.useHasNext);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TradesSoldIncrementGetResponse> getResponseClass() {
        return TradesSoldIncrementGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.endModified, "endModified");
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkNotEmpty(this.startModified, "startModified");
    }
}


