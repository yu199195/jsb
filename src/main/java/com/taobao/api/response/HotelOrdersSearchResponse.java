package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.HotelOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class HotelOrdersSearchResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8299767545141742683L;
    @ApiListField("hotel_orders")
    @ApiField("hotel_order")
    private List<HotelOrder> hotelOrders;
    @ApiField("total_results")
    private Long totalResults;

    public void setHotelOrders(List<HotelOrder> hotelOrders) {
        this.hotelOrders = hotelOrders;
    }

    public List<HotelOrder> getHotelOrders() {
        return this.hotelOrders;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


