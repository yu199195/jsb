package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class TmcProduceResult
        extends TaobaoObject {
    private static final long serialVersionUID = 8143387182661295366L;
    @ApiField("error_code")
    private String errorCode;
    @ApiField("error_message")
    private String errorMessage;
    @ApiField("is_success")
    private Boolean isSuccess;

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
}


