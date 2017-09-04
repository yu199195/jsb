package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.BizResult;
import com.taobao.api.internal.mapping.ApiField;

public class AlibabaAliqinTaSmsNumSendResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4761915476812913638L;
    @ApiField("result")
    private BizResult result;

    public void setResult(BizResult result) {
        this.result = result;
    }

    public BizResult getResult() {
        return this.result;
    }
}


