package com.jsb.rest.request.item;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.ItemUpdateDelistingResponse;

import java.util.Map;

public class JSBItemUpdateDelistingRequest
        extends JSBRequest<ItemUpdateDelistingResponse> {
    public void setItemId(String num_iid) {
        this.queryMaps.put("num_iid", num_iid);
    }

    public String getResourceUrl() {
        return "item/ItemUpdateDelistingRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }

    public Class<ItemUpdateDelistingResponse> getResponseClass() {
        return ItemUpdateDelistingResponse.class;
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


