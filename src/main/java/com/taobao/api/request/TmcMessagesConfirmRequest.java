package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcMessagesConfirmResponse;

import java.util.Map;

public class TmcMessagesConfirmRequest
        extends BaseTaobaoRequest<TmcMessagesConfirmResponse> {
    private String fMessageIds;
    private String groupName;
    private String sMessageIds;

    public void setfMessageIds(String fMessageIds) {
        this.fMessageIds = fMessageIds;
    }

    public String getfMessageIds() {
        return this.fMessageIds;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setsMessageIds(String sMessageIds) {
        this.sMessageIds = sMessageIds;
    }

    public String getsMessageIds() {
        return this.sMessageIds;
    }

    public String getApiMethodName() {
        return "taobao.tmc.messages.confirm";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("f_message_ids", this.fMessageIds);
        txtParams.put("group_name", this.groupName);
        txtParams.put("s_message_ids", this.sMessageIds);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmcMessagesConfirmResponse> getResponseClass() {
        return TmcMessagesConfirmResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(this.fMessageIds, 200, "fMessageIds");
        RequestCheckUtils.checkNotEmpty(this.sMessageIds, "sMessageIds");
        RequestCheckUtils.checkMaxListSize(this.sMessageIds, 200, "sMessageIds");
    }
}


