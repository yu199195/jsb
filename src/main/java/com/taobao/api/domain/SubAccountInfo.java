package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class SubAccountInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 3648651694982349628L;
    @ApiField("sub_dispatch_status")
    private Boolean subDispatchStatus;
    @ApiField("sub_id")
    private Long subId;
    @ApiField("sub_nick")
    private String subNick;
    @ApiField("sub_owed_status")
    private Boolean subOwedStatus;
    @ApiField("sub_status")
    private Long subStatus;
    @ApiField("user_id")
    private Long userId;
    @ApiField("user_nick")
    private String userNick;

    public Boolean getSubDispatchStatus() {
        return this.subDispatchStatus;
    }

    public void setSubDispatchStatus(Boolean subDispatchStatus) {
        this.subDispatchStatus = subDispatchStatus;
    }

    public Long getSubId() {
        return this.subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public String getSubNick() {
        return this.subNick;
    }

    public void setSubNick(String subNick) {
        this.subNick = subNick;
    }

    public Boolean getSubOwedStatus() {
        return this.subOwedStatus;
    }

    public void setSubOwedStatus(Boolean subOwedStatus) {
        this.subOwedStatus = subOwedStatus;
    }

    public Long getSubStatus() {
        return this.subStatus;
    }

    public void setSubStatus(Long subStatus) {
        this.subStatus = subStatus;
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


