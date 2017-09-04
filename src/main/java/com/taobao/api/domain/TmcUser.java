package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class TmcUser
        extends TaobaoObject {
    private static final long serialVersionUID = 4783118122379758761L;
    @ApiField("created")
    private Date created;
    @ApiField("group_name")
    private String groupName;
    @ApiField("is_valid")
    private Boolean isValid;
    @ApiField("modified")
    private Date modified;
    @ApiListField("topics")
    @ApiField("string")
    private List<String> topics;
    @ApiField("user_id")
    private Long userId;
    @ApiField("user_nick")
    private String userNick;
    @ApiField("user_platform")
    private String userPlatform;

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Boolean getIsValid() {
        return this.isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public List<String> getTopics() {
        return this.topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
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

    public String getUserPlatform() {
        return this.userPlatform;
    }

    public void setUserPlatform(String userPlatform) {
        this.userPlatform = userPlatform;
    }
}


