package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopatsTaskDeleteResponse;

import java.util.Map;

public class TopatsTaskDeleteRequest
        extends BaseTaobaoRequest<TopatsTaskDeleteResponse> {
    private Long taskId;

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getTaskId() {
        return this.taskId;
    }

    public String getApiMethodName() {
        return "taobao.topats.task.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("task_id", this.taskId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TopatsTaskDeleteResponse> getResponseClass() {
        return TopatsTaskDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.taskId, "taskId");
    }
}


