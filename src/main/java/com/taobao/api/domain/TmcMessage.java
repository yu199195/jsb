package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class TmcMessage
        extends TaobaoObject {
    private static final long serialVersionUID = 1523668749959597245L;
    @ApiField("content")
    private String content;
    @ApiField("id")
    private Long id;
    @ApiField("pub_app_key")
    private String pubAppKey;
    @ApiField("pub_time")
    private Date pubTime;
    @ApiField("topic")
    private String topic;
    @ApiField("user_id")
    private Long userId;
    @ApiField("user_nick")
    private String userNick;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPubAppKey() {
        return this.pubAppKey;
    }

    public void setPubAppKey(String pubAppKey) {
        this.pubAppKey = pubAppKey;
    }

    public Date getPubTime() {
        return this.pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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


