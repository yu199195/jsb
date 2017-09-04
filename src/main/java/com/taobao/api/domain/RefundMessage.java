package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class RefundMessage
        extends TaobaoObject {
    private static final long serialVersionUID = 5855455435693216367L;
    @ApiField("content")
    private String content;
    @ApiField("created")
    private Date created;
    @ApiField("id")
    private Long id;
    @ApiField("message_type")
    private String messageType;
    @ApiField("owner_id")
    private Long ownerId;
    @ApiField("owner_nick")
    private String ownerNick;
    @ApiField("owner_role")
    private String ownerRole;
    @ApiListField("pic_urls")
    @ApiField("pic_url")
    private List<PicUrl> picUrls;
    @ApiField("refund_id")
    private Long refundId;
    @ApiField("refund_phase")
    private String refundPhase;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public Long getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerNick() {
        return this.ownerNick;
    }

    public void setOwnerNick(String ownerNick) {
        this.ownerNick = ownerNick;
    }

    public String getOwnerRole() {
        return this.ownerRole;
    }

    public void setOwnerRole(String ownerRole) {
        this.ownerRole = ownerRole;
    }

    public List<PicUrl> getPicUrls() {
        return this.picUrls;
    }

    public void setPicUrls(List<PicUrl> picUrls) {
        this.picUrls = picUrls;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public String getRefundPhase() {
        return this.refundPhase;
    }

    public void setRefundPhase(String refundPhase) {
        this.refundPhase = refundPhase;
    }
}


