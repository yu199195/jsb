package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class RoomType
        extends TaobaoObject {
    private static final long serialVersionUID = 7672168746811856298L;
    @ApiField("alias_name")
    private String aliasName;
    @ApiField("audit_deny_reason")
    private String auditDenyReason;
    @ApiField("created")
    private Date created;
    @ApiField("hid")
    private Long hid;
    @ApiField("modified")
    private Date modified;
    @ApiField("name")
    private String name;
    @ApiField("rid")
    private Long rid;
    @ApiField("status")
    private Long status;

    public String getAliasName() {
        return this.aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getAuditDenyReason() {
        return this.auditDenyReason;
    }

    public void setAuditDenyReason(String auditDenyReason) {
        this.auditDenyReason = auditDenyReason;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRid() {
        return this.rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}


