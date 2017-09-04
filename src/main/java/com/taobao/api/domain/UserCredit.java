package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class UserCredit
        extends TaobaoObject {
    private static final long serialVersionUID = 2633329533568245894L;
    @ApiField("good_num")
    private Long goodNum;
    @ApiField("level")
    private Long level;
    @ApiField("score")
    private Long score;
    @ApiField("total_num")
    private Long totalNum;

    public Long getGoodNum() {
        return this.goodNum;
    }

    public void setGoodNum(Long goodNum) {
        this.goodNum = goodNum;
    }

    public Long getLevel() {
        return this.level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getScore() {
        return this.score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getTotalNum() {
        return this.totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }
}


