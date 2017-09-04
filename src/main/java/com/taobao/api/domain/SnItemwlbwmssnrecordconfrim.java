package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class SnItemwlbwmssnrecordconfrim
        extends TaobaoObject {
    private static final long serialVersionUID = 7298357188572927867L;
    @ApiField("item_code")
    private String itemCode;
    @ApiField("item_id")
    private String itemId;
    @ApiField("sn_code")
    private String snCode;

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getSnCode() {
        return this.snCode;
    }

    public void setSnCode(String snCode) {
        this.snCode = snCode;
    }
}


