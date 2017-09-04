package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class BizResult
        extends TaobaoObject {
    private static final long serialVersionUID = 7169774688145928718L;
    @ApiField("err_code")
    private String errCode;
    @ApiField("model")
    private String model;
    @ApiField("msg")
    private String msg;
    @ApiField("success")
    private Boolean success;

    public String getErrCode() {
        return this.errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

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


