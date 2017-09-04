package com.jsb.rest.request.item;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.ItemJointPropimgResponse;

import java.util.Map;

public class JSBItemJointPropimgRequest
        extends JSBRequest<ItemJointPropimgResponse> {
    public void setItemId(String num_iid) {
        this.queryMaps.put("num_iid", num_iid);
    }

    public void setProperties(String properties) {
        this.queryMaps.put("properties", properties);
    }

    public void setId(String id) {
        this.queryMaps.put("id", id);
    }

    public void setPosition(String position) {
        this.queryMaps.put("position", position);
    }

    public void setPicPath(String picPath) {
        this.queryMaps.put("pic_path", picPath);
    }

    public String getResourceUrl() {
        return "item/ItemJointPropimgRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }

    public Class<ItemJointPropimgResponse> getResponseClass() {
        return ItemJointPropimgResponse.class;
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


