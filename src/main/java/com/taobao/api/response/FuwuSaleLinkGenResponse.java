package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class FuwuSaleLinkGenResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3817723276371924394L;
    @ApiField("url")
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}


