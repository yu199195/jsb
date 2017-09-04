package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TopIpoutGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6789972666195125726L;
    @ApiListField("ip_sections")
    @ApiField("string")
    private List<String> ipSections;

    public void setIpSections(List<String> ipSections) {
        this.ipSections = ipSections;
    }

    public List<String> getIpSections() {
        return this.ipSections;
    }
}


