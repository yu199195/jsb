package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Role;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class SellercenterRolesGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3726593712282981941L;
    @ApiListField("roles")
    @ApiField("role")
    private List<Role> roles;

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return this.roles;
    }
}


