package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradesSoldIncrementvGetResponse;

import java.util.Date;
import java.util.Map;

public class TradesSoldIncrementvGetRequest
        extends BaseTaobaoRequest<TradesSoldIncrementvGetResponse> {
    private Date endCreate;
    private String extType;
    private String fields;
    private Long pageNo;
    private Long pageSize;
    private Date startCreate;
    private String status;
    private String tag;
    private String type;
    private Boolean useHasNext;

    public void setEndCreate(Date endCreate) {
        this.endCreate = endCreate;
    }

    public Date getEndCreate() {
        return this.endCreate;
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

    public void setStartCreate(Date startCreate) {
        this.startCreate = startCreate;
    }

    public Date getStartCreate() {
        return this.startCreate;
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
        return "taobao.trades.sold.incrementv.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_create", this.endCreate);
        txtParams.put("ext_type", this.extType);
        txtParams.put("fields", this.fields);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_create", this.startCreate);
        txtParams.put("status", this.status);
        txtParams.put("tag", this.tag);
        txtParams.put("type", this.type);
        txtParams.put("use_has_next", this.useHasNext);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TradesSoldIncrementvGetResponse> getResponseClass() {
        return TradesSoldIncrementvGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.endCreate, "endCreate");
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkMinValue(this.pageNo, 1L, "pageNo");
        RequestCheckUtils.checkMinValue(this.pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(this.startCreate, "startCreate");
    }
}


