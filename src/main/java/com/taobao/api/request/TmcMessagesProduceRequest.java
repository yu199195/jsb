package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmcMessagesProduceResponse;

import java.util.List;
import java.util.Map;

public class TmcMessagesProduceRequest
        extends BaseTaobaoRequest<TmcMessagesProduceResponse> {
    private String messages;

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public void setMessages(List<TmcPublishMessage> messages) {
        this.messages = new JSONWriter(false, true).write(messages);
    }

    public String getMessages() {
        return this.messages;
    }

    public String getApiMethodName() {
        return "taobao.tmc.messages.produce";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("messages", this.messages);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmcMessagesProduceResponse> getResponseClass() {
        return TmcMessagesProduceResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkObjectMaxListSize(this.messages, 50, "messages");
    }

    public static class TmcPublishMessage
            extends TaobaoObject {
        private static final long serialVersionUID = 4347311711345463997L;

        @ApiField("content")
        private String content;

        @ApiField("json_ex_content")
        private String jsonExContent;

        @ApiField("target_app_key")
        private String targetAppKey;

        @ApiField("topic")
        private String topic;

        public String getContent() {
            return this.content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getJsonExContent() {
            return this.jsonExContent;
        }

        public void setJsonExContent(String jsonExContent) {
            this.jsonExContent = jsonExContent;
        }

        public String getTargetAppKey() {
            return this.targetAppKey;
        }

        public void setTargetAppKey(String targetAppKey) {
            this.targetAppKey = targetAppKey;
        }

        public String getTopic() {
            return this.topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }
    }
}


