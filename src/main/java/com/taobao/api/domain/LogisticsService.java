package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class LogisticsService
        extends TaobaoObject {
    private static final long serialVersionUID = 4127597572164783857L;
    @ApiField("service_code")
    private String serviceCode;
    @ApiField("service_name")
    private String serviceName;
    @ApiField("service_value4_json")
    private String serviceValue4Json;

    public String getServiceCode() {
        return this.serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceValue4Json() {
        return this.serviceValue4Json;
    }

    public void setServiceValue4Json(String serviceValue4Json) {
        this.serviceValue4Json = serviceValue4Json;
    }
}


