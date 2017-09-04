package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SubuserDepartmentAddResponse;

import java.util.Map;

public class SubuserDepartmentAddRequest
        extends BaseTaobaoRequest<SubuserDepartmentAddResponse> {
    private String departmentName;
    private Long parentId;
    private String userNick;

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
        return "taobao.subuser.department.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("department_name", this.departmentName);
        txtParams.put("parent_id", this.parentId);
        txtParams.put("user_nick", this.userNick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<SubuserDepartmentAddResponse> getResponseClass() {
        return SubuserDepartmentAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.departmentName, "departmentName");
        RequestCheckUtils.checkNotEmpty(this.parentId, "parentId");
        RequestCheckUtils.checkNotEmpty(this.userNick, "userNick");
    }
}


