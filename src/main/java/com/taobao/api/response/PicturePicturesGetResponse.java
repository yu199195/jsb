package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Picture;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class PicturePicturesGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7887735342676994392L;
    @ApiListField("pictures")
    @ApiField("picture")
    private List<Picture> pictures;

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public List<Picture> getPictures() {
        return this.pictures;
    }
}


