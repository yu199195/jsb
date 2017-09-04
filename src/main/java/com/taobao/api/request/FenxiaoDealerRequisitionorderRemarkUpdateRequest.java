package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDealerRequisitionorderRemarkUpdateResponse;

import java.util.Map;

public class FenxiaoDealerRequisitionorderRemarkUpdateRequest
        extends BaseTaobaoRequest<FenxiaoDealerRequisitionorderRemarkUpdateResponse> {
    private Long dealerOrderId;
    private String supplierMemo;
    private Long supplierMemoFlag;

    public void setDealerOrderId(Long dealerOrderId) {
        this.dealerOrderId = dealerOrderId;
    }

    public Long getDealerOrderId() {
        return this.dealerOrderId;
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
        return "taobao.fenxiao.dealer.requisitionorder.remark.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("dealer_order_id", this.dealerOrderId);
        txtParams.put("supplier_memo", this.supplierMemo);
        txtParams.put("supplier_memo_flag", this.supplierMemoFlag);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoDealerRequisitionorderRemarkUpdateResponse> getResponseClass() {
        return FenxiaoDealerRequisitionorderRemarkUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.dealerOrderId, "dealerOrderId");
        RequestCheckUtils.checkNotEmpty(this.supplierMemoFlag, "supplierMemoFlag");
        RequestCheckUtils.checkMaxValue(this.supplierMemoFlag, 5L, "supplierMemoFlag");
        RequestCheckUtils.checkMinValue(this.supplierMemoFlag, 1L, "supplierMemoFlag");
    }
}


