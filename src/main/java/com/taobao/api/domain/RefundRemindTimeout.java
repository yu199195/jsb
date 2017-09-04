package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class RefundRemindTimeout
        extends TaobaoObject {
    private static final long serialVersionUID = 5211883115375246185L;
    @ApiField("exist_timeout")
    private Boolean existTimeout;
    @ApiField("remind_type")
    private Long remindType;
    @ApiField("timeout")
    private Date timeout;

    public Boolean getExistTimeout() {
        return this.existTimeout;
    }

    public void setExistTimeout(Boolean existTimeout) {
        this.existTimeout = existTimeout;
    }

    public Long getRemindType() {
        return this.remindType;
    }

    public void setRemindType(Long remindType) {
        this.remindType = remindType;
    }

    public Date getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }
}


