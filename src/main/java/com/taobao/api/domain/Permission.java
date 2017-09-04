package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Permission
        extends TaobaoObject {
    private static final long serialVersionUID = 5888495533963622973L;
    @ApiField("is_authorize")
    private Long isAuthorize;
    @ApiField("parent_code")
    private String parentCode;
    @ApiField("permission_code")
    private String permissionCode;
    @ApiField("permission_name")
    private String permissionName;

    public Long getIsAuthorize() {
        return this.isAuthorize;
    }

    public void setIsAuthorize(Long isAuthorize) {
        this.isAuthorize = isAuthorize;
    }

    public String getParentCode() {
        return this.parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getPermissionCode() {
        return this.permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getPermissionName() {
        return this.permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
}


