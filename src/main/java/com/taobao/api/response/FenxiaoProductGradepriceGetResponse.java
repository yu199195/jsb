package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.GradeDiscount;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoProductGradepriceGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2554521745497361573L;
    @ApiListField("grade_discounts")
    @ApiField("grade_discount")
    private List<GradeDiscount> gradeDiscounts;
    @ApiField("is_success")
    private Boolean isSuccess;

    public void setGradeDiscounts(List<GradeDiscount> gradeDiscounts) {
        this.gradeDiscounts = gradeDiscounts;
    }

    public List<GradeDiscount> getGradeDiscounts() {
        return this.gradeDiscounts;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }
}


