package com.jsb.rest.request.item;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.ItemImgUploadResponse;

import java.util.Map;

public class JSBItemImgUrlUploadRequest
        extends JSBRequest<ItemImgUploadResponse> {
    public void setMajor(boolean is_major) {
        this.queryMaps.put("is_major", String.valueOf(is_major));
    }

    public void setItemId(String num_iid) {
        this.queryMaps.put("num_iid", num_iid);
    }

    public String getResourceUrl() {
        return "item/ItemImgUrlUploadRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }

    public Class<ItemImgUploadResponse> getResponseClass() {
        return ItemImgUploadResponse.class;
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

    public void setUrl(String url) {
        this.queryMaps.put("url", url);
    }
}


