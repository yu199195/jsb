package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class WlbItemBatch
        extends TaobaoObject {
    private static final long serialVersionUID = 3739431623816861248L;
    @ApiField("batch_code")
    private String batchCode;
    @ApiField("creator")
    private String creator;
    @ApiField("defect_quantity")
    private Long defectQuantity;
    @ApiField("due_date")
    private Date dueDate;
    @ApiField("gmt_create")
    private Date gmtCreate;
    @ApiField("gmt_modified")
    private Date gmtModified;
    @ApiField("guarantee_period")
    private String guaranteePeriod;
    @ApiField("guarantee_unit")
    private Long guaranteeUnit;
    @ApiField("id")
    private Long id;
    @ApiField("is_deleted")
    private Boolean isDeleted;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("last_modifier")
    private String lastModifier;
    @ApiField("produce_area")
    private String produceArea;
    @ApiField("produce_code")
    private String produceCode;
    @ApiField("produce_date")
    private Date produceDate;
    @ApiField("quantity")
    private Long quantity;
    @ApiField("receive_date")
    private Date receiveDate;
    @ApiField("remarks")
    private String remarks;
    @ApiField("status")
    private String status;
    @ApiField("store_code")
    private String storeCode;
    @ApiField("user_id")
    private Long userId;
    @ApiField("version")
    private Long version;

    public String getBatchCode() {
        return this.batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Long getDefectQuantity() {
        return this.defectQuantity;
    }

    public void setDefectQuantity(Long defectQuantity) {
        this.defectQuantity = defectQuantity;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getGuaranteePeriod() {
        return this.guaranteePeriod;
    }

    public void setGuaranteePeriod(String guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    public Long getGuaranteeUnit() {
        return this.guaranteeUnit;
    }

    public void setGuaranteeUnit(Long guaranteeUnit) {
        this.guaranteeUnit = guaranteeUnit;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getLastModifier() {
        return this.lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
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

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Date getReceiveDate() {
        return this.receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}


