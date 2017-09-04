package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsPartnersGetResponse;

import java.util.Map;

public class LogisticsPartnersGetRequest
        extends BaseTaobaoRequest<LogisticsPartnersGetResponse> {
    private String goodsValue;
    private Boolean isNeedCarriage;
    private String serviceType;
    private String sourceId;
    private String targetId;

    public void setGoodsValue(String goodsValue) {
        this.goodsValue = goodsValue;
    }

    public String getGoodsValue() {
        return this.goodsValue;
    }

    public void setIsNeedCarriage(Boolean isNeedCarriage) {
        this.isNeedCarriage = isNeedCarriage;
    }

    public Boolean getIsNeedCarriage() {
        return this.isNeedCarriage;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getTargetId() {
        return this.targetId;
    }

    public String getApiMethodName() {
        return "taobao.logistics.partners.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("goods_value", this.goodsValue);
        txtParams.put("is_need_carriage", this.isNeedCarriage);
        txtParams.put("service_type", this.serviceType);
        txtParams.put("source_id", this.sourceId);
        txtParams.put("target_id", this.targetId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsPartnersGetResponse> getResponseClass() {
        return LogisticsPartnersGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


