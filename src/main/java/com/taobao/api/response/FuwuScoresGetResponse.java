package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ScoreResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FuwuScoresGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1719758251544611462L;
    @ApiListField("score_result")
    @ApiField("score_result")
    private List<ScoreResult> scoreResult;

    public void setScoreResult(List<ScoreResult> scoreResult) {
        this.scoreResult = scoreResult;
    }

    public List<ScoreResult> getScoreResult() {
        return this.scoreResult;
    }
}


