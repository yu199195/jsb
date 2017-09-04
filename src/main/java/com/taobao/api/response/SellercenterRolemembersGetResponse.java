package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SubUserInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class SellercenterRolemembersGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6314915256188432595L;
    @ApiListField("subusers")
    @ApiField("sub_user_info")
    private List<SubUserInfo> subusers;

    public void setSubusers(List<SubUserInfo> subusers) {
        this.subusers = subusers;
    }

    public List<SubUserInfo> getSubusers() {
        return this.subusers;
    }
}


