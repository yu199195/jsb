package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ItemsWlbWmsStockOutOrderConfirm
        extends TaobaoObject {
    private static final long serialVersionUID = 6481387595825211512L;
    @ApiField("batch_code")
    private String batchCode;
    @ApiField("due_date")
    private String dueDate;
    @ApiField("inventory_type")
    private Long inventoryType;
    @ApiField("item_code")
    private String itemCode;
    @ApiField("item_id")
    private String itemId;
    @ApiField("produce_code")
    private String produceCode;
    @ApiField("produce_date")
    private String produceDate;
    @ApiField("quantity")
    private Long quantity;

    public String getBatchCode() {
        return this.batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Long getInventoryType() {
        return this.inventoryType;
    }

    public void setInventoryType(Long inventoryType) {
        this.inventoryType = inventoryType;
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

    public String getProduceCode() {
        return this.produceCode;
    }

    public void setProduceCode(String produceCode) {
        this.produceCode = produceCode;
    }

    public String getProduceDate() {
        return this.produceDate;
    }

    public void setProduceDate(String produceDate) {
        this.produceDate = produceDate;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}


