package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TmcMessage;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TmcMessagesConsumeResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4375986457625959915L;
    @ApiListField("messages")
    @ApiField("tmc_message")
    private List<TmcMessage> messages;

    public void setMessages(List<TmcMessage> messages) {
        this.messages = messages;
    }

    public List<TmcMessage> getMessages() {
        return this.messages;
    }
}


