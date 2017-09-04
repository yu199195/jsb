package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDiscountAddResponse;

import java.util.Map;

public class FenxiaoDiscountAddRequest
        extends BaseTaobaoRequest<FenxiaoDiscountAddResponse> {
    private String discountName;
    private String discountTypes;
    private String discountValues;
    private String targetIds;
    private String targetTypes;

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public String getDiscountName() {
        return this.discountName;
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
        return "taobao.fenxiao.discount.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("discount_name", this.discountName);
        txtParams.put("discount_types", this.discountTypes);
        txtParams.put("discount_values", this.discountValues);
        txtParams.put("target_ids", this.targetIds);
        txtParams.put("target_types", this.targetTypes);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoDiscountAddResponse> getResponseClass() {
        return FenxiaoDiscountAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.discountName, "discountName");
        RequestCheckUtils.checkNotEmpty(this.discountTypes, "discountTypes");
        RequestCheckUtils.checkNotEmpty(this.discountValues, "discountValues");
        RequestCheckUtils.checkNotEmpty(this.targetIds, "targetIds");
        RequestCheckUtils.checkNotEmpty(this.targetTypes, "targetTypes");
    }
}


