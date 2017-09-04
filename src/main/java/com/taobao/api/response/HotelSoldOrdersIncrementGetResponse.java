package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.HotelOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class HotelSoldOrdersIncrementGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3232568448563846987L;
    @ApiField("has_next")
    private Boolean hasNext;
    @ApiListField("hotel_orders")
    @ApiField("hotel_order")
    private List<HotelOrder> hotelOrders;
    @ApiField("total_results")
    private Long totalResults;

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Boolean getHasNext() {
        return this.hasNext;
    }

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


