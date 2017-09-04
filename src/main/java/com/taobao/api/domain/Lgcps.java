package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Lgcps
        extends TaobaoObject {
    private static final long serialVersionUID = 3783344134295514314L;
    @ApiField("code")
    private String code;
    @ApiField("name")
    private String name;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


