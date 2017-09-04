package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbWmsInventoryCountResp;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsInventoryCountResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1154179218382283642L;
    @ApiField("result")
    private WlbWmsInventoryCountResp result;

    public void setResult(WlbWmsInventoryCountResp result) {
        this.result = result;
    }

    public WlbWmsInventoryCountResp getResult() {
        return this.result;
    }
}


