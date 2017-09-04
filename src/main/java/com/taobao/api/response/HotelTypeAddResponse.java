package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RoomType;
import com.taobao.api.internal.mapping.ApiField;

public class HotelTypeAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1863155198837774727L;
    @ApiField("room_type")
    private RoomType roomType;

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }
}


