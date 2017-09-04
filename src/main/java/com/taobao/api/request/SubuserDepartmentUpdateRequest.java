package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SubuserDepartmentUpdateResponse;

import java.util.Map;

public class SubuserDepartmentUpdateRequest
        extends BaseTaobaoRequest<SubuserDepartmentUpdateResponse> {
    private Long departmentId;
    private String departmentName;
    private Long parentId;
    private String userNick;

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public String getApiMethodName() {
        return "taobao.subuser.department.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("department_id", this.departmentId);
        txtParams.put("department_name", this.departmentName);
        txtParams.put("parent_id", this.parentId);
        txtParams.put("user_nick", this.userNick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<SubuserDepartmentUpdateResponse> getResponseClass() {
        return SubuserDepartmentUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.departmentId, "departmentId");
        RequestCheckUtils.checkNotEmpty(this.userNick, "userNick");
    }
}


