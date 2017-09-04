package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsAddressRemoveResponse;

import java.util.Map;

public class LogisticsAddressRemoveRequest
        extends BaseTaobaoRequest<LogisticsAddressRemoveResponse> {
    private Long contactId;

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getContactId() {
        return this.contactId;
    }

    public String getApiMethodName() {
        return "taobao.logistics.address.remove";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("contact_id", this.contactId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsAddressRemoveResponse> getResponseClass() {
        return LogisticsAddressRemoveResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.contactId, "contactId");
    }
}


