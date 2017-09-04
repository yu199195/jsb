package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoCbossWorkplatformWorkorderProcessNotifyResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4847563151756764543L;
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
        private static final long serialVersionUID = 3578951617711262246L;

        @ApiField("res_error_code")
        private String resErrorCode;

        @ApiField("res_error_msg")
        private String resErrorMsg;

        @ApiField("res_success")
        private Boolean resSuccess;

        public String getResErrorCode() {
            return this.resErrorCode;
        }

        public void setResErrorCode(String resErrorCode) {
            this.resErrorCode = resErrorCode;
        }

        public String getResErrorMsg() {
            return this.resErrorMsg;
        }

        public void setResErrorMsg(String resErrorMsg) {
            this.resErrorMsg = resErrorMsg;
        }

        public Boolean getResSuccess() {
            return this.resSuccess;
        }

        public void setResSuccess(Boolean resSuccess) {
            this.resSuccess = resSuccess;
        }
    }
}


