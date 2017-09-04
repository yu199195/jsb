package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PropImg;
import com.taobao.api.internal.mapping.ApiField;

public class ItemJointPropimgResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3536716881126267736L;
    @ApiField("prop_img")
    private PropImg propImg;

    public void setPropImg(PropImg propImg) {
        this.propImg = propImg;
    }

    public PropImg getPropImg() {
        return this.propImg;
    }
}


