package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallProductSpecPicUploadResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4882145419821452673L;
    @ApiField("spec_pic_url")
    private String specPicUrl;

    public void setSpecPicUrl(String specPicUrl) {
        this.specPicUrl = specPicUrl;
    }

    public String getSpecPicUrl() {
        return this.specPicUrl;
    }
}


