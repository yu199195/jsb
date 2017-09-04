package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoOrderConfirmPaidResponse;

import java.util.Map;

public class FenxiaoOrderConfirmPaidRequest
        extends BaseTaobaoRequest<FenxiaoOrderConfirmPaidResponse> {
    private String confirmRemark;
    private Long purchaseOrderId;

    public void setConfirmRemark(String confirmRemark) {
        this.confirmRemark = confirmRemark;
    }

    public String getConfirmRemark() {
        return this.confirmRemark;
    }

    public void setPurchaseOrderId(Long purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Long getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.order.confirm.paid";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("confirm_remark", this.confirmRemark);
        txtParams.put("purchase_order_id", this.purchaseOrderId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoOrderConfirmPaidResponse> getResponseClass() {
        return FenxiaoOrderConfirmPaidResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.purchaseOrderId, "purchaseOrderId");
    }
}


