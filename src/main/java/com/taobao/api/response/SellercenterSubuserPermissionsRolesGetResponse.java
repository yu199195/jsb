package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SubUserPermission;
import com.taobao.api.internal.mapping.ApiField;

public class SellercenterSubuserPermissionsRolesGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5758511178784397935L;
    @ApiField("subuser_permission")
    private SubUserPermission subuserPermission;

    public void setSubuserPermission(SubUserPermission subuserPermission) {
        this.subuserPermission = subuserPermission;
    }

    public SubUserPermission getSubuserPermission() {
        return this.subuserPermission;
    }
}


