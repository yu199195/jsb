package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WangwangClientidUnbindResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3656857881789362732L;
    @ApiField("result")
    private Long result;

    public void setResult(Long result) {
        this.result = result;
    }

    public Long getResult() {
        return this.result;
    }
}


