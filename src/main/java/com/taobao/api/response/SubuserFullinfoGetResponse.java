package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SubUserFullInfo;
import com.taobao.api.internal.mapping.ApiField;

public class SubuserFullinfoGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7534921193487886372L;
    @ApiField("sub_fullinfo")
    private SubUserFullInfo subFullinfo;

    public void setSubFullinfo(SubUserFullInfo subFullinfo) {
        this.subFullinfo = subFullinfo;
    }

    public SubUserFullInfo getSubFullinfo() {
        return this.subFullinfo;
    }
}


