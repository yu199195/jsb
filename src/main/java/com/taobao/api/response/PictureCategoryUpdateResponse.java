package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class PictureCategoryUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2363663238788143472L;
    @ApiField("done")
    private Boolean done;

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Boolean getDone() {
        return this.done;
    }
}


