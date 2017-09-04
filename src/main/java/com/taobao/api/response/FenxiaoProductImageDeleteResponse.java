package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class FenxiaoProductImageDeleteResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2631884248621278224L;
    @ApiField("created")
    private Date created;
    @ApiField("result")
    private Boolean result;

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Boolean getResult() {
        return this.result;
    }
}


