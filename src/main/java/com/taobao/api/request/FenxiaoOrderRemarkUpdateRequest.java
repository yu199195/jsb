package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoOrderRemarkUpdateResponse;

import java.util.Map;

public class FenxiaoOrderRemarkUpdateRequest
        extends BaseTaobaoRequest<FenxiaoOrderRemarkUpdateResponse> {
    private Long purchaseOrderId;
    private String supplierMemo;
    private Long supplierMemoFlag;

    public void setPurchaseOrderId(Long purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Long getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    public void setSupplierMemo(String supplierMemo) {
        this.supplierMemo = supplierMemo;
    }

    public String getSupplierMemo() {
        return this.supplierMemo;
    }

    public void setSupplierMemoFlag(Long supplierMemoFlag) {
        this.supplierMemoFlag = supplierMemoFlag;
    }

    public Long getSupplierMemoFlag() {
        return this.supplierMemoFlag;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.order.remark.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("purchase_order_id", this.purchaseOrderId);
        txtParams.put("supplier_memo", this.supplierMemo);
        txtParams.put("supplier_memo_flag", this.supplierMemoFlag);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoOrderRemarkUpdateResponse> getResponseClass() {
        return FenxiaoOrderRemarkUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.purchaseOrderId, "purchaseOrderId");
        RequestCheckUtils.checkNotEmpty(this.supplierMemo, "supplierMemo");
        RequestCheckUtils.checkMaxValue(this.supplierMemoFlag, 5L, "supplierMemoFlag");
        RequestCheckUtils.checkMinValue(this.supplierMemoFlag, 1L, "supplierMemoFlag");
    }
}


