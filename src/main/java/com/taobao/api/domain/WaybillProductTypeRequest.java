package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WaybillProductTypeRequest
        extends TaobaoObject {
    private static final long serialVersionUID = 3383154124633187842L;
    @ApiField("cp_code")
    private String cpCode;

    public String getCpCode() {
        return this.cpCode;
    }

    public void setCpCode(String cpCode) {
        this.cpCode = cpCode;
    }
}


