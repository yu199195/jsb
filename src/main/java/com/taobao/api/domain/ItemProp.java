package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class ItemProp
        extends TaobaoObject {
    private static final long serialVersionUID = 4196938197348194299L;
    @ApiField("child_template")
    private String childTemplate;
    @ApiField("cid")
    private Long cid;
    @ApiListField("features")
    @ApiField("feature")
    private List<Feature> features;
    @ApiField("is_allow_alias")
    private Boolean isAllowAlias;
    @ApiField("is_color_prop")
    private Boolean isColorProp;
    @ApiField("is_enum_prop")
    private Boolean isEnumProp;
    @ApiField("is_input_prop")
    private Boolean isInputProp;
    @ApiField("is_item_prop")
    private Boolean isItemProp;
    @ApiField("is_key_prop")
    private Boolean isKeyProp;
    @ApiField("is_material")
    private Boolean isMaterial;
    @ApiField("is_sale_prop")
    private Boolean isSaleProp;
    @ApiField("is_taosir")
    private Boolean isTaosir;
    @ApiField("material_do")
    private ItemMaterialProp materialDo;
    @ApiField("modified_time")
    private Date modifiedTime;
    @ApiField("modified_type")
    private String modifiedType;
    @ApiField("multi")
    private Boolean multi;
    @ApiField("must")
    private Boolean must;
    @ApiField("name")
    private String name;
    @ApiField("parent_pid")
    private Long parentPid;
    @ApiField("parent_vid")
    private Long parentVid;
    @ApiField("pid")
    private Long pid;
    @ApiListField("prop_values")
    @ApiField("prop_value")
    private List<PropValue> propValues;
    @ApiField("required")
    private Boolean required;
    @ApiField("sort_order")
    private Long sortOrder;
    @ApiField("status")
    private String status;
    @ApiField("taosir_do")
    private ItemTaosirDO taosirDo;
    @ApiField("type")
    private String type;

    public String getChildTemplate() {
        return this.childTemplate;
    }

    public void setChildTemplate(String childTemplate) {
        this.childTemplate = childTemplate;
    }

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

    public Boolean getIsAllowAlias() {
        return this.isAllowAlias;
    }

    public void setIsAllowAlias(Boolean isAllowAlias) {
        this.isAllowAlias = isAllowAlias;
    }

    public Boolean getIsColorProp() {
        return this.isColorProp;
    }

    public void setIsColorProp(Boolean isColorProp) {
        this.isColorProp = isColorProp;
    }

    public Boolean getIsEnumProp() {
        return this.isEnumProp;
    }

    public void setIsEnumProp(Boolean isEnumProp) {
        this.isEnumProp = isEnumProp;
    }

    public Boolean getIsInputProp() {
        return this.isInputProp;
    }

    public void setIsInputProp(Boolean isInputProp) {
        this.isInputProp = isInputProp;
    }

    public Boolean getIsItemProp() {
        return this.isItemProp;
    }

    public void setIsItemProp(Boolean isItemProp) {
        this.isItemProp = isItemProp;
    }

    public Boolean getIsKeyProp() {
        return this.isKeyProp;
    }

    public void setIsKeyProp(Boolean isKeyProp) {
        this.isKeyProp = isKeyProp;
    }

    public Boolean getIsMaterial() {
        return this.isMaterial;
    }

    public void setIsMaterial(Boolean isMaterial) {
        this.isMaterial = isMaterial;
    }

    public Boolean getIsSaleProp() {
        return this.isSaleProp;
    }

    public void setIsSaleProp(Boolean isSaleProp) {
        this.isSaleProp = isSaleProp;
    }

    public Boolean getIsTaosir() {
        return this.isTaosir;
    }

    public void setIsTaosir(Boolean isTaosir) {
        this.isTaosir = isTaosir;
    }

    public ItemMaterialProp getMaterialDo() {
        return this.materialDo;
    }

    public void setMaterialDo(ItemMaterialProp materialDo) {
        this.materialDo = materialDo;
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

    public Boolean getMulti() {
        return this.multi;
    }

    public void setMulti(Boolean multi) {
        this.multi = multi;
    }

    public Boolean getMust() {
        return this.must;
    }

    public void setMust(Boolean must) {
        this.must = must;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentPid() {
        return this.parentPid;
    }

    public void setParentPid(Long parentPid) {
        this.parentPid = parentPid;
    }

    public Long getParentVid() {
        return this.parentVid;
    }

    public void setParentVid(Long parentVid) {
        this.parentVid = parentVid;
    }

    public Long getPid() {
        return this.pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public List<PropValue> getPropValues() {
        return this.propValues;
    }

    public void setPropValues(List<PropValue> propValues) {
        this.propValues = propValues;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
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

    public ItemTaosirDO getTaosirDo() {
        return this.taosirDo;
    }

    public void setTaosirDo(ItemTaosirDO taosirDo) {
        this.taosirDo = taosirDo;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


