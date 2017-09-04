package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class AppipGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3623911535792963673L;
    @ApiField("ip")
    private String ip;

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return this.ip;
    }
}


