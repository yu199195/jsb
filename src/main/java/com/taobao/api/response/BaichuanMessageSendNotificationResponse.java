package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class BaichuanMessageSendNotificationResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7287123378175576988L;
    @ApiField("data")
    private String data;
    @ApiField("status_code")
    private Long statusCode;
    @ApiField("status_message")
    private String statusMessage;
    @ApiField("successful")
    private Boolean successful;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
    }

    public Long getStatusCode() {
        return this.statusCode;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    public Boolean getSuccessful() {
        return this.successful;
    }
}


