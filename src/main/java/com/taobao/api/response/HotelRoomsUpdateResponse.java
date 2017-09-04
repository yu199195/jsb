package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class HotelRoomsUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4733278288538981279L;
    @ApiListField("gids")
    @ApiField("string")
    private List<String> gids;

    public void setGids(List<String> gids) {
        this.gids = gids;
    }

    public List<String> getGids() {
        return this.gids;
    }
}


