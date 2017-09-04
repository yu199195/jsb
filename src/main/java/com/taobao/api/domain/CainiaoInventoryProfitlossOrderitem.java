package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class CainiaoInventoryProfitlossOrderitem
        extends TaobaoObject {
    private static final long serialVersionUID = 6772762328254279589L;
    @ApiField("batch_code")
    private String batchCode;
    @ApiField("due_date")
    private Date dueDate;
    @ApiField("inventory_type")
    private String inventoryType;
    @ApiField("item_code")
    private String itemCode;
    @ApiField("item_id")
    private String itemId;
    @ApiField("item_qty")
    private String itemQty;
    @ApiField("produce_area")
    private String produceArea;
    @ApiField("produce_code")
    private String produceCode;
    @ApiField("produce_date")
    private Date produceDate;

    public String getBatchCode() {
        return this.batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getInventoryType() {
        return this.inventoryType;
    }

    public void setInventoryType(String inventoryType) {
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

    public String getItemQty() {
        return this.itemQty;
    }

    public void setItemQty(String itemQty) {
        this.itemQty = itemQty;
    }

    public String getProduceArea() {
        return this.produceArea;
    }

    public void setProduceArea(String produceArea) {
        this.produceArea = produceArea;
    }

    public String getProduceCode() {
        return this.produceCode;
    }

    public void setProduceCode(String produceCode) {
        this.produceCode = produceCode;
    }

    public Date getProduceDate() {
        return this.produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }
}


