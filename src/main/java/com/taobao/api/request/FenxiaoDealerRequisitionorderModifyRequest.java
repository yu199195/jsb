package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDealerRequisitionorderModifyResponse;

import java.util.Map;

public class FenxiaoDealerRequisitionorderModifyRequest
        extends BaseTaobaoRequest<FenxiaoDealerRequisitionorderModifyResponse> {
    private Long dealerOrderId;
    private String deleteDetailIds;
    private String detailIdPrices;
    private String detailIdQuantities;
    private Long newPostFee;

    public void setDealerOrderId(Long dealerOrderId) {
        this.dealerOrderId = dealerOrderId;
    }

    public Long getDealerOrderId() {
        return this.dealerOrderId;
    }

    public void setDeleteDetailIds(String deleteDetailIds) {
        this.deleteDetailIds = deleteDetailIds;
    }

    public String getDeleteDetailIds() {
        return this.deleteDetailIds;
    }

    public void setDetailIdPrices(String detailIdPrices) {
        this.detailIdPrices = detailIdPrices;
    }

    public String getDetailIdPrices() {
        return this.detailIdPrices;
    }

    public void setDetailIdQuantities(String detailIdQuantities) {
        this.detailIdQuantities = detailIdQuantities;
    }

    public String getDetailIdQuantities() {
        return this.detailIdQuantities;
    }

    public void setNewPostFee(Long newPostFee) {
        this.newPostFee = newPostFee;
    }

    public Long getNewPostFee() {
        return this.newPostFee;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.dealer.requisitionorder.modify";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("dealer_order_id", this.dealerOrderId);
        txtParams.put("delete_detail_ids", this.deleteDetailIds);
        txtParams.put("detail_id_prices", this.detailIdPrices);
        txtParams.put("detail_id_quantities", this.detailIdQuantities);
        txtParams.put("new_post_fee", this.newPostFee);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoDealerRequisitionorderModifyResponse> getResponseClass() {
        return FenxiaoDealerRequisitionorderModifyResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.dealerOrderId, "dealerOrderId");
        RequestCheckUtils.checkMaxListSize(this.deleteDetailIds, 50, "deleteDetailIds");
        RequestCheckUtils.checkMaxListSize(this.detailIdPrices, 50, "detailIdPrices");
        RequestCheckUtils.checkMaxListSize(this.detailIdQuantities, 50, "detailIdQuantities");
    }
}


