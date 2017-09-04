package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class LoginUser
        extends TaobaoObject {
    private static final long serialVersionUID = 7127164875893373919L;
    @ApiField("create_time")
    private Date createTime;
    @ApiField("nick")
    private String nick;
    @ApiField("user_id")
    private Long userId;
    @ApiField("user_type")
    private String userType;

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}


