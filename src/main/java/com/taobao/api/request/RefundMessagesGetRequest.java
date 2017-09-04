package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundMessagesGetResponse;

import java.util.Map;

public class RefundMessagesGetRequest
        extends BaseTaobaoRequest<RefundMessagesGetResponse> {
    private String fields;
    private Long pageNo;
    private Long pageSize;
    private Long refundId;
    private String refundPhase;

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

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public void setRefundPhase(String refundPhase) {
        this.refundPhase = refundPhase;
    }

    public String getRefundPhase() {
        return this.refundPhase;
    }

    public String getApiMethodName() {
        return "taobao.refund.messages.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("refund_id", this.refundId);
        txtParams.put("refund_phase", this.refundPhase);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<RefundMessagesGetResponse> getResponseClass() {
        return RefundMessagesGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkMaxListSize(this.fields, 100, "fields");
        RequestCheckUtils.checkMinValue(this.pageNo, 1L, "pageNo");
        RequestCheckUtils.checkMaxValue(this.pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(this.pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(this.refundId, "refundId");
        RequestCheckUtils.checkMinValue(this.refundId, 1L, "refundId");
    }
}


