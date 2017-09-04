package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class OpenSmsBatchsendmsgResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3747555611875898656L;
    @ApiField("result")
    private Result result;

    public void setResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return this.result;
    }

    public static class SendMessageResult
            extends TaobaoObject {
        private static final long serialVersionUID = 5883727131815559392L;

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

    public static class Result
            extends TaobaoObject {
        private static final long serialVersionUID = 3424474276566519848L;

        @ApiField("code")
        private Long code;

        @ApiListField("datas")
        @ApiField("send_message_result")
        private List<SendMessageResult> datas;

        @ApiField("message")
        private String message;

        public Long getCode() {
            return this.code;
        }

        public void setCode(Long code) {
            this.code = code;
        }

        public List<SendMessageResult> getDatas() {
            return this.datas;
        }

        public void setDatas(List<SendMessageResult> datas) {
            this.datas = datas;
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}


