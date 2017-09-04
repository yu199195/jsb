package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Permission;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class SellercenterUserPermissionsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5235412966561261931L;
    @ApiListField("permissions")
    @ApiField("permission")
    private List<Permission> permissions;

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }
}


