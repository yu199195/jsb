package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PropImg;
import com.taobao.api.internal.mapping.ApiField;

public class ItemPropimgUploadResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8819779353497497973L;
    @ApiField("prop_img")
    private PropImg propImg;

    public void setPropImg(PropImg propImg) {
        this.propImg = propImg;
    }

    public PropImg getPropImg() {
        return this.propImg;
    }
}


