package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmcMessageProduceResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5186145811184236686L;
    @ApiField("is_success")
    private Boolean isSuccess;
    @ApiField("total")
    private Long total;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotal() {
        return this.total;
    }
}


