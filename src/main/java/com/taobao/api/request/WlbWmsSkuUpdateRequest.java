package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWmsSkuUpdateResponse;

import java.util.Map;

public class WlbWmsSkuUpdateRequest
        extends BaseTaobaoRequest<WlbWmsSkuUpdateResponse> {
    private Long adventLifecycle;
    private String approvalNumber;
    private String attribute;
    private String barCode;
    private String brand;
    private String brandName;
    private String category;
    private String categoryName;
    private String color;
    private Long costPrice;
    private String extendFields;
    private Long grossWeight;
    private Long height;
    private Boolean isAreaSale;
    private Boolean isBatchMgt;
    private Boolean isDanger;
    private Boolean isHygroscopic;
    private Boolean isShelflife;
    private Boolean isSnMgt;
    private String itemId;
    private Long itemPrice;
    private Long length;
    private Long lifecycle;
    private Long lockupLifecycle;
    private String name;
    private Long netWeight;
    private Long originAddress;
    private Long pcs;
    private Long rejectLifecycle;
    private String size;
    private String specification;
    private String storeCode;
    private Long tagPrice;
    private String title;
    private String type;
    private Boolean useYn;
    private Long volume;
    private Long width;

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

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return this.attribute;
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

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
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

    public String getApiMethodName() {
        return "taobao.wlb.wms.sku.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("advent_lifecycle", this.adventLifecycle);
        txtParams.put("approval_number", this.approvalNumber);
        txtParams.put("attribute", this.attribute);
        txtParams.put("bar_code", this.barCode);
        txtParams.put("brand", this.brand);
        txtParams.put("brand_name", this.brandName);
        txtParams.put("category", this.category);
        txtParams.put("category_name", this.categoryName);
        txtParams.put("color", this.color);
        txtParams.put("cost_price", this.costPrice);
        txtParams.put("extend_fields", this.extendFields);
        txtParams.put("gross_weight", this.grossWeight);
        txtParams.put("height", this.height);
        txtParams.put("is_area_sale", this.isAreaSale);
        txtParams.put("is_batch_mgt", this.isBatchMgt);
        txtParams.put("is_danger", this.isDanger);
        txtParams.put("is_hygroscopic", this.isHygroscopic);
        txtParams.put("is_shelflife", this.isShelflife);
        txtParams.put("is_sn_mgt", this.isSnMgt);
        txtParams.put("item_id", this.itemId);
        txtParams.put("item_price", this.itemPrice);
        txtParams.put("length", this.length);
        txtParams.put("lifecycle", this.lifecycle);
        txtParams.put("lockup_lifecycle", this.lockupLifecycle);
        txtParams.put("name", this.name);
        txtParams.put("net_weight", this.netWeight);
        txtParams.put("origin_address", this.originAddress);
        txtParams.put("pcs", this.pcs);
        txtParams.put("reject_lifecycle", this.rejectLifecycle);
        txtParams.put("size", this.size);
        txtParams.put("specification", this.specification);
        txtParams.put("store_code", this.storeCode);
        txtParams.put("tag_price", this.tagPrice);
        txtParams.put("title", this.title);
        txtParams.put("type", this.type);
        txtParams.put("use_yn", this.useYn);
        txtParams.put("volume", this.volume);
        txtParams.put("width", this.width);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsSkuUpdateResponse> getResponseClass() {
        return WlbWmsSkuUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(this.useYn, "useYn");
    }
}


