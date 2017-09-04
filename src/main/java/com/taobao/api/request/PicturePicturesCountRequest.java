package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PicturePicturesCountResponse;

import java.util.Date;
import java.util.Map;

public class PicturePicturesCountRequest
        extends BaseTaobaoRequest<PicturePicturesCountResponse> {
    private String clientType;
    private String deleted;
    private Date endDate;
    private Long pictureCategoryId;
    private Long pictureId;
    private Date startDate;
    private Date startModifiedDate;
    private String title;

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientType() {
        return this.clientType;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getDeleted() {
        return this.deleted;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return this.endDate;
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

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartModifiedDate(Date startModifiedDate) {
        this.startModifiedDate = startModifiedDate;
    }

    public Date getStartModifiedDate() {
        return this.startModifiedDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getApiMethodName() {
        return "taobao.picture.pictures.count";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("client_type", this.clientType);
        txtParams.put("deleted", this.deleted);
        txtParams.put("end_date", this.endDate);
        txtParams.put("picture_category_id", this.pictureCategoryId);
        txtParams.put("picture_id", this.pictureId);
        txtParams.put("start_date", this.startDate);
        txtParams.put("start_modified_date", this.startModifiedDate);
        txtParams.put("title", this.title);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PicturePicturesCountResponse> getResponseClass() {
        return PicturePicturesCountResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


