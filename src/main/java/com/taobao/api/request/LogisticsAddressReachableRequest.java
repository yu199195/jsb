package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsAddressReachableResponse;

import java.util.Map;

public class LogisticsAddressReachableRequest
        extends BaseTaobaoRequest<LogisticsAddressReachableResponse> {
    private String address;
    private String areaCode;
    private String partnerIds;
    private Long serviceType;
    private String sourceAreaCode;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setPartnerIds(String partnerIds) {
        this.partnerIds = partnerIds;
    }

    public String getPartnerIds() {
        return this.partnerIds;
    }

    public void setServiceType(Long serviceType) {
        this.serviceType = serviceType;
    }

    public Long getServiceType() {
        return this.serviceType;
    }

    public void setSourceAreaCode(String sourceAreaCode) {
        this.sourceAreaCode = sourceAreaCode;
    }

    public String getSourceAreaCode() {
        return this.sourceAreaCode;
    }

    public String getApiMethodName() {
        return "taobao.logistics.address.reachable";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address", this.address);
        txtParams.put("area_code", this.areaCode);
        txtParams.put("partner_ids", this.partnerIds);
        txtParams.put("service_type", this.serviceType);
        txtParams.put("source_area_code", this.sourceAreaCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsAddressReachableResponse> getResponseClass() {
        return LogisticsAddressReachableResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.partnerIds, "partnerIds");
        RequestCheckUtils.checkNotEmpty(this.serviceType, "serviceType");
    }
}


