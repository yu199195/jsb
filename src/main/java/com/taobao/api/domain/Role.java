package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class Role
        extends TaobaoObject {
    private static final long serialVersionUID = 7345281196547225256L;
    @ApiField("create_time")
    private Date createTime;
    @ApiField("description")
    private String description;
    @ApiField("modified_time")
    private Date modifiedTime;
    @ApiListField("permissions")
    @ApiField("permission")
    private List<Permission> permissions;
    @ApiField("role_id")
    private Long roleId;
    @ApiField("role_name")
    private String roleName;
    @ApiField("seller_id")
    private Long sellerId;

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public List<Permission> getPermissions() {
        return this.permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public Long getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }
}


