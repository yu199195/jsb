package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Orderitemwlbwmsreturnordernotify
        extends TaobaoObject {
    private static final long serialVersionUID = 4714283327446819696L;
    @ApiField("extend_fields")
    private String extendFields;
    @ApiField("item_id")
    private String itemId;
    @ApiField("item_name")
    private String itemName;
    @ApiField("item_quantity")
    private Long itemQuantity;
    @ApiField("order_item_id")
    private String orderItemId;
    @ApiField("order_source_code")
    private String orderSourceCode;
    @ApiField("sub_source_code")
    private String subSourceCode;

    public String getExtendFields() {
        return this.extendFields;
    }

    public void setExtendFields(String extendFields) {
        this.extendFields = extendFields;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getItemQuantity() {
        return this.itemQuantity;
    }

    public void setItemQuantity(Long itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getOrderItemId() {
        return this.orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getOrderSourceCode() {
        return this.orderSourceCode;
    }

    public void setOrderSourceCode(String orderSourceCode) {
        this.orderSourceCode = orderSourceCode;
    }

    public String getSubSourceCode() {
        return this.subSourceCode;
    }

    public void setSubSourceCode(String subSourceCode) {
        this.subSourceCode = subSourceCode;
    }
}


