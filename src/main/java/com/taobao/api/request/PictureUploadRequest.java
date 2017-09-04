package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureUploadResponse;

import java.util.HashMap;
import java.util.Map;

public class PictureUploadRequest
        extends BaseTaobaoRequest<PictureUploadResponse>
        implements TaobaoUploadRequest<PictureUploadResponse> {
    private String clientType;
    private String imageInputTitle;
    private FileItem img;
    private Boolean isHttps;
    private Long pictureCategoryId;
    private Long pictureId;
    private String title;

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientType() {
        return this.clientType;
    }

    public void setImageInputTitle(String imageInputTitle) {
        this.imageInputTitle = imageInputTitle;
    }

    public String getImageInputTitle() {
        return this.imageInputTitle;
    }

    public void setImg(FileItem img) {
        this.img = img;
    }

    public FileItem getImg() {
        return this.img;
    }

    public void setIsHttps(Boolean isHttps) {
        this.isHttps = isHttps;
    }

    public Boolean getIsHttps() {
        return this.isHttps;
    }

    public void setPictureCategoryId(Long pictureCategoryId) {
        this.pictureCategoryId = pictureCategoryId;
    }

    public Long getPictureCategoryId() {
        return this.pictureCategoryId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getApiMethodName() {
        return "taobao.picture.upload";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("client_type", this.clientType);
        txtParams.put("image_input_title", this.imageInputTitle);
        txtParams.put("is_https", this.isHttps);
        txtParams.put("picture_category_id", this.pictureCategoryId);
        txtParams.put("picture_id", this.pictureId);
        txtParams.put("title", this.title);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PictureUploadResponse> getResponseClass() {
        return PictureUploadResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.imageInputTitle, "imageInputTitle");
        RequestCheckUtils.checkNotEmpty(this.img, "img");
        RequestCheckUtils.checkNotEmpty(this.pictureCategoryId, "pictureCategoryId");
        RequestCheckUtils.checkMaxValue(this.pictureCategoryId, 9223372036854775807L, "pictureCategoryId");
        RequestCheckUtils.checkMinValue(this.pictureCategoryId, 0L, "pictureCategoryId");
        RequestCheckUtils.checkMaxValue(this.pictureId, 9223372036854775807L, "pictureId");
        RequestCheckUtils.checkMinValue(this.pictureId, 0L, "pictureId");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("img", this.img);
        return params;
    }
}


