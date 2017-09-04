package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CertPicInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 6223497588889442841L;
    @ApiField("cert_type")
    private Long certType;
    @ApiField("pic_url")
    private String picUrl;

    public Long getCertType() {
        return this.certType;
    }

    public void setCertType(Long certType) {
        this.certType = certType;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}


