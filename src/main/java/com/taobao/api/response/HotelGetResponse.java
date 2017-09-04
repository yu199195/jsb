package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Hotel;
import com.taobao.api.internal.mapping.ApiField;

public class HotelGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1634637351361422991L;
    @ApiField("hotel")
    private Hotel hotel;

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Hotel getHotel() {
        return this.hotel;
    }
}


