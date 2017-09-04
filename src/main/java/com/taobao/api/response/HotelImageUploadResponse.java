package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.HotelImage;
import com.taobao.api.internal.mapping.ApiField;

public class HotelImageUploadResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6243724282618359986L;
    @ApiField("hotel_image")
    private HotelImage hotelImage;

    public void setHotelImage(HotelImage hotelImage) {
        this.hotelImage = hotelImage;
    }

    public HotelImage getHotelImage() {
        return this.hotelImage;
    }
}


