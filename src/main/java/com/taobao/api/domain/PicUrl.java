package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class PicUrl
        extends TaobaoObject {
    private static final long serialVersionUID = 6315952875243954842L;
    @ApiField("url")
    private String url;

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}


