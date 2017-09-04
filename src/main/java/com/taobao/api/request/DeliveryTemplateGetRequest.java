package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DeliveryTemplateGetResponse;

import java.util.Map;

public class DeliveryTemplateGetRequest
        extends BaseTaobaoRequest<DeliveryTemplateGetResponse> {
    private String fields;
    private String templateIds;
    private String userNick;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setTemplateIds(String templateIds) {
        this.templateIds = templateIds;
    }

    public String getTemplateIds() {
        return this.templateIds;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public String getApiMethodName() {
        return "taobao.delivery.template.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("template_ids", this.templateIds);
        txtParams.put("user_nick", this.userNick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<DeliveryTemplateGetResponse> getResponseClass() {
        return DeliveryTemplateGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkMaxListSize(this.fields, 20, "fields");
        RequestCheckUtils.checkNotEmpty(this.templateIds, "templateIds");
        RequestCheckUtils.checkMaxListSize(this.templateIds, 20, "templateIds");
    }
}


