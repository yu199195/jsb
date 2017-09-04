package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class WlbAuthorization
        extends TaobaoObject {
    private static final long serialVersionUID = 7197184287349854651L;
    @ApiField("authorize_end_time")
    private Date authorizeEndTime;
    @ApiField("authorize_id")
    private Long authorizeId;
    @ApiField("authorize_start_time")
    private Date authorizeStartTime;
    @ApiField("consign_user_id")
    private Long consignUserId;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("name")
    private String name;
    @ApiField("owner_user_id")
    private Long ownerUserId;
    @ApiField("quantity")
    private Long quantity;
    @ApiField("rule_code")
    private String ruleCode;
    @ApiField("status")
    private String status;

    public Date getAuthorizeEndTime() {
        return this.authorizeEndTime;
    }

    public void setAuthorizeEndTime(Date authorizeEndTime) {
        this.authorizeEndTime = authorizeEndTime;
    }

    public Long getAuthorizeId() {
        return this.authorizeId;
    }

    public void setAuthorizeId(Long authorizeId) {
        this.authorizeId = authorizeId;
    }

    public Date getAuthorizeStartTime() {
        return this.authorizeStartTime;
    }

    public void setAuthorizeStartTime(Date authorizeStartTime) {
        this.authorizeStartTime = authorizeStartTime;
    }

    public Long getConsignUserId() {
        return this.consignUserId;
    }

    public void setConsignUserId(Long consignUserId) {
        this.consignUserId = consignUserId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getRuleCode() {
        return this.ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


