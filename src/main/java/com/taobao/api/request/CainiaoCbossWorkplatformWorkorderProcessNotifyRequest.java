package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.CainiaoCbossWorkplatformWorkorderProcessNotifyResponse;

import java.util.Map;

public class CainiaoCbossWorkplatformWorkorderProcessNotifyRequest
        extends BaseTaobaoRequest<CainiaoCbossWorkplatformWorkorderProcessNotifyResponse> {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void setContent(Struct content) {
        this.content = new JSONWriter(false, true).write(content);
    }

    public String getContent() {
        return this.content;
    }

    public String getApiMethodName() {
        return "cainiao.cboss.workplatform.workorder.process.notify";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("content", this.content);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<CainiaoCbossWorkplatformWorkorderProcessNotifyResponse> getResponseClass() {
        return CainiaoCbossWorkplatformWorkorderProcessNotifyResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }

    public static class Struct
            extends TaobaoObject {
        private static final long serialVersionUID = 2842646173453596231L;

        @ApiField("action_time")
        private String actionTime;

        @ApiField("attach_path")
        private String attachPath;

        @ApiField("biz_status")
        private Long bizStatus;

        @ApiField("dealer_name")
        private String dealerName;

        @ApiField("dealer_role")
        private Long dealerRole;

        @ApiField("features")
        private String features;

        @ApiField("memo")
        private String memo;

        @ApiField("op_type")
        private Long opType;

        @ApiField("task_id")
        private String taskId;

        @ApiField("task_name")
        private String taskName;

        @ApiField("work_order_id")
        private String workOrderId;

        public String getActionTime() {
            return this.actionTime;
        }

        public void setActionTime(String actionTime) {
            this.actionTime = actionTime;
        }

        public String getAttachPath() {
            return this.attachPath;
        }

        public void setAttachPath(String attachPath) {
            this.attachPath = attachPath;
        }

        public Long getBizStatus() {
            return this.bizStatus;
        }

        public void setBizStatus(Long bizStatus) {
            this.bizStatus = bizStatus;
        }

        public String getDealerName() {
            return this.dealerName;
        }

        public void setDealerName(String dealerName) {
            this.dealerName = dealerName;
        }

        public Long getDealerRole() {
            return this.dealerRole;
        }

        public void setDealerRole(Long dealerRole) {
            this.dealerRole = dealerRole;
        }

        public String getFeatures() {
            return this.features;
        }

        public void setFeatures(String features) {
            this.features = features;
        }

        public String getMemo() {
            return this.memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public Long getOpType() {
            return this.opType;
        }

        public void setOpType(Long opType) {
            this.opType = opType;
        }

        public String getTaskId() {
            return this.taskId;
        }

        public void setTaskId(String taskId) {
            this.taskId = taskId;
        }

        public String getTaskName() {
            return this.taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        public String getWorkOrderId() {
            return this.workOrderId;
        }

        public void setWorkOrderId(String workOrderId) {
            this.workOrderId = workOrderId;
        }
    }
}


