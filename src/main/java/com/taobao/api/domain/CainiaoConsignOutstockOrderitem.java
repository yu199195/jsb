package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoConsignOutstockOrderitem
        extends TaobaoObject {
    private static final long serialVersionUID = 2766279272489181295L;
    @ApiField("item_code")
    private String itemCode;
    @ApiField("item_id")
    private String itemId;
    @ApiField("item_qty")
    private Long itemQty;
    @ApiField("lack_qty")
    private Long lackQty;
    @ApiField("reason")
    private String reason;

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


