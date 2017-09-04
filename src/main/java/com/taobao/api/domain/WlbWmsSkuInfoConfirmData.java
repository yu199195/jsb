package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsSkuInfoConfirmData
        extends TaobaoObject {
    private static final long serialVersionUID = 7228199119433653516L;
    @ApiField("error_code")
    private String errorCode;
    @ApiField("error_msg")
    private String errorMsg;
    @ApiField("success")
    private Boolean success;

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

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}


