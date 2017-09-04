package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class Orderitemwlbwmsstockinordernotifywl
        extends TaobaoObject {
    private static final long serialVersionUID = 7656616368398734233L;
    @ApiField("batch_code")
    private String batchCode;
    @ApiField("due_date")
    private Date dueDate;
    @ApiField("extend_fields")
    private String extendFields;
    @ApiField("inventory_type")
    private Long inventoryType;
    @ApiField("item_id")
    private String itemId;
    @ApiField("item_quantity")
    private Long itemQuantity;
    @ApiField("order_item_id")
    private String orderItemId;
    @ApiField("produce_code")
    private String produceCode;
    @ApiField("produce_date")
    private Date produceDate;
    @ApiField("purchase_price")
    private Long purchasePrice;

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

    public String getExtendFields() {
        return this.extendFields;
    }

    public void setExtendFields(String extendFields) {
        this.extendFields = extendFields;
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

    public Long getPurchasePrice() {
        return this.purchasePrice;
    }

    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}


