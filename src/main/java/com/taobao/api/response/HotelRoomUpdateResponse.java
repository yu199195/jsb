package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Room;
import com.taobao.api.internal.mapping.ApiField;

public class HotelRoomUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3135452697246868561L;
    @ApiField("room")
    private Room room;

    public void setRoom(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return this.room;
    }
}


