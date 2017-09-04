package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Area
        extends TaobaoObject {
    private static final long serialVersionUID = 3699423156553392558L;
    @ApiField("id")
    private Long id;
    @ApiField("name")
    private String name;
    @ApiField("parent_id")
    private Long parentId;
    @ApiField("type")
    private Long type;
    @ApiField("zip")
    private String zip;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getType() {
        return this.type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}


