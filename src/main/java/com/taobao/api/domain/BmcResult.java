package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class BmcResult
        extends TaobaoObject {
    private static final long serialVersionUID = 4279667846812358263L;
    @ApiField("code")
    private Long code;
    @ApiField("data")
    private String data;
    @ApiField("datas")
    private SendMessageResult datas;
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

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDataString(String data) {
        this.data = data;
    }

    public SendMessageResult getDatas() {
        return this.datas;
    }

    public void setDatas(SendMessageResult datas) {
        this.datas = datas;
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


