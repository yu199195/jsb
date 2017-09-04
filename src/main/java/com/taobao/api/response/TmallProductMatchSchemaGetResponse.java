package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallProductMatchSchemaGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1253865247287816127L;
    @ApiField("match_result")
    private String matchResult;

    public void setMatchResult(String matchResult) {
        this.matchResult = matchResult;
    }

    public String getMatchResult() {
        return this.matchResult;
    }
}


