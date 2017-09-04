package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsUnknownPackageUploadResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5846424626421543133L;
    @ApiField("response")
    private Struct response;

    public void setResponse(Struct response) {
        this.response = response;
    }

    public Struct getResponse() {
        return this.response;
    }

    public static class Struct
            extends TaobaoObject {
        private static final long serialVersionUID = 1197199516827888136L;

        @ApiField("error_code")
        private String errorCode;

        @ApiField("error_msg")
        private String errorMsg;

        @ApiField("success")
        private String success;

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

        public String getSuccess() {
            return this.success;
        }

        public void setSuccess(String success) {
            this.success = success;
        }
    }
}


