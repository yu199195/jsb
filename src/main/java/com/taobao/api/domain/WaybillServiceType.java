package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WaybillServiceType
        extends TaobaoObject {
    private static final long serialVersionUID = 8412488432389314224L;
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


