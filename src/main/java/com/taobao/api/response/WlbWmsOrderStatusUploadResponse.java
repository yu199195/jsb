package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbWmsOrderStatusUploadResp;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsOrderStatusUploadResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2843393977283292158L;
    @ApiField("result")
    private WlbWmsOrderStatusUploadResp result;

    public void setResult(WlbWmsOrderStatusUploadResp result) {
        this.result = result;
    }

    public WlbWmsOrderStatusUploadResp getResult() {
        return this.result;
    }
}


