package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbItem;
import com.taobao.api.internal.mapping.ApiField;

public class WlbItemGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1275655357469354255L;
    @ApiField("item")
    private WlbItem item;

    public void setItem(WlbItem item) {
        this.item = item;
    }

    public WlbItem getItem() {
        return this.item;
    }
}


