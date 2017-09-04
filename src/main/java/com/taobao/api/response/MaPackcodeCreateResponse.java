package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class MaPackcodeCreateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4626571187287996934L;
    @ApiField("qrcodeurl")
    private String qrcodeurl;

    public void setQrcodeurl(String qrcodeurl) {
        this.qrcodeurl = qrcodeurl;
    }

    public String getQrcodeurl() {
        return this.qrcodeurl;
    }
}


