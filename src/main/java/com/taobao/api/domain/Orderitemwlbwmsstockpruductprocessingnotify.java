package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class Orderitemwlbwmsstockpruductprocessingnotify
        extends TaobaoObject {
    private static final long serialVersionUID = 5875675522691353465L;
    @ApiField("due_date")
    private Date dueDate;
    @ApiField("extend_fields")
    private String extendFields;
    @ApiField("inventory_type")
    private Long inventoryType;
    @ApiField("item_id")
    private String itemId;
    @ApiField("order_item_id")
    private String orderItemId;
    @ApiField("plan_qty")
    private Long planQty;
    @ApiField("produce_code")
    private String produceCode;
    @ApiField("produce_date")
    private Date produceDate;
    @ApiField("ratio_qty")
    private Long ratioQty;
    @ApiField("remark")
    private String remark;

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

    public String getOrderItemId() {
        return this.orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Long getPlanQty() {
        return this.planQty;
    }

    public void setPlanQty(Long planQty) {
        this.planQty = planQty;
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

    public Long getRatioQty() {
        return this.ratioQty;
    }

    public void setRatioQty(Long ratioQty) {
        this.ratioQty = ratioQty;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}


