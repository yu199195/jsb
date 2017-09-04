package com.jsb.rest.request.multimedia;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.PictureCategoryAddResponse;

import java.util.Map;

public class JSBPictureCategoryAddRequest
        extends JSBRequest<PictureCategoryAddResponse> {
    public void setPictureCategoryName(String picture_category_name) {
        this.queryMaps.put("picture_category_name", picture_category_name);
    }

    public String getResourceUrl() {
        return "multimedia/PictureCategoryAddRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }

    public Class<PictureCategoryAddResponse> getResponseClass() {
        return PictureCategoryAddResponse.class;
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


