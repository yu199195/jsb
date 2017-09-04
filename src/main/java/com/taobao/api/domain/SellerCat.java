package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class SellerCat
        extends TaobaoObject {
    private static final long serialVersionUID = 4684432354559684675L;
    @ApiField("cid")
    private Long cid;
    @ApiField("created")
    private Date created;
    @ApiField("modified")
    private Date modified;
    @ApiField("name")
    private String name;
    @ApiField("parent_cid")
    private Long parentCid;
    @ApiField("pic_url")
    private String picUrl;
    @ApiField("sort_order")
    private Long sortOrder;
    @ApiField("type")
    private String type;

    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
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

    public Long getParentCid() {
        return this.parentCid;
    }

    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Long getSortOrder() {
        return this.sortOrder;
    }

    public void setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


