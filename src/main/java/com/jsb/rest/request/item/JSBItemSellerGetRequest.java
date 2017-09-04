package com.jsb.rest.request.item;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.ItemSellerGetResponse;

import java.util.Map;

public class JSBItemSellerGetRequest
        extends JSBRequest<ItemSellerGetResponse> {
    public void setItemId(String num_iid) {
        this.queryMaps.put("num_iid", num_iid);
    }

    public void setFields(String fields) {
        this.queryMaps.put("fields", fields);
    }

    public String getResourceUrl() {
        return "item/ItemSellerGetRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_GET;
    }

    public Class<ItemSellerGetResponse> getResponseClass() {
        return ItemSellerGetResponse.class;
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


