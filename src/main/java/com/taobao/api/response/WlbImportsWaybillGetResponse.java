package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WlbImportsWaybillGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2179948297149885729L;
    @ApiField("waybillurl")
    private String waybillurl;

    public void setWaybillurl(String waybillurl) {
        this.waybillurl = waybillurl;
    }

    public String getWaybillurl() {
        return this.waybillurl;
    }
}


