package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoWaybillIiUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4561168333849859425L;
    @ApiField("encoding_type")
    private String encodingType;
    @ApiField("print_data")
    private String printData;
    @ApiField("signature")
    private String signature;
    @ApiField("template_url")
    private String templateUrl;
    @ApiField("waybill_code")
    private String waybillCode;

    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    public String getEncodingType() {
        return this.encodingType;
    }

    public void setPrintData(String printData) {
        this.printData = printData;
    }

    public String getPrintData() {
        return this.printData;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return this.signature;
    }

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    public String getTemplateUrl() {
        return this.templateUrl;
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }

    public String getWaybillCode() {
        return this.waybillCode;
    }
}


