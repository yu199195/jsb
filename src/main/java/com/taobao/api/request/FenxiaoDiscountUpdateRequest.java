package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDiscountUpdateResponse;

import java.util.Map;

public class FenxiaoDiscountUpdateRequest
        extends BaseTaobaoRequest<FenxiaoDiscountUpdateResponse> {
    private String detailIds;
    private String detailStatuss;
    private Long discountId;
    private String discountName;
    private String discountStatus;
    private String discountTypes;
    private String discountValues;
    private String targetIds;
    private String targetTypes;

    public void setDetailIds(String detailIds) {
        this.detailIds = detailIds;
    }

    public String getDetailIds() {
        return this.detailIds;
    }

    public void setDetailStatuss(String detailStatuss) {
        this.detailStatuss = detailStatuss;
    }

    public String getDetailStatuss() {
        return this.detailStatuss;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Long getDiscountId() {
        return this.discountId;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public String getDiscountName() {
        return this.discountName;
    }

    public void setDiscountStatus(String discountStatus) {
        this.discountStatus = discountStatus;
    }

    public String getDiscountStatus() {
        return this.discountStatus;
    }

    public void setDiscountTypes(String discountTypes) {
        this.discountTypes = discountTypes;
    }

    public String getDiscountTypes() {
        return this.discountTypes;
    }

    public void setDiscountValues(String discountValues) {
        this.discountValues = discountValues;
    }

    public String getDiscountValues() {
        return this.discountValues;
    }

    public void setTargetIds(String targetIds) {
        this.targetIds = targetIds;
    }

    public String getTargetIds() {
        return this.targetIds;
    }

    public void setTargetTypes(String targetTypes) {
        this.targetTypes = targetTypes;
    }

    public String getTargetTypes() {
        return this.targetTypes;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.discount.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("detail_ids", this.detailIds);
        txtParams.put("detail_statuss", this.detailStatuss);
        txtParams.put("discount_id", this.discountId);
        txtParams.put("discount_name", this.discountName);
        txtParams.put("discount_status", this.discountStatus);
        txtParams.put("discount_types", this.discountTypes);
        txtParams.put("discount_values", this.discountValues);
        txtParams.put("target_ids", this.targetIds);
        txtParams.put("target_types", this.targetTypes);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoDiscountUpdateResponse> getResponseClass() {
        return FenxiaoDiscountUpdateResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


