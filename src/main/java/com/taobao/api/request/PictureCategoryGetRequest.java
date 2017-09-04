package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureCategoryGetResponse;

import java.util.Date;
import java.util.Map;

public class PictureCategoryGetRequest
        extends BaseTaobaoRequest<PictureCategoryGetResponse> {
    private Date modifiedTime;
    private Long parentId;
    private Long pictureCategoryId;
    private String pictureCategoryName;
    private String type;

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setPictureCategoryId(Long pictureCategoryId) {
        this.pictureCategoryId = pictureCategoryId;
    }

    public Long getPictureCategoryId() {
        return this.pictureCategoryId;
    }

    public void setPictureCategoryName(String pictureCategoryName) {
        this.pictureCategoryName = pictureCategoryName;
    }

    public String getPictureCategoryName() {
        return this.pictureCategoryName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String getApiMethodName() {
        return "taobao.picture.category.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("modified_time", this.modifiedTime);
        txtParams.put("parent_id", this.parentId);
        txtParams.put("picture_category_id", this.pictureCategoryId);
        txtParams.put("picture_category_name", this.pictureCategoryName);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PictureCategoryGetResponse> getResponseClass() {
        return PictureCategoryGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


