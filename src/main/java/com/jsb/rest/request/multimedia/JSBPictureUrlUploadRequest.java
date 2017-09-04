package com.jsb.rest.request.multimedia;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.PictureUploadResponse;

import java.util.Map;

public class JSBPictureUrlUploadRequest
        extends JSBRequest<PictureUploadResponse> {
    public void setTitle(String title) {
        this.queryMaps.put("title", title);
    }

    public void setImageInputTitle(String image_input_title) {
        this.queryMaps.put("image_input_title", image_input_title);
    }

    public void setPictureCategoryId(Long picture_category_id) {
        this.queryMaps.put("picture_category_id", String.valueOf(picture_category_id));
    }

    public String getResourceUrl() {
        return "multimedia/PictureUrlUploadRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }

    public Class<PictureUploadResponse> getResponseClass() {
        return PictureUploadResponse.class;
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

    public void setUrl(String imageUrl) {
        this.queryMaps.put("url", imageUrl);
    }
}


