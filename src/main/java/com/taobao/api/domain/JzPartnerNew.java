package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class JzPartnerNew
        extends TaobaoObject {
    private static final long serialVersionUID = 2799556435851591567L;
    @ApiField("is_virtual_tp")
    private Boolean isVirtualTp;
    @ApiField("service_type")
    private Long serviceType;
    @ApiField("tp_code")
    private String tpCode;
    @ApiField("tp_name")
    private String tpName;

    public Boolean getIsVirtualTp() {
        return this.isVirtualTp;
    }

    public void setIsVirtualTp(Boolean isVirtualTp) {
        this.isVirtualTp = isVirtualTp;
    }

    public Long getServiceType() {
        return this.serviceType;
    }

    public void setServiceType(Long serviceType) {
        this.serviceType = serviceType;
    }

    public String getTpCode() {
        return this.tpCode;
    }

    public void setTpCode(String tpCode) {
        this.tpCode = tpCode;
    }

    public String getTpName() {
        return this.tpName;
    }

    public void setTpName(String tpName) {
        this.tpName = tpName;
    }
}


