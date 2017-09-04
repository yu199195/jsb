package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class Video
        extends TaobaoObject {
    private static final long serialVersionUID = 1465719922771151316L;
    @ApiField("created")
    private Date created;
    @ApiField("id")
    private Long id;
    @ApiField("iid")
    private String iid;
    @ApiField("modified")
    private Date modified;
    @ApiField("num_iid")
    private Long numIid;
    @ApiField("url")
    private String url;
    @ApiField("video_id")
    private Long videoId;

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIid() {
        return this.iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getVideoId() {
        return this.videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }
}


