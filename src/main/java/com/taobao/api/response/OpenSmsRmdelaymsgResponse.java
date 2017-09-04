package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.BmcResultVoid;
import com.taobao.api.internal.mapping.ApiField;

public class OpenSmsRmdelaymsgResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8448485188414333932L;
    @ApiField("result")
    private BmcResultVoid result;

    public void setResult(BmcResultVoid result) {
        this.result = result;
    }

    public BmcResultVoid getResult() {
        return this.result;
    }
}


