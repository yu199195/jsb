package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbWmsSkuInfoConfirmData;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsSkuInfoConfirmResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7746581399243587487L;
    @ApiField("result")
    private WlbWmsSkuInfoConfirmData result;

    public void setResult(WlbWmsSkuInfoConfirmData result) {
        this.result = result;
    }

    public WlbWmsSkuInfoConfirmData getResult() {
        return this.result;
    }
}


