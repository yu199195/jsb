package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class LogisticsOnlineCancelResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6373916445277535156L;
    @ApiField("is_success")
    private Boolean isSuccess;
    @ApiField("modify_time")
    private String modifyTime;
    @ApiField("recreated_order_id")
    private String recreatedOrderId;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyTime() {
        return this.modifyTime;
    }

    public void setRecreatedOrderId(String recreatedOrderId) {
        this.recreatedOrderId = recreatedOrderId;
    }

    public String getRecreatedOrderId() {
        return this.recreatedOrderId;
    }
}


