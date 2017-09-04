package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class WlbItem
        extends TaobaoObject {
    private static final long serialVersionUID = 3614499192844679857L;
    @ApiField("brand_id")
    private Long brandId;
    @ApiField("color")
    private String color;
    @ApiField("creator")
    private String creator;
    @ApiField("flag")
    private String flag;
    @ApiField("gmt_create")
    private Date gmtCreate;
    @ApiField("gmt_modified")
    private Date gmtModified;
    @ApiField("goods_cat")
    private String goodsCat;
    @ApiField("height")
    private Long height;
    @ApiField("id")
    private Long id;
    @ApiField("is_dangerous")
    private Boolean isDangerous;
    @ApiField("is_friable")
    private Boolean isFriable;
    @ApiField("is_sku")
    private Boolean isSku;
    @ApiField("item_code")
    private String itemCode;
    @ApiField("last_modifier")
    private String lastModifier;
    @ApiField("length")
    private Long length;
    @ApiField("name")
    private String name;
    @ApiField("package_material")
    private String packageMaterial;
    @ApiField("parent_id")
    private Long parentId;
    @ApiField("price")
    private Long price;
    @ApiField("pricing_cat")
    private String pricingCat;
    @ApiField("properties")
    private String properties;
    @ApiField("publish_version")
    private Long publishVersion;
    @ApiField("remark")
    private String remark;
    @ApiField("status")
    private String status;
    @ApiField("title")
    private String title;
    @ApiField("type")
    private String type;
    @ApiField("user_id")
    private Long userId;
    @ApiField("user_nick")
    private String userNick;
    @ApiField("volume")
    private Long volume;
    @ApiField("weight")
    private Long weight;
    @ApiField("width")
    private Long width;

    public Long getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getFlag() {
        return this.flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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

    public String getGoodsCat() {
        return this.goodsCat;
    }

    public void setGoodsCat(String goodsCat) {
        this.goodsCat = goodsCat;
    }

    public Long getHeight() {
        return this.height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsDangerous() {
        return this.isDangerous;
    }

    public void setIsDangerous(Boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public Boolean getIsFriable() {
        return this.isFriable;
    }

    public void setIsFriable(Boolean isFriable) {
        this.isFriable = isFriable;
    }

    public Boolean getIsSku() {
        return this.isSku;
    }

    public void setIsSku(Boolean isSku) {
        this.isSku = isSku;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getLastModifier() {
        return this.lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    public Long getLength() {
        return this.length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageMaterial() {
        return this.packageMaterial;
    }

    public void setPackageMaterial(String packageMaterial) {
        this.packageMaterial = packageMaterial;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getPricingCat() {
        return this.pricingCat;
    }

    public void setPricingCat(String pricingCat) {
        this.pricingCat = pricingCat;
    }

    public String getProperties() {
        return this.properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public Long getPublishVersion() {
        return this.publishVersion;
    }

    public void setPublishVersion(Long publishVersion) {
        this.publishVersion = publishVersion;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public Long getVolume() {
        return this.volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getWeight() {
        return this.weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getWidth() {
        return this.width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }
}


