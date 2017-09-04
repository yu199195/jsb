package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class PictureCategory
        extends TaobaoObject {
    private static final long serialVersionUID = 3451729349615226631L;
    @ApiField("created")
    private Date created;
    @ApiField("modified")
    private Date modified;
    @ApiField("parent_id")
    private Long parentId;
    @ApiField("picture_category_id")
    private Long pictureCategoryId;
    @ApiField("picture_category_name")
    private String pictureCategoryName;
    @ApiField("position")
    private Long position;
    @ApiField("total")
    private Long total;
    @ApiField("type")
    private String type;

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

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getPictureCategoryId() {
        return this.pictureCategoryId;
    }

    public void setPictureCategoryId(Long pictureCategoryId) {
        this.pictureCategoryId = pictureCategoryId;
    }

    public String getPictureCategoryName() {
        return this.pictureCategoryName;
    }

    public void setPictureCategoryName(String pictureCategoryName) {
        this.pictureCategoryName = pictureCategoryName;
    }

    public Long getPosition() {
        return this.position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


