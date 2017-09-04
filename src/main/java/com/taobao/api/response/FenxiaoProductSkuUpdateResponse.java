package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class FenxiaoProductSkuUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7418192976361238367L;
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


