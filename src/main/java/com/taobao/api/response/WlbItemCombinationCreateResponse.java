package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class WlbItemCombinationCreateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3389225216123277578L;
    @ApiField("gmt_create")
    private Date gmtCreate;

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }
}


