package com.jsb.rest.request.item;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.ItemUpdateListingResponse;

import java.util.Map;

public class JSBItemUpdateListingRequest
        extends JSBRequest<ItemUpdateListingResponse> {
    public void setNum(Long num) {
        this.queryMaps.put("num", String.valueOf(num));
    }

    public void setItemId(String num_iid) {
        this.queryMaps.put("num_iid", num_iid);
    }

    public String getResourceUrl() {
        return "item/ItemUpdateListingRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }

    public Class<ItemUpdateListingResponse> getResponseClass() {
        return ItemUpdateListingResponse.class;
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


