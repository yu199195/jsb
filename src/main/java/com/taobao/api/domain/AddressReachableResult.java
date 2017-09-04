package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class AddressReachableResult
        extends TaobaoObject {
    private static final long serialVersionUID = 8233213527758897396L;
    @ApiField("division_id")
    private Long divisionId;
    @ApiField("error_code")
    private String errorCode;
    @ApiField("error_msg")
    private String errorMsg;
    @ApiField("partner_code")
    private String partnerCode;
    @ApiField("partner_id")
    private Long partnerId;
    @ApiField("partner_name")
    private String partnerName;
    @ApiField("reachable")
    private Long reachable;
    @ApiField("service_type")
    private Long serviceType;
    @ApiField("success")
    private Boolean success;

    public Long getDivisionId() {
        return this.divisionId;
    }

    public void setDivisionId(Long divisionId) {
        this.divisionId = divisionId;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getPartnerCode() {
        return this.partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    public Long getPartnerId() {
        return this.partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return this.partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public Long getReachable() {
        return this.reachable;
    }

    public void setReachable(Long reachable) {
        this.reachable = reachable;
    }

    public Long getServiceType() {
        return this.serviceType;
    }

    public void setServiceType(Long serviceType) {
        this.serviceType = serviceType;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}


