package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Destitemwlbwmsskucombinationcreateupdate
        extends TaobaoObject {
    private static final long serialVersionUID = 2145848719539117919L;
    @ApiField("item_id")
    private String itemId;

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}


