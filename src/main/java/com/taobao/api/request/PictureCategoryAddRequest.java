package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureCategoryAddResponse;

import java.util.Map;

public class PictureCategoryAddRequest
        extends BaseTaobaoRequest<PictureCategoryAddResponse> {
    private Long parentId;
    private String pictureCategoryName;

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setPictureCategoryName(String pictureCategoryName) {
        this.pictureCategoryName = pictureCategoryName;
    }

    public String getPictureCategoryName() {
        return this.pictureCategoryName;
    }

    public String getApiMethodName() {
        return "taobao.picture.category.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("parent_id", this.parentId);
        txtParams.put("picture_category_name", this.pictureCategoryName);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PictureCategoryAddResponse> getResponseClass() {
        return PictureCategoryAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.pictureCategoryName, "pictureCategoryName");
    }
}


