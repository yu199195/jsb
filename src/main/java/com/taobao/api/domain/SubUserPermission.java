package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class SubUserPermission
        extends TaobaoObject {
    private static final long serialVersionUID = 8631314153119864575L;
    @ApiListField("permissions")
    @ApiField("permission")
    private List<Permission> permissions;
    @ApiListField("roles")
    @ApiField("role")
    private List<Role> roles;

    public List<Permission> getPermissions() {
        return this.permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<Role> getRoles() {
        return this.roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}


