package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcMessagesConsumeResponse;

import java.util.Map;

public class TmcMessagesConsumeRequest
        extends BaseTaobaoRequest<TmcMessagesConsumeResponse> {
    private String groupName;
    private Long quantity;

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public String getApiMethodName() {
        return "taobao.tmc.messages.consume";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("group_name", this.groupName);
        txtParams.put("quantity", this.quantity);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmcMessagesConsumeResponse> getResponseClass() {
        return TmcMessagesConsumeResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(this.quantity, 200L, "quantity");
        RequestCheckUtils.checkMinValue(this.quantity, 10L, "quantity");
    }
}


