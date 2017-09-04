package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Expresses
        extends TaobaoObject {
    private static final long serialVersionUID = 3173148859332976765L;
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


