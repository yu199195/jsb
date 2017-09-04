package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ItemListWlbWmsInventoryLackUpload
        extends TaobaoObject {
    private static final long serialVersionUID = 7131153212172464337L;
    @ApiField("item_id")
    private String itemId;
    @ApiField("item_qty")
    private Long itemQty;
    @ApiField("lack_qty")
    private Long lackQty;
    @ApiField("reason")
    private String reason;

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Long getItemQty() {
        return this.itemQty;
    }

    public void setItemQty(Long itemQty) {
        this.itemQty = itemQty;
    }

    public Long getLackQty() {
        return this.lackQty;
    }

    public void setLackQty(Long lackQty) {
        this.lackQty = lackQty;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}


