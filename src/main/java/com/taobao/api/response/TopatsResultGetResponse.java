package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Task;
import com.taobao.api.internal.mapping.ApiField;

public class TopatsResultGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4662754619791698266L;
    @ApiField("task")
    private Task task;

    public void setTask(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return this.task;
    }
}


