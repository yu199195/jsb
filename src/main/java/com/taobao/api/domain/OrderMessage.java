package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class OrderMessage
        extends TaobaoObject {
    private static final long serialVersionUID = 3663647797325824469L;
    @ApiField("message_content")
    private String messageContent;
    @ApiField("message_time")
    private Date messageTime;
    @ApiField("message_title")
    private String messageTitle;
    @ApiField("pic_url")
    private String picUrl;

    public String getMessageContent() {
        return this.messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Date getMessageTime() {
        return this.messageTime;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    public String getMessageTitle() {
        return this.messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}


