package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Department;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class SubuserDepartmentsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4519839651174862151L;
    @ApiListField("departments")
    @ApiField("department")
    private List<Department> departments;

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return this.departments;
    }
}


