package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class TimeGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2836473868496642592L;
    @ApiField("time")
    private Date time;

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return this.time;
    }
}


