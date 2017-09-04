package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.KfcSearchResult;
import com.taobao.api.internal.mapping.ApiField;

public class KfcKeywordSearchResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6199125763635662595L;
    @ApiField("kfc_search_result")
    private KfcSearchResult kfcSearchResult;

    public void setKfcSearchResult(KfcSearchResult kfcSearchResult) {
        this.kfcSearchResult = kfcSearchResult;
    }

    public KfcSearchResult getKfcSearchResult() {
        return this.kfcSearchResult;
    }
}


