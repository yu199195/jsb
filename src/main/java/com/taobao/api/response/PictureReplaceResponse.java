package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class PictureReplaceResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4726169244169144665L;
    @ApiField("done")
    private Boolean done;

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Boolean getDone() {
        return this.done;
    }
}


