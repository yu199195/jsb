package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDealerRequisitionorderRefuseResponse;

import java.util.Map;

public class FenxiaoDealerRequisitionorderRefuseRequest
        extends BaseTaobaoRequest<FenxiaoDealerRequisitionorderRefuseResponse> {
    private Long dealerOrderId;
    private Long reason;
    private String reasonDetail;

    public void setDealerOrderId(Long dealerOrderId) {
        this.dealerOrderId = dealerOrderId;
    }

    public Long getDealerOrderId() {
        return this.dealerOrderId;
    }

    public void setReason(Long reason) {
        this.reason = reason;
    }

    public Long getReason() {
        return this.reason;
    }

    public void setReasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
    }

    public String getReasonDetail() {
        return this.reasonDetail;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.dealer.requisitionorder.refuse";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("dealer_order_id", this.dealerOrderId);
        txtParams.put("reason", this.reason);
        txtParams.put("reason_detail", this.reasonDetail);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoDealerRequisitionorderRefuseResponse> getResponseClass() {
        return FenxiaoDealerRequisitionorderRefuseResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.dealerOrderId, "dealerOrderId");
        RequestCheckUtils.checkNotEmpty(this.reason, "reason");
        RequestCheckUtils.checkNotEmpty(this.reasonDetail, "reasonDetail");
    }
}


