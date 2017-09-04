package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class BmcResultVoid
        extends TaobaoObject {
    private static final long serialVersionUID = 1621243372289471197L;
    @ApiField("code")
    private Long code;
    @ApiField("message")
    private String message;
    @ApiField("successful")
    private Boolean successful;

    public Long getCode() {
        return this.code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccessful() {
        return this.successful;
    }

    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }
}


