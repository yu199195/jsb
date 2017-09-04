package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class PropValue
        extends TaobaoObject {
    private static final long serialVersionUID = 5339423457214998561L;
    @ApiField("cid")
    private Long cid;
    @ApiListField("features")
    @ApiField("feature")
    private List<Feature> features;
    @ApiField("is_parent")
    private Boolean isParent;
    @ApiField("modified_time")
    private Date modifiedTime;
    @ApiField("modified_type")
    private String modifiedType;
    @ApiField("name")
    private String name;
    @ApiField("name_alias")
    private String nameAlias;
    @ApiField("pid")
    private Long pid;
    @ApiField("prop_name")
    private String propName;
    @ApiField("sort_order")
    private Long sortOrder;
    @ApiField("status")
    private String status;
    @ApiField("vid")
    private Long vid;

    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public List<Feature> getFeatures() {
        return this.features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public Boolean getIsParent() {
        return this.isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getModifiedType() {
        return this.modifiedType;
    }

    public void setModifiedType(String modifiedType) {
        this.modifiedType = modifiedType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAlias() {
        return this.nameAlias;
    }

    public void setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
    }

    public Long getPid() {
        return this.pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPropName() {
        return this.propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    public Long getSortOrder() {
        return this.sortOrder;
    }

    public void setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getVid() {
        return this.vid;
    }

    public void setVid(Long vid) {
        this.vid = vid;
    }
}


