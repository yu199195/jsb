package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.RemoveDelayMessageRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.OpenSmsRmdelaymsgResponse;

import java.util.Map;

public class OpenSmsRmdelaymsgRequest
        extends BaseTaobaoRequest<OpenSmsRmdelaymsgResponse> {
    private String paramRemoveDelayMessageRequest;

    public void setParamRemoveDelayMessageRequest(String paramRemoveDelayMessageRequest) {
        this.paramRemoveDelayMessageRequest = paramRemoveDelayMessageRequest;
    }

    public void setParamRemoveDelayMessageRequest(RemoveDelayMessageRequest paramRemoveDelayMessageRequest) {
        this.paramRemoveDelayMessageRequest = new JSONWriter(false, true).write(paramRemoveDelayMessageRequest);
    }

    public String getParamRemoveDelayMessageRequest() {
        return this.paramRemoveDelayMessageRequest;
    }

    public String getApiMethodName() {
        return "taobao.open.sms.rmdelaymsg";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("param_remove_delay_message_request", this.paramRemoveDelayMessageRequest);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OpenSmsRmdelaymsgResponse> getResponseClass() {
        return OpenSmsRmdelaymsgResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


