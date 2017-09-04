package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoOrderMessageAddResponse;

import java.util.Map;

public class FenxiaoOrderMessageAddRequest
        extends BaseTaobaoRequest<FenxiaoOrderMessageAddResponse> {
    private String message;
    private Long purchaseOrderId;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setPurchaseOrderId(Long purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Long getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.order.message.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("message", this.message);
        txtParams.put("purchase_order_id", this.purchaseOrderId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoOrderMessageAddResponse> getResponseClass() {
        return FenxiaoOrderMessageAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.message, "message");
        RequestCheckUtils.checkNotEmpty(this.purchaseOrderId, "purchaseOrderId");
    }
}


