package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoOrderCloseResponse;

import java.util.Map;

public class FenxiaoOrderCloseRequest
        extends BaseTaobaoRequest<FenxiaoOrderCloseResponse> {
    private String message;
    private Long purchaseOrderId;
    private String subOrderIds;

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

    public void setSubOrderIds(String subOrderIds) {
        this.subOrderIds = subOrderIds;
    }

    public String getSubOrderIds() {
        return this.subOrderIds;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.order.close";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("message", this.message);
        txtParams.put("purchase_order_id", this.purchaseOrderId);
        txtParams.put("sub_order_ids", this.subOrderIds);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoOrderCloseResponse> getResponseClass() {
        return FenxiaoOrderCloseResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.message, "message");
        RequestCheckUtils.checkMaxLength(this.message, 200, "message");
        RequestCheckUtils.checkNotEmpty(this.purchaseOrderId, "purchaseOrderId");
    }
}


