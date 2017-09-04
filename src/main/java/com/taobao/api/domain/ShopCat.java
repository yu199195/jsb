package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ShopCat
        extends TaobaoObject {
    private static final long serialVersionUID = 7457116748316937668L;
    @ApiField("cid")
    private Long cid;
    @ApiField("is_parent")
    private Boolean isParent;
    @ApiField("name")
    private String name;
    @ApiField("parent_cid")
    private Long parentCid;

    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Boolean getIsParent() {
        return this.isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
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
}


