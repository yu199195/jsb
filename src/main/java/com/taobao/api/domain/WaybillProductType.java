package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WaybillProductType
        extends TaobaoObject {
    private static final long serialVersionUID = 7832818884391432957L;
    @ApiField("code")
    private String code;
    @ApiField("name")
    private String name;
    @ApiListField("service_types")
    @ApiField("waybill_service_type")
    private List<WaybillServiceType> serviceTypes;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WaybillServiceType> getServiceTypes() {
        return this.serviceTypes;
    }

    public void setServiceTypes(List<WaybillServiceType> serviceTypes) {
        this.serviceTypes = serviceTypes;
    }
}


