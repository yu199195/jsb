package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class SendMessageResult
        extends TaobaoObject {
    private static final long serialVersionUID = 4372376962683192735L;
    @ApiField("delay_task_id")
    private String delayTaskId;
    @ApiField("sms_size")
    private Long smsSize;
    @ApiField("task_id")
    private Long taskId;

    public String getDelayTaskId() {
        return this.delayTaskId;
    }

    public void setDelayTaskId(String delayTaskId) {
        this.delayTaskId = delayTaskId;
    }

    public Long getSmsSize() {
        return this.smsSize;
    }

    public void setSmsSize(Long smsSize) {
        this.smsSize = smsSize;
    }

    public Long getTaskId() {
        return this.taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
}


