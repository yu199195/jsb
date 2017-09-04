package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class ItemImg
        extends TaobaoObject {
    private static final long serialVersionUID = 1125873215354447295L;
    @ApiField("created")
    private Date created;
    @ApiField("id")
    private Long id;
    @ApiField("position")
    private Long position;
    @ApiField("url")
    private String url;

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

    public Long getPosition() {
        return this.position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}


