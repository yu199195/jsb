package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class LogisticsConsignOrderCreateandsendResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8341784717745488764L;
    @ApiField("is_success")
    private Boolean isSuccess;
    @ApiField("order_id")
    private Long orderId;
    @ApiField("result_desc")
    private String resultDesc;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public String getResultDesc() {
        return this.resultDesc;
    }
}


