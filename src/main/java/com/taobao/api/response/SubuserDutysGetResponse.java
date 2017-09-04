package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Duty;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class SubuserDutysGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4419414295638377291L;
    @ApiListField("dutys")
    @ApiField("duty")
    private List<Duty> dutys;

    public void setDutys(List<Duty> dutys) {
        this.dutys = dutys;
    }

    public List<Duty> getDutys() {
        return this.dutys;
    }
}


