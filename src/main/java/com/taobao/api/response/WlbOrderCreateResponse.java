package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class WlbOrderCreateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6485219541157155742L;
    @ApiField("create_time")
    private Date createTime;
    @ApiField("order_code")
    private String orderCode;

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return this.orderCode;
    }
}


