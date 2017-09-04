package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsInventoryLackUploadResp
        extends TaobaoObject {
    private static final long serialVersionUID = 1767757129869616563L;
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


