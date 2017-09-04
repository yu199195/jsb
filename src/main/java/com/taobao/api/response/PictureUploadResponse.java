package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Picture;
import com.taobao.api.internal.mapping.ApiField;

public class PictureUploadResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5356235413847839562L;
    @ApiField("picture")
    private Picture picture;

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Picture getPicture() {
        return this.picture;
    }
}


