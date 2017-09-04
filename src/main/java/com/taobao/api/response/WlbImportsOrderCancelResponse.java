package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WlbImportsOrderCancelResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4577854625289156643L;
    @ApiField("is_success")
    private Boolean isSuccess;
    @ApiField("result_error_code")
    private String resultErrorCode;
    @ApiField("result_error_msg")
    private String resultErrorMsg;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setResultErrorCode(String resultErrorCode) {
        this.resultErrorCode = resultErrorCode;
    }

    public String getResultErrorCode() {
        return this.resultErrorCode;
    }

    public void setResultErrorMsg(String resultErrorMsg) {
        this.resultErrorMsg = resultErrorMsg;
    }

    public String getResultErrorMsg() {
        return this.resultErrorMsg;
    }
}


