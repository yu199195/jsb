package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class AlibabaAliqinTaNumberSinglecallbyttsResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3645179315644382976L;
    @ApiField("result")
    private Result result;

    public void setResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return this.result;
    }

    public static class Result
            extends TaobaoObject {
        private static final long serialVersionUID = 5134767939864649721L;

        @ApiField("model")
        private String model;

        @ApiField("msg")
        private String msg;

        @ApiField("success")
        private Boolean success;

        public String getModel() {
            return this.model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getMsg() {
            return this.msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public Boolean getSuccess() {
            return this.success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }
    }
}


