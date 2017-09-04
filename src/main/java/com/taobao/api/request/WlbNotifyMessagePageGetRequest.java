package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbNotifyMessagePageGetResponse;

import java.util.Date;
import java.util.Map;

public class WlbNotifyMessagePageGetRequest
        extends BaseTaobaoRequest<WlbNotifyMessagePageGetResponse> {
    private Date endDate;
    private String msgCode;
    private Long pageNo;
    private Long pageSize;
    private Date startDate;
    private String status;

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public String getMsgCode() {
        return this.msgCode;
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

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public String getApiMethodName() {
        return "taobao.wlb.notify.message.page.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_date", this.endDate);
        txtParams.put("msg_code", this.msgCode);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_date", this.startDate);
        txtParams.put("status", this.status);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbNotifyMessagePageGetResponse> getResponseClass() {
        return WlbNotifyMessagePageGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


