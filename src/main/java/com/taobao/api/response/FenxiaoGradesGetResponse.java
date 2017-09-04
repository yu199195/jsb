package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FenxiaoGrade;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoGradesGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1126847773446194625L;
    @ApiListField("fenxiao_grades")
    @ApiField("fenxiao_grade")
    private List<FenxiaoGrade> fenxiaoGrades;

    public void setFenxiaoGrades(List<FenxiaoGrade> fenxiaoGrades) {
        this.fenxiaoGrades = fenxiaoGrades;
    }

    public List<FenxiaoGrade> getFenxiaoGrades() {
        return this.fenxiaoGrades;
    }
}


