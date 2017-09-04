package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class SpuTemplateDO
        extends TaobaoObject {
    private static final long serialVersionUID = 7537562968455691774L;
    @ApiListField("affect_properties")
    @ApiField("number")
    private List<Long> affectProperties;
    @ApiField("category_id")
    private Long categoryId;
    @ApiField("commodity_id")
    private Long commodityId;
    @ApiListField("filter_properties")
    @ApiField("number")
    private List<Long> filterProperties;
    @ApiListField("key_properties")
    @ApiField("number")
    private List<Long> keyProperties;
    @ApiField("prop_features")
    private String propFeatures;
    @ApiField("prop_name_str")
    private String propNameStr;
    @ApiField("template_id")
    private Long templateId;

    public List<Long> getAffectProperties() {
        return this.affectProperties;
    }

    public void setAffectProperties(List<Long> affectProperties) {
        this.affectProperties = affectProperties;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCommodityId() {
        return this.commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public List<Long> getFilterProperties() {
        return this.filterProperties;
    }

    public void setFilterProperties(List<Long> filterProperties) {
        this.filterProperties = filterProperties;
    }

    public List<Long> getKeyProperties() {
        return this.keyProperties;
    }

    public void setKeyProperties(List<Long> keyProperties) {
        this.keyProperties = keyProperties;
    }

    public String getPropFeatures() {
        return this.propFeatures;
    }

    public void setPropFeatures(String propFeatures) {
        this.propFeatures = propFeatures;
    }

    public String getPropNameStr() {
        return this.propNameStr;
    }

    public void setPropNameStr(String propNameStr) {
        this.propNameStr = propNameStr;
    }

    public Long getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }
}


