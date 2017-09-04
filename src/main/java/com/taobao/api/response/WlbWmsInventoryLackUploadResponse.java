package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbWmsInventoryLackUploadResp;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsInventoryLackUploadResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2413293363595957841L;
    @ApiField("result")
    private WlbWmsInventoryLackUploadResp result;

    public void setResult(WlbWmsInventoryLackUploadResp result) {
        this.result = result;
    }

    public WlbWmsInventoryLackUploadResp getResult() {
        return this.result;
    }
}


