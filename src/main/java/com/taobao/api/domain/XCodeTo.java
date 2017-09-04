package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class XCodeTo
        extends TaobaoObject {
    private static final long serialVersionUID = 3133521721375164938L;
    @ApiField("gmt_create")
    private Date gmtCreate;
    @ApiField("gmt_modified")
    private Date gmtModified;
    @ApiField("id")
    private Long id;
    @ApiField("img_url")
    private String imgUrl;
    @ApiField("life_end")
    private Date lifeEnd;
    @ApiField("life_start")
    private Date lifeStart;
    @ApiField("short_name")
    private String shortName;
    @ApiField("short_url")
    private String shortUrl;
    @ApiField("status")
    private Long status;
    @ApiField("user_id")
    private Long userId;

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

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Date getLifeEnd() {
        return this.lifeEnd;
    }

    public void setLifeEnd(Date lifeEnd) {
        this.lifeEnd = lifeEnd;
    }

    public Date getLifeStart() {
        return this.lifeStart;
    }

    public void setLifeStart(Date lifeStart) {
        this.lifeStart = lifeStart;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getShortUrl() {
        return this.shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}


