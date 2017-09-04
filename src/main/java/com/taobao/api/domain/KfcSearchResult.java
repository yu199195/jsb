package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class KfcSearchResult
        extends TaobaoObject {
    private static final long serialVersionUID = 6729997341928195393L;
    @ApiField("content")
    private String content;
    @ApiField("level")
    private String level;
    @ApiField("matched")
    private Boolean matched;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Boolean getMatched() {
        return this.matched;
    }

    public void setMatched(Boolean matched) {
        this.matched = matched;
    }
}


