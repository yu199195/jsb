package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PictureCategory;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class PictureCategoryGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1368413763241398197L;
    @ApiListField("picture_categories")
    @ApiField("picture_category")
    private List<PictureCategory> pictureCategories;

    public void setPictureCategories(List<PictureCategory> pictureCategories) {
        this.pictureCategories = pictureCategories;
    }

    public List<PictureCategory> getPictureCategories() {
        return this.pictureCategories;
    }
}


