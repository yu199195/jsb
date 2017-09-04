package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class PictureIsreferencedGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1291579726286845138L;
    @ApiField("is_referenced")
    private Boolean isReferenced;

    public void setIsReferenced(Boolean isReferenced) {
        this.isReferenced = isReferenced;
    }

    public Boolean getIsReferenced() {
        return this.isReferenced;
    }
}


