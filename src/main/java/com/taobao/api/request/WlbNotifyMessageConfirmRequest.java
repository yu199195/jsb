package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbNotifyMessageConfirmResponse;

import java.util.Map;

public class WlbNotifyMessageConfirmRequest
        extends BaseTaobaoRequest<WlbNotifyMessageConfirmResponse> {
    private String messageId;

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getApiMethodName() {
        return "taobao.wlb.notify.message.confirm";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("message_id", this.messageId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbNotifyMessageConfirmResponse> getResponseClass() {
        return WlbNotifyMessageConfirmResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.messageId, "messageId");
    }
}


