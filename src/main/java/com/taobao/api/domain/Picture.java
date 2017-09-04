package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class Picture
        extends TaobaoObject {
    private static final long serialVersionUID = 8814287192596473332L;
    @ApiField("client_type")
    private String clientType;
    @ApiField("created")
    private Date created;
    @ApiField("deleted")
    private String deleted;
    @ApiField("gmt_create")
    private Date gmtCreate;
    @ApiField("gmt_modified")
    private Date gmtModified;
    @ApiField("md5")
    private String md5;
    @ApiField("modified")
    private Date modified;
    @ApiField("name")
    private String name;
    @ApiField("picture_category_id")
    private Long pictureCategoryId;
    @ApiField("picture_id")
    private Long pictureId;
    @ApiField("picture_path")
    private String picturePath;
    @ApiField("pixel")
    private String pixel;
    @ApiField("referenced")
    private Boolean referenced;
    @ApiField("sizes")
    private Long sizes;
    @ApiField("status")
    private String status;
    @ApiField("success")
    private Boolean success;
    @ApiField("title")
    private String title;
    @ApiField("uid")
    private Long uid;

    public String getClientType() {
        return this.clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDeleted() {
        return this.deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getMd5() {
        return this.md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
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

    public Long getPictureCategoryId() {
        return this.pictureCategoryId;
    }

    public void setPictureCategoryId(Long pictureCategoryId) {
        this.pictureCategoryId = pictureCategoryId;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public String getPicturePath() {
        return this.picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getPixel() {
        return this.pixel;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }

    public Boolean getReferenced() {
        return this.referenced;
    }

    public void setReferenced(Boolean referenced) {
        this.referenced = referenced;
    }

    public Long getSizes() {
        return this.sizes;
    }

    public void setSizes(Long sizes) {
        this.sizes = sizes;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUid() {
        return this.uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }
}


