package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Destitemlistwlbwmsskucombinationcreateupdate
        extends TaobaoObject {
    private static final long serialVersionUID = 3357229399172675752L;
    @ApiField("dest_item")
    private Destitemwlbwmsskucombinationcreateupdate destItem;

    public Destitemwlbwmsskucombinationcreateupdate getDestItem() {
        return this.destItem;
    }

    public void setDestItem(Destitemwlbwmsskucombinationcreateupdate destItem) {
        this.destItem = destItem;
    }
}


