package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.XCodeTo;
import com.taobao.api.internal.mapping.ApiField;

public class WirelessXcodeCreateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1638518123345385686L;
    @ApiField("xcode")
    private XCodeTo xcode;

    public void setXcode(XCodeTo xcode) {
        this.xcode = xcode;
    }

    public XCodeTo getXcode() {
        return this.xcode;
    }
}


