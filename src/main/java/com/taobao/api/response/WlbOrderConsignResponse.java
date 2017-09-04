package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class WlbOrderConsignResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6489485749829678196L;
    @ApiField("modify_time")
    private Date modifyTime;

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }
}


