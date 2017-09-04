package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.OrderWarehouseRouteGetItems;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WmsOrderWarehouseRouteGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1511698594913622878L;
    @ApiListField("items")
    @ApiField("order_warehouse_route_get_items")
    private List<OrderWarehouseRouteGetItems> items;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("wl_error_code")
    private String wlErrorCode;
    @ApiField("wl_error_msg")
    private String wlErrorMsg;
    @ApiField("wl_success")
    private Boolean wlSuccess;

    public void setItems(List<OrderWarehouseRouteGetItems> items) {
        this.items = items;
    }

    public List<OrderWarehouseRouteGetItems> getItems() {
        return this.items;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setWlErrorCode(String wlErrorCode) {
        this.wlErrorCode = wlErrorCode;
    }

    public String getWlErrorCode() {
        return this.wlErrorCode;
    }

    public void setWlErrorMsg(String wlErrorMsg) {
        this.wlErrorMsg = wlErrorMsg;
    }

    public String getWlErrorMsg() {
        return this.wlErrorMsg;
    }

    public void setWlSuccess(Boolean wlSuccess) {
        this.wlSuccess = wlSuccess;
    }

    public Boolean getWlSuccess() {
        return this.wlSuccess;
    }
}


