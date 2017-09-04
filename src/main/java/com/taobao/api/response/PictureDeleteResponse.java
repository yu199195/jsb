package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class PictureDeleteResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7141869255412647322L;
    @ApiField("success")
    private Boolean success;

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return this.success;
    }
}


