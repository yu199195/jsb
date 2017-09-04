package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TmcUserTopicsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4473669481791419694L;
    @ApiField("result_code")
    private String resultCode;
    @ApiField("result_message")
    private String resultMessage;
    @ApiListField("topics")
    @ApiField("string")
    private List<String> topics;

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public String getResultMessage() {
        return this.resultMessage;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public List<String> getTopics() {
        return this.topics;
    }
}


