package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsSkuGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5764294962422246385L;
    @ApiField("advent_lifecycle")
    private Long adventLifecycle;
    @ApiField("approval_number")
    private String approvalNumber;
    @ApiField("bar_code")
    private String barCode;
    @ApiField("brand")
    private String brand;
    @ApiField("brand_name")
    private String brandName;
    @ApiField("category")
    private String category;
    @ApiField("category_name")
    private String categoryName;
    @ApiField("color")
    private String color;
    @ApiField("cost_price")
    private Long costPrice;
    @ApiField("extend_fields")
    private String extendFields;
    @ApiField("gross_weight")
    private Long grossWeight;
    @ApiField("height")
    private Long height;
    @ApiField("iitem_code")
    private String iitemCode;
    @ApiField("is_area_sale")
    private Boolean isAreaSale;
    @ApiField("is_batch_mgt")
    private Boolean isBatchMgt;
    @ApiField("is_danger")
    private Boolean isDanger;
    @ApiField("is_hygroscopic")
    private Boolean isHygroscopic;
    @ApiField("is_shelflife")
    private Boolean isShelflife;
    @ApiField("is_sn_mgt")
    private Boolean isSnMgt;
    @ApiField("item_id")
    private String itemId;
    @ApiField("item_price")
    private Long itemPrice;
    @ApiField("length")
    private Long length;
    @ApiField("lifecycle")
    private Long lifecycle;
    @ApiField("lockup_lifecycle")
    private Long lockupLifecycle;
    @ApiField("name")
    private String name;
    @ApiField("net_weight")
    private Long netWeight;
    @ApiField("origin_address")
    private Long originAddress;
    @ApiField("pcs")
    private Long pcs;
    @ApiField("reject_lifecycle")
    private Long rejectLifecycle;
    @ApiField("size")
    private String size;
    @ApiField("specification")
    private String specification;
    @ApiField("tag_price")
    private Long tagPrice;
    @ApiField("title")
    private String title;
    @ApiField("type")
    private String type;
    @ApiField("use_yn")
    private Boolean useYn;
    @ApiField("volume")
    private Long volume;
    @ApiField("width")
    private Long width;
    @ApiField("wl_error_code")
    private String wlErrorCode;
    @ApiField("wl_error_msg")
    private String wlErrorMsg;
    @ApiField("wl_success")
    private Boolean wlSuccess;

    public void setAdventLifecycle(Long adventLifecycle) {
        this.adventLifecycle = adventLifecycle;
    }

    public Long getAdventLifecycle() {
        return this.adventLifecycle;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getApprovalNumber() {
        return this.approvalNumber;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setCostPrice(Long costPrice) {
        this.costPrice = costPrice;
    }

    public Long getCostPrice() {
        return this.costPrice;
    }

    public void setExtendFields(String extendFields) {
        this.extendFields = extendFields;
    }

    public String getExtendFields() {
        return this.extendFields;
    }

    public void setGrossWeight(Long grossWeight) {
        this.grossWeight = grossWeight;
    }

    public Long getGrossWeight() {
        return this.grossWeight;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getHeight() {
        return this.height;
    }

    public void setIitemCode(String iitemCode) {
        this.iitemCode = iitemCode;
    }

    public String getIitemCode() {
        return this.iitemCode;
    }

    public void setIsAreaSale(Boolean isAreaSale) {
        this.isAreaSale = isAreaSale;
    }

    public Boolean getIsAreaSale() {
        return this.isAreaSale;
    }

    public void setIsBatchMgt(Boolean isBatchMgt) {
        this.isBatchMgt = isBatchMgt;
    }

    public Boolean getIsBatchMgt() {
        return this.isBatchMgt;
    }

    public void setIsDanger(Boolean isDanger) {
        this.isDanger = isDanger;
    }

    public Boolean getIsDanger() {
        return this.isDanger;
    }

    public void setIsHygroscopic(Boolean isHygroscopic) {
        this.isHygroscopic = isHygroscopic;
    }

    public Boolean getIsHygroscopic() {
        return this.isHygroscopic;
    }

    public void setIsShelflife(Boolean isShelflife) {
        this.isShelflife = isShelflife;
    }

    public Boolean getIsShelflife() {
        return this.isShelflife;
    }

    public void setIsSnMgt(Boolean isSnMgt) {
        this.isSnMgt = isSnMgt;
    }

    public Boolean getIsSnMgt() {
        return this.isSnMgt;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Long getItemPrice() {
        return this.itemPrice;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getLength() {
        return this.length;
    }

    public void setLifecycle(Long lifecycle) {
        this.lifecycle = lifecycle;
    }

    public Long getLifecycle() {
        return this.lifecycle;
    }

    public void setLockupLifecycle(Long lockupLifecycle) {
        this.lockupLifecycle = lockupLifecycle;
    }

    public Long getLockupLifecycle() {
        return this.lockupLifecycle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNetWeight(Long netWeight) {
        this.netWeight = netWeight;
    }

    public Long getNetWeight() {
        return this.netWeight;
    }

    public void setOriginAddress(Long originAddress) {
        this.originAddress = originAddress;
    }

    public Long getOriginAddress() {
        return this.originAddress;
    }

    public void setPcs(Long pcs) {
        this.pcs = pcs;
    }

    public Long getPcs() {
        return this.pcs;
    }

    public void setRejectLifecycle(Long rejectLifecycle) {
        this.rejectLifecycle = rejectLifecycle;
    }

    public Long getRejectLifecycle() {
        return this.rejectLifecycle;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getSpecification() {
        return this.specification;
    }

    public void setTagPrice(Long tagPrice) {
        this.tagPrice = tagPrice;
    }

    public Long getTagPrice() {
        return this.tagPrice;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setUseYn(Boolean useYn) {
        this.useYn = useYn;
    }

    public Boolean getUseYn() {
        return this.useYn;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getVolume() {
        return this.volume;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getWidth() {
        return this.width;
    }

    public void setWlErrorCode(String wlErrorCode) {
        this.wlErrorCode = wlErrorCode;
    }

    public String getWlErrorCode() {
        return this.wlErrorCode;
    }

    public void setWlErrorMsg(String wlErrorMsg) {
        this.wlErrorMsg = wlErrorMsg;
    }

    public String getWlErrorMsg() {
        return this.wlErrorMsg;
    }

    public void setWlSuccess(Boolean wlSuccess) {
        this.wlSuccess = wlSuccess;
    }

    public Boolean getWlSuccess() {
        return this.wlSuccess;
    }
}


