package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TicketItemsGetResponse;

import java.util.Map;

public class TicketItemsGetRequest
        extends BaseTaobaoRequest<TicketItemsGetResponse> {
    private String fields;
    private String itemIds;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    public String getItemIds() {
        return this.itemIds;
    }

    public String getApiMethodName() {
        return "taobao.ticket.items.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("item_ids", this.itemIds);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TicketItemsGetResponse> getResponseClass() {
        return TicketItemsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkNotEmpty(this.itemIds, "itemIds");
    }
}


