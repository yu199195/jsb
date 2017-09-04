package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class CainiaoReturnBillOrderitem
        extends TaobaoObject {
    private static final long serialVersionUID = 1682352378816341834L;
    @ApiListField("inventory_item_list")
    @ApiField("cainiao_return_bill_inventoryitemlist")
    private List<CainiaoReturnBillInventoryitemlist> inventoryItemList;
    @ApiField("item_code")
    private String itemCode;
    @ApiField("item_id")
    private String itemId;
    @ApiField("order_item_id")
    private String orderItemId;

    public List<CainiaoReturnBillInventoryitemlist> getInventoryItemList() {
        return this.inventoryItemList;
    }

    public void setInventoryItemList(List<CainiaoReturnBillInventoryitemlist> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }

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

    public String getOrderItemId() {
        return this.orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }
}


