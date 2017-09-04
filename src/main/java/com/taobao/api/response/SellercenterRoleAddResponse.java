package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Role;
import com.taobao.api.internal.mapping.ApiField;

public class SellercenterRoleAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4434482455163594188L;
    @ApiField("role")
    private Role role;

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return this.role;
    }
}


