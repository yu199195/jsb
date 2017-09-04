package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WmsInventoryQueryItemlist
        extends TaobaoObject {
    private static final long serialVersionUID = 7872415983584163177L;
    @ApiField("item")
    private WmsInventoryQueryItem item;

    public WmsInventoryQueryItem getItem() {
        return this.item;
    }

    public void setItem(WmsInventoryQueryItem item) {
        this.item = item;
    }
}


