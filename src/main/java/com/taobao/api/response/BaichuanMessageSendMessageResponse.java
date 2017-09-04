package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class BaichuanMessageSendMessageResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8134257447696288196L;
    @ApiField("data")
    private String data;
    @ApiField("message")
    private String message;
    @ApiField("status_code")
    private Long statusCode;
    @ApiField("successful")
    private Boolean successful;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
    }

    public Long getStatusCode() {
        return this.statusCode;
    }

    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    public Boolean getSuccessful() {
        return this.successful;
    }
}


