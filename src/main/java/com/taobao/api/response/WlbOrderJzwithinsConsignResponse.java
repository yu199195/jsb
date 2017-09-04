package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WlbOrderJzwithinsConsignResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6459119689132774555L;
    @ApiField("is_success")
    private Boolean isSuccess;
    @ApiField("result_info")
    private String resultInfo;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public String getResultInfo() {
        return this.resultInfo;
    }
}


