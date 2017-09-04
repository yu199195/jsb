package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class WmsInventoryQueryItem
        extends TaobaoObject {
    private static final long serialVersionUID = 7259953375485687947L;
    @ApiField("batch_code")
    private String batchCode;
    @ApiField("channel_code")
    private String channelCode;
    @ApiField("due_date")
    private Date dueDate;
    @ApiField("inventory_type")
    private Long inventoryType;
    @ApiField("item_id")
    private String itemId;
    @ApiField("lock_quantity")
    private Long lockQuantity;
    @ApiField("produce_date")
    private Date produceDate;
    @ApiField("quantity")
    private Long quantity;
    @ApiField("store_code")
    private String storeCode;

    public String getBatchCode() {
        return this.batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String getChannelCode() {
        return this.channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
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

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Long getLockQuantity() {
        return this.lockQuantity;
    }

    public void setLockQuantity(Long lockQuantity) {
        this.lockQuantity = lockQuantity;
    }

    public Date getProduceDate() {
        return this.produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }
}


