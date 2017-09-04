package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class WlbMessage
        extends TaobaoObject {
    private static final long serialVersionUID = 3763933827916499494L;
    @ApiField("gmt_create")
    private Date gmtCreate;
    @ApiField("id")
    private Long id;
    @ApiField("msg_code")
    private String msgCode;
    @ApiField("msg_content")
    private String msgContent;
    @ApiField("msg_description")
    private String msgDescription;
    @ApiField("status")
    private String status;
    @ApiField("user_id")
    private Long userId;

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgCode() {
        return this.msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public String getMsgContent() {
        return this.msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getMsgDescription() {
        return this.msgDescription;
    }

    public void setMsgDescription(String msgDescription) {
        this.msgDescription = msgDescription;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}


