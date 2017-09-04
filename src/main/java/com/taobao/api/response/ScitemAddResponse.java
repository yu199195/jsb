package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ScItem;
import com.taobao.api.internal.mapping.ApiField;

public class ScitemAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1884837221122247295L;
    @ApiField("sc_item")
    private ScItem scItem;

    public void setScItem(ScItem scItem) {
        this.scItem = scItem;
    }

    public ScItem getScItem() {
        return this.scItem;
    }
}


