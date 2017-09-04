package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class WlbOrderDetail
        extends TaobaoObject {
    private static final long serialVersionUID = 5414313181239528282L;
    @ApiField("buyer_nick")
    private String buyerNick;
    @ApiField("create_time")
    private Date createTime;
    @ApiField("is_completed")
    private Boolean isCompleted;
    @ApiField("modify_time")
    private Date modifyTime;
    @ApiField("operate_type")
    private String operateType;
    @ApiField("order_code")
    private String orderCode;
    @ApiListField("order_item_list")
    @ApiField("wlb_order_item")
    private List<WlbOrderItem> orderItemList;
    @ApiField("order_source")
    private String orderSource;
    @ApiField("order_source_code")
    private String orderSourceCode;
    @ApiField("order_status")
    private String orderStatus;
    @ApiField("order_sub_type")
    private String orderSubType;
    @ApiField("order_type")
    private String orderType;
    @ApiField("remark")
    private String remark;
    @ApiField("store_code")
    private String storeCode;
    @ApiField("user_id")
    private Long userId;
    @ApiField("user_nick")
    private String userNick;

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsCompleted() {
        return this.isCompleted;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getOperateType() {
        return this.operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public List<WlbOrderItem> getOrderItemList() {
        return this.orderItemList;
    }

    public void setOrderItemList(List<WlbOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getOrderSource() {
        return this.orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getOrderSourceCode() {
        return this.orderSourceCode;
    }

    public void setOrderSourceCode(String orderSourceCode) {
        this.orderSourceCode = orderSourceCode;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderSubType() {
        return this.orderSubType;
    }

    public void setOrderSubType(String orderSubType) {
        this.orderSubType = orderSubType;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getUserNick() {
        return this.userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }
}


