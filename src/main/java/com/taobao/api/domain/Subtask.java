package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Subtask
        extends TaobaoObject {
    private static final long serialVersionUID = 8435616785589333461L;
    @ApiField("is_success")
    private Boolean isSuccess;
    @ApiField("sub_task_request")
    private String subTaskRequest;
    @ApiField("sub_task_result")
    private String subTaskResult;

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getSubTaskRequest() {
        return this.subTaskRequest;
    }

    public void setSubTaskRequest(String subTaskRequest) {
        this.subTaskRequest = subTaskRequest;
    }

    public String getSubTaskResult() {
        return this.subTaskResult;
    }

    public void setSubTaskResult(String subTaskResult) {
        this.subTaskResult = subTaskResult;
    }
}


