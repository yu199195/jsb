package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WlbItemUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1159379494757561398L;
    @ApiField("gmt_modified")
    private Boolean gmtModified;

    public void setGmtModified(Boolean gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Boolean getGmtModified() {
        return this.gmtModified;
    }
}


