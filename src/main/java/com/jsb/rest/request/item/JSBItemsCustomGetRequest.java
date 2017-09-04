package com.jsb.rest.request.item;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.ItemsCustomGetResponse;

import java.util.Map;

public class JSBItemsCustomGetRequest
        extends JSBRequest<ItemsCustomGetResponse> {
    public void setOuterId(String outer_id) {
        this.queryMaps.put("outer_id", outer_id);
    }

    public void setFields(String fields) {
        this.queryMaps.put("fields", fields);
    }

    public String getResourceUrl() {
        return "item/ItemsCustomGetRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_GET;
    }

    public Class<ItemsCustomGetResponse> getResponseClass() {
        return ItemsCustomGetResponse.class;
    }

    public void checkParameter()
            throws ApiRuleException {
    }

    public Object getEntity() {
        return null;
    }

    public void postHandler() {
    }

    public String getType() {
        return null;
    }
}


