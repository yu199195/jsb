package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class FenxiaoGrade
        extends TaobaoObject {
    private static final long serialVersionUID = 5777433476594611377L;
    @ApiField("created")
    private Date created;
    @ApiField("grade_id")
    private Long gradeId;
    @ApiField("modified")
    private Date modified;
    @ApiField("name")
    private String name;

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getGradeId() {
        return this.gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


