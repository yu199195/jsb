package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDiscountsGetResponse;

import java.util.Map;

public class FenxiaoDiscountsGetRequest
        extends BaseTaobaoRequest<FenxiaoDiscountsGetResponse> {
    private Long discountId;
    private String extFields;

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Long getDiscountId() {
        return this.discountId;
    }

    public void setExtFields(String extFields) {
        this.extFields = extFields;
    }

    public String getExtFields() {
        return this.extFields;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.discounts.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("discount_id", this.discountId);
        txtParams.put("ext_fields", this.extFields);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoDiscountsGetResponse> getResponseClass() {
        return FenxiaoDiscountsGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


