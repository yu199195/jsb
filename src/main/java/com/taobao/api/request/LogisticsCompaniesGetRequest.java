package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsCompaniesGetResponse;

import java.util.Map;

public class LogisticsCompaniesGetRequest
        extends BaseTaobaoRequest<LogisticsCompaniesGetResponse> {
    private String fields;
    private Boolean isRecommended;
    private String orderMode;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setIsRecommended(Boolean isRecommended) {
        this.isRecommended = isRecommended;
    }

    public Boolean getIsRecommended() {
        return this.isRecommended;
    }

    public void setOrderMode(String orderMode) {
        this.orderMode = orderMode;
    }

    public String getOrderMode() {
        return this.orderMode;
    }

    public String getApiMethodName() {
        return "taobao.logistics.companies.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("is_recommended", this.isRecommended);
        txtParams.put("order_mode", this.orderMode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsCompaniesGetResponse> getResponseClass() {
        return LogisticsCompaniesGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkMaxListSize(this.fields, 20, "fields");
    }
}


