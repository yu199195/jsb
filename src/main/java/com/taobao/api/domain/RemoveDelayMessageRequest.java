package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class RemoveDelayMessageRequest
        extends TaobaoObject {
    private static final long serialVersionUID = 6594359359177912196L;
    @ApiField("app_key")
    private String appKey;
    @ApiField("biz_type")
    private Long bizType;
    @ApiField("delay_task_id")
    private String delayTaskId;
    @ApiField("domain")
    private String domain;
    @ApiField("external_id")
    private String externalId;
    @ApiField("user_id")
    private Long userId;

    public String getAppKey() {
        return this.appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public Long getBizType() {
        return this.bizType;
    }

    public void setBizType(Long bizType) {
        this.bizType = bizType;
    }

    public String getDelayTaskId() {
        return this.delayTaskId;
    }

    public void setDelayTaskId(String delayTaskId) {
        this.delayTaskId = delayTaskId;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}


