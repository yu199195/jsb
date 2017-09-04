package com.jsb.rest.request.item;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.ItemQuantityUpdateResponse;

import java.util.Map;

public class JSBItemQuantityUpdateRequest
        extends JSBRequest<ItemQuantityUpdateResponse> {
    public void setItemId(String num_iid) {
        this.queryMaps.put("num_iid", num_iid);
    }

    public void setSkuId(String sku_id) {
        this.queryMaps.put("sku_id", sku_id);
    }

    public void setOuterId(String outer_id) {
        this.queryMaps.put("outer_id", outer_id);
    }

    public void setQuantity(Long quantity) {
        this.queryMaps.put("quantity", String.valueOf(quantity));
    }

    public String getResourceUrl() {
        return "item/ItemQuantityUpdateRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }

    public Class<ItemQuantityUpdateResponse> getResponseClass() {
        return ItemQuantityUpdateResponse.class;
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


