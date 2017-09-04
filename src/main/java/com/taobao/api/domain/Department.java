package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class Department
        extends TaobaoObject {
    private static final long serialVersionUID = 2443135263111151468L;
    @ApiField("department_id")
    private Long departmentId;
    @ApiField("department_name")
    private String departmentName;
    @ApiField("parent_id")
    private Long parentId;
    @ApiListField("sub_user_ids")
    @ApiField("number")
    private List<Long> subUserIds;

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public List<Long> getSubUserIds() {
        return this.subUserIds;
    }

    public void setSubUserIds(List<Long> subUserIds) {
        this.subUserIds = subUserIds;
    }
}


