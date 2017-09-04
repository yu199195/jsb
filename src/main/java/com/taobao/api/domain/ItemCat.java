package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ItemCat
        extends TaobaoObject {
    private static final long serialVersionUID = 2515861786164498737L;
    @ApiField("cid")
    private Long cid;
    @ApiListField("features")
    @ApiField("feature")
    private List<Feature> features;
    @ApiField("is_parent")
    private Boolean isParent;
    @ApiField("name")
    private String name;
    @ApiField("parent_cid")
    private Long parentCid;
    @ApiField("sort_order")
    private Long sortOrder;
    @ApiField("status")
    private String status;
    @ApiField("taosir_cat")
    private Boolean taosirCat;

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

    public Boolean getTaosirCat() {
        return this.taosirCat;
    }

    public void setTaosirCat(Boolean taosirCat) {
        this.taosirCat = taosirCat;
    }
}


