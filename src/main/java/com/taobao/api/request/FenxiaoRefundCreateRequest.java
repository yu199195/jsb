package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoRefundCreateResponse;

import java.util.Map;

public class FenxiaoRefundCreateRequest
        extends BaseTaobaoRequest<FenxiaoRefundCreateResponse> {
    private Boolean isReturnGoods;
    private Boolean isReturnPostFee;
    private String refundDesc;
    private Long refundReasonId;
    private Long returnFee;
    private Long subOrderId;

    public void setIsReturnGoods(Boolean isReturnGoods) {
        this.isReturnGoods = isReturnGoods;
    }

    public Boolean getIsReturnGoods() {
        return this.isReturnGoods;
    }

    public void setIsReturnPostFee(Boolean isReturnPostFee) {
        this.isReturnPostFee = isReturnPostFee;
    }

    public Boolean getIsReturnPostFee() {
        return this.isReturnPostFee;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    public String getRefundDesc() {
        return this.refundDesc;
    }

    public void setRefundReasonId(Long refundReasonId) {
        this.refundReasonId = refundReasonId;
    }

    public Long getRefundReasonId() {
        return this.refundReasonId;
    }

    public void setReturnFee(Long returnFee) {
        this.returnFee = returnFee;
    }

    public Long getReturnFee() {
        return this.returnFee;
    }

    public void setSubOrderId(Long subOrderId) {
        this.subOrderId = subOrderId;
    }

    public Long getSubOrderId() {
        return this.subOrderId;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.refund.create";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("is_return_goods", this.isReturnGoods);
        txtParams.put("is_return_post_fee", this.isReturnPostFee);
        txtParams.put("refund_desc", this.refundDesc);
        txtParams.put("refund_reason_id", this.refundReasonId);
        txtParams.put("return_fee", this.returnFee);
        txtParams.put("sub_order_id", this.subOrderId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoRefundCreateResponse> getResponseClass() {
        return FenxiaoRefundCreateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.isReturnGoods, "isReturnGoods");
        RequestCheckUtils.checkNotEmpty(this.isReturnPostFee, "isReturnPostFee");
        RequestCheckUtils.checkNotEmpty(this.refundDesc, "refundDesc");
        RequestCheckUtils.checkNotEmpty(this.refundReasonId, "refundReasonId");
        RequestCheckUtils.checkNotEmpty(this.returnFee, "returnFee");
        RequestCheckUtils.checkNotEmpty(this.subOrderId, "subOrderId");
    }
}


