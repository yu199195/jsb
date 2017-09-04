package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.HotelOrder;
import com.taobao.api.internal.mapping.ApiField;

public class HotelOrderGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8151122297719296767L;
    @ApiField("hotel_order")
    private HotelOrder hotelOrder;

    public void setHotelOrder(HotelOrder hotelOrder) {
        this.hotelOrder = hotelOrder;
    }

    public HotelOrder getHotelOrder() {
        return this.hotelOrder;
    }
}


