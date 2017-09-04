package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WlbOrderItem
        extends TaobaoObject {
    private static final long serialVersionUID = 7737127199349719219L;
    @ApiField("batch_remark")
    private String batchRemark;
    @ApiField("confirm_status")
    private String confirmStatus;
    @ApiField("ext_entity_id")
    private String extEntityId;
    @ApiField("ext_entity_type")
    private String extEntityType;
    @ApiField("flag")
    private Long flag;
    @ApiField("id")
    private Long id;
    @ApiField("inventory_type")
    private String inventoryType;
    @ApiField("item_code")
    private String itemCode;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("item_name")
    private String itemName;
    @ApiField("item_price")
    private Long itemPrice;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("order_id")
    private Long orderId;
    @ApiField("order_status")
    private String orderStatus;
    @ApiField("order_sub_2code")
    private String orderSub2code;
    @ApiField("order_sub_code")
    private String orderSubCode;
    @ApiField("order_sub_type")
    private String orderSubType;
    @ApiField("picture_url")
    private String pictureUrl;
    @ApiField("plan_quantity")
    private Long planQuantity;
    @ApiField("provider_tp_id")
    private Long providerTpId;
    @ApiField("provider_tp_nick")
    private String providerTpNick;
    @ApiField("publish_version")
    private Long publishVersion;
    @ApiField("real_quantity")
    private Long realQuantity;
    @ApiField("remark")
    private String remark;
    @ApiField("user_id")
    private Long userId;
    @ApiField("user_nick")
    private String userNick;

    public String getBatchRemark() {
        return this.batchRemark;
    }

    public void setBatchRemark(String batchRemark) {
        this.batchRemark = batchRemark;
    }

    public String getConfirmStatus() {
        return this.confirmStatus;
    }

    public void setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public String getExtEntityId() {
        return this.extEntityId;
    }

    public void setExtEntityId(String extEntityId) {
        this.extEntityId = extEntityId;
    }

    public String getExtEntityType() {
        return this.extEntityType;
    }

    public void setExtEntityType(String extEntityType) {
        this.extEntityType = extEntityType;
    }

    public Long getFlag() {
        return this.flag;
    }

    public void setFlag(Long flag) {
        this.flag = flag;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getItemPrice() {
        return this.itemPrice;
    }

    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderSub2code() {
        return this.orderSub2code;
    }

    public void setOrderSub2code(String orderSub2code) {
        this.orderSub2code = orderSub2code;
    }

    public String getOrderSubCode() {
        return this.orderSubCode;
    }

    public void setOrderSubCode(String orderSubCode) {
        this.orderSubCode = orderSubCode;
    }

    public String getOrderSubType() {
        return this.orderSubType;
    }

    public void setOrderSubType(String orderSubType) {
        this.orderSubType = orderSubType;
    }

    public String getPictureUrl() {
        return this.pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Long getPlanQuantity() {
        return this.planQuantity;
    }

    public void setPlanQuantity(Long planQuantity) {
        this.planQuantity = planQuantity;
    }

    public Long getProviderTpId() {
        return this.providerTpId;
    }

    public void setProviderTpId(Long providerTpId) {
        this.providerTpId = providerTpId;
    }

    public String getProviderTpNick() {
        return this.providerTpNick;
    }

    public void setProviderTpNick(String providerTpNick) {
        this.providerTpNick = providerTpNick;
    }

    public Long getPublishVersion() {
        return this.publishVersion;
    }

    public void setPublishVersion(Long publishVersion) {
        this.publishVersion = publishVersion;
    }

    public Long getRealQuantity() {
        return this.realQuantity;
    }

    public void setRealQuantity(Long realQuantity) {
        this.realQuantity = realQuantity;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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


