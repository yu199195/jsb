package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.BmcResult;
import com.taobao.api.internal.mapping.ApiField;

public class OpenSmsSendmsgResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1768849237118433752L;
    @ApiField("result")
    private BmcResult result;

    public void setResult(BmcResult result) {
        this.result = result;
    }

    public BmcResult getResult() {
        return this.result;
    }
}


