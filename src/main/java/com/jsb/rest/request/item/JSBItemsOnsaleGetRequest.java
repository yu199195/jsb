package com.jsb.rest.request.item;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.ItemsOnsaleGetResponse;

import java.util.Map;

public class JSBItemsOnsaleGetRequest
        extends JSBRequest<ItemsOnsaleGetResponse> {
    public void setFields(String fields) {
        this.queryMaps.put("fields", fields);
    }

    public String getResourceUrl() {
        return "item/ItemsOnsaleGetRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_GET;
    }

    public Class<ItemsOnsaleGetResponse> getResponseClass() {
        return ItemsOnsaleGetResponse.class;
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


