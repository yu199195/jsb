package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PictureCategory;
import com.taobao.api.internal.mapping.ApiField;

public class PictureCategoryAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2174927132977142213L;
    @ApiField("picture_category")
    private PictureCategory pictureCategory;

    public void setPictureCategory(PictureCategory pictureCategory) {
        this.pictureCategory = pictureCategory;
    }

    public PictureCategory getPictureCategory() {
        return this.pictureCategory;
    }
}


