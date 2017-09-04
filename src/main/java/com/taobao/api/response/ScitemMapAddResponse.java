package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class ScitemMapAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4528479221772337746L;
    @ApiField("outer_code")
    private String outerCode;

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public String getOuterCode() {
        return this.outerCode;
    }
}


