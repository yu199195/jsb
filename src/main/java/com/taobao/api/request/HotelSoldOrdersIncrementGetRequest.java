package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelSoldOrdersIncrementGetResponse;

import java.util.Date;
import java.util.Map;

public class HotelSoldOrdersIncrementGetRequest
        extends BaseTaobaoRequest<HotelSoldOrdersIncrementGetResponse> {
    private Date endModified;
    private Boolean needGuest;
    private Boolean needMessage;
    private Long pageNo;
    private Long pageSize;
    private Date startModified;
    private String status;
    private Boolean useHasNext;

    public void setEndModified(Date endModified) {
        this.endModified = endModified;
    }

    public Date getEndModified() {
        return this.endModified;
    }

    public void setNeedGuest(Boolean needGuest) {
        this.needGuest = needGuest;
    }

    public Boolean getNeedGuest() {
        return this.needGuest;
    }

    public void setNeedMessage(Boolean needMessage) {
        this.needMessage = needMessage;
    }

    public Boolean getNeedMessage() {
        return this.needMessage;
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

    public void setUseHasNext(Boolean useHasNext) {
        this.useHasNext = useHasNext;
    }

    public Boolean getUseHasNext() {
        return this.useHasNext;
    }

    public String getApiMethodName() {
        return "taobao.hotel.sold.orders.increment.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_modified", this.endModified);
        txtParams.put("need_guest", this.needGuest);
        txtParams.put("need_message", this.needMessage);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_modified", this.startModified);
        txtParams.put("status", this.status);
        txtParams.put("use_has_next", this.useHasNext);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<HotelSoldOrdersIncrementGetResponse> getResponseClass() {
        return HotelSoldOrdersIncrementGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.endModified, "endModified");
        RequestCheckUtils.checkNotEmpty(this.startModified, "startModified");
        RequestCheckUtils.checkMaxLength(this.status, 1, "status");
    }
}


