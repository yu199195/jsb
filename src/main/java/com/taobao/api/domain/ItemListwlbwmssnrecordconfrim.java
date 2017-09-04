package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ItemListwlbwmssnrecordconfrim
        extends TaobaoObject {
    private static final long serialVersionUID = 3694477973988459445L;
    @ApiField("sn_item")
    private SnItemwlbwmssnrecordconfrim snItem;

    public SnItemwlbwmssnrecordconfrim getSnItem() {
        return this.snItem;
    }

    public void setSnItem(SnItemwlbwmssnrecordconfrim snItem) {
        this.snItem = snItem;
    }
}


