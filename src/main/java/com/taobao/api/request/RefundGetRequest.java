package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundGetResponse;

import java.util.Map;

public class RefundGetRequest
        extends BaseTaobaoRequest<RefundGetResponse> {
    private String fields;
    private Long refundId;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public String getApiMethodName() {
        return "taobao.refund.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("refund_id", this.refundId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<RefundGetResponse> getResponseClass() {
        return RefundGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkMaxListSize(this.fields, 100, "fields");
        RequestCheckUtils.checkNotEmpty(this.refundId, "refundId");
        RequestCheckUtils.checkMaxValue(this.refundId, 9223372036854775807L, "refundId");
        RequestCheckUtils.checkMinValue(this.refundId, 1L, "refundId");
    }
}


