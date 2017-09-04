package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class HistoryTradeRelationDo
        extends TaobaoObject {
    private static final long serialVersionUID = 1662793981135624981L;
    @ApiField("gmt_created")
    private Date gmtCreated;
    @ApiField("gmt_modified")
    private Date gmtModified;
    @ApiField("id")
    private Long id;
    @ApiField("tag_name")
    private String tagName;
    @ApiField("tag_type")
    private Long tagType;
    @ApiField("tag_value")
    private String tagValue;
    @ApiField("tid")
    private Long tid;
    @ApiField("visible")
    private Long visible;

    public Date getGmtCreated() {
        return this.gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
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

    public String getTagName() {
        return this.tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Long getTagType() {
        return this.tagType;
    }

    public void setTagType(Long tagType) {
        this.tagType = tagType;
    }

    public String getTagValue() {
        return this.tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    public Long getTid() {
        return this.tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getVisible() {
        return this.visible;
    }

    public void setVisible(Long visible) {
        this.visible = visible;
    }
}


