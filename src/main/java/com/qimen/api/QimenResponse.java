package com.qimen.api;

import com.taobao.api.internal.mapping.ApiField;

import java.io.Serializable;

public abstract class QimenResponse
        implements Serializable {
    private static final long serialVersionUID = 8987912149522024749L;
    @ApiField("flag")
    private String flag;
    @ApiField("code")
    private String code;
    @ApiField("message")
    private String message;
    private String body;

    public String getFlag() {
        return this.flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isSuccess() {
        return "success".equals(this.flag);
    }
}


