package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PropImg;
import com.taobao.api.internal.mapping.ApiField;

public class ItemPropimgDeleteResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2622251814867927152L;
    @ApiField("prop_img")
    private PropImg propImg;

    public void setPropImg(PropImg propImg) {
        this.propImg = propImg;
    }

    public PropImg getPropImg() {
        return this.propImg;
    }
}


