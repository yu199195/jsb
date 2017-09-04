package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class Ticket
        extends TaobaoObject {
    private static final long serialVersionUID = 5149521483827231269L;
    @ApiField("audit_seller_id")
    private Long auditSellerId;
    @ApiField("create_user_id")
    private Long createUserId;
    @ApiField("gmt_create")
    private Date gmtCreate;
    @ApiField("gmt_modified")
    private Date gmtModified;
    @ApiField("memo")
    private String memo;
    @ApiField("reason")
    private String reason;
    @ApiField("spec_id")
    private Long specId;
    @ApiField("status")
    private Long status;

    public Long getAuditSellerId() {
        return this.auditSellerId;
    }

    public void setAuditSellerId(Long auditSellerId) {
        this.auditSellerId = auditSellerId;
    }

    public Long getCreateUserId() {
        return this.createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
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

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Long getSpecId() {
        return this.specId;
    }

    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}


