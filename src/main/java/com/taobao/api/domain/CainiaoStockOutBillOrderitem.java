package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class CainiaoStockOutBillOrderitem
        extends TaobaoObject {
    private static final long serialVersionUID = 8419338946611514279L;
    @ApiField("apply_qty")
    private Long applyQty;
    @ApiListField("inventory_item_list")
    @ApiField("cainiao_stock_out_bill_inventoryitemlist")
    private List<CainiaoStockOutBillInventoryitemlist> inventoryItemList;
    @ApiField("item_code")
    private String itemCode;
    @ApiField("item_id")
    private String itemId;
    @ApiField("order_item_id")
    private String orderItemId;

    public Long getApplyQty() {
        return this.applyQty;
    }

    public void setApplyQty(Long applyQty) {
        this.applyQty = applyQty;
    }

    public List<CainiaoStockOutBillInventoryitemlist> getInventoryItemList() {
        return this.inventoryItemList;
    }

    public void setInventoryItemList(List<CainiaoStockOutBillInventoryitemlist> inventoryItemList) {
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


