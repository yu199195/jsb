package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ItemListWlbWmsInventoryStatusUpload
        extends TaobaoObject {
    private static final long serialVersionUID = 8584247669647638183L;
    @ApiField("batch_code")
    private String batchCode;
    @ApiField("due_date")
    private String dueDate;
    @ApiField("int_out_flag")
    private Long intOutFlag;
    @ApiField("inventory_type")
    private Long inventoryType;
    @ApiField("item_id")
    private String itemId;
    @ApiField("produce_code")
    private String produceCode;
    @ApiField("produce_date")
    private String produceDate;
    @ApiField("product_date")
    private String productDate;
    @ApiField("quantity")
    private Long quantity;
    @ApiField("sn_code")
    private String snCode;

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

    public Long getIntOutFlag() {
        return this.intOutFlag;
    }

    public void setIntOutFlag(Long intOutFlag) {
        this.intOutFlag = intOutFlag;
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

    public String getProductDate() {
        return this.productDate;
    }

    public void setProductDate(String productDate) {
        this.productDate = productDate;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getSnCode() {
        return this.snCode;
    }

    public void setSnCode(String snCode) {
        this.snCode = snCode;
    }
}


