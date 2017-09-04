package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class AddressReachable
        extends TaobaoObject {
    private static final long serialVersionUID = 5449723543913566391L;
    @ApiField("address")
    private String address;
    @ApiField("area_code")
    private String areaCode;
    @ApiField("partner_id")
    private String partnerId;
    @ApiField("service_type")
    private Long serviceType;
    @ApiField("source_area_code")
    private String sourceAreaCode;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPartnerId() {
        return this.partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public Long getServiceType() {
        return this.serviceType;
    }

    public void setServiceType(Long serviceType) {
        this.serviceType = serviceType;
    }

    public String getSourceAreaCode() {
        return this.sourceAreaCode;
    }

    public void setSourceAreaCode(String sourceAreaCode) {
        this.sourceAreaCode = sourceAreaCode;
    }
}


