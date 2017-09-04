package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class PicturePicturesCountResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6412153186275173138L;
    @ApiField("totals")
    private Long totals;

    public void setTotals(Long totals) {
        this.totals = totals;
    }

    public Long getTotals() {
        return this.totals;
    }
}


