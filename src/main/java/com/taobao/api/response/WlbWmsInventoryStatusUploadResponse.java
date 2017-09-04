package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbWmsInventoryStatusUploadResp;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsInventoryStatusUploadResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8379124231389811822L;
    @ApiField("result")
    private WlbWmsInventoryStatusUploadResp result;

    public void setResult(WlbWmsInventoryStatusUploadResp result) {
        this.result = result;
    }

    public WlbWmsInventoryStatusUploadResp getResult() {
        return this.result;
    }
}


