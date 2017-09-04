package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Room;
import com.taobao.api.internal.mapping.ApiField;

public class HotelRoomGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5234891141666867196L;
    @ApiField("room")
    private Room room;

    public void setRoom(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return this.room;
    }
}


