package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class WlbOrderCancelResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6459682817274748272L;
    @ApiField("error_code_list")
    private String errorCodeList;
    @ApiField("modify_time")
    private Date modifyTime;

    public void setErrorCodeList(String errorCodeList) {
        this.errorCodeList = errorCodeList;
    }

    public String getErrorCodeList() {
        return this.errorCodeList;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }
}


