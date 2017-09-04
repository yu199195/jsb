package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class FenxiaoGradeAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1242512765199373347L;
    @ApiField("grade_id")
    private Long gradeId;
    @ApiField("is_success")
    private Boolean isSuccess;

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public Long getGradeId() {
        return this.gradeId;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }
}


