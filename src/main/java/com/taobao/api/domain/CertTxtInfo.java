package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CertTxtInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 6456263589176186125L;
    @ApiField("cert_type")
    private Long certType;
    @ApiField("text")
    private String text;

    public Long getCertType() {
        return this.certType;
    }

    public void setCertType(Long certType) {
        this.certType = certType;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}


