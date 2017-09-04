package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class CainiaoStockOutBillInventoryitem
        extends TaobaoObject {
    private static final long serialVersionUID = 7336239885536825916L;
    @ApiField("batch_code")
    private String batchCode;
    @ApiField("due_date")
    private Date dueDate;
    @ApiField("inventory_type")
    private Long inventoryType;
    @ApiField("item_qty")
    private Long itemQty;
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

    public Long getInventoryType() {
        return this.inventoryType;
    }

    public void setInventoryType(Long inventoryType) {
        this.inventoryType = inventoryType;
    }

    public Long getItemQty() {
        return this.itemQty;
    }

    public void setItemQty(Long itemQty) {
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


