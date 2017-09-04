package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class WlbNotifyMessageConfirmResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6857762911821479748L;
    @ApiField("gmt_modified")
    private Date gmtModified;

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }
}


