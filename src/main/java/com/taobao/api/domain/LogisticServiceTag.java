package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class LogisticServiceTag
        extends TaobaoObject {
    private static final long serialVersionUID = 2393652393461294616L;
    @ApiField("service_tag")
    private String serviceTag;
    @ApiField("service_type")
    private String serviceType;

    public String getServiceTag() {
        return this.serviceTag;
    }

    public void setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}


