package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class TopResultCode
        extends TaobaoObject {
    private static final long serialVersionUID = 6378387685889134789L;
    @ApiField("code")
    private String code;
    @ApiField("msg")
    private String msg;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}


