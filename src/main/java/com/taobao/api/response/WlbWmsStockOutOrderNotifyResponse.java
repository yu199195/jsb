package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsStockOutOrderNotifyResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5235291685314563472L;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("wl_error_code")
    private String wlErrorCode;
    @ApiField("wl_error_msg")
    private String wlErrorMsg;
    @ApiField("wl_success")
    private Boolean wlSuccess;

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


