package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Area;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class AreasGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2767221395952795423L;
    @ApiListField("areas")
    @ApiField("area")
    private List<Area> areas;

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public List<Area> getAreas() {
        return this.areas;
    }
}


