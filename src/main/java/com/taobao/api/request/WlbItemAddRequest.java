package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemAddResponse;

import java.util.Map;

public class WlbItemAddRequest
        extends BaseTaobaoRequest<WlbItemAddResponse> {
    private String color;
    private String goodsCat;
    private Long height;
    private Boolean isDangerous;
    private Boolean isFriable;
    private String isSku;
    private String itemCode;
    private Long length;
    private String name;
    private String packageMaterial;
    private Long price;
    private String pricingCat;
    private String proNameList;
    private String proValueList;
    private String remark;
    private Boolean supportBatch;
    private String title;
    private String type;
    private Long volume;
    private Long weight;
    private Long width;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setGoodsCat(String goodsCat) {
        this.goodsCat = goodsCat;
    }

    public String getGoodsCat() {
        return this.goodsCat;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getHeight() {
        return this.height;
    }

    public void setIsDangerous(Boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public Boolean getIsDangerous() {
        return this.isDangerous;
    }

    public void setIsFriable(Boolean isFriable) {
        this.isFriable = isFriable;
    }

    public Boolean getIsFriable() {
        return this.isFriable;
    }

    public void setIsSku(String isSku) {
        this.isSku = isSku;
    }

    public String getIsSku() {
        return this.isSku;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getLength() {
        return this.length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPackageMaterial(String packageMaterial) {
        this.packageMaterial = packageMaterial;
    }

    public String getPackageMaterial() {
        return this.packageMaterial;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPricingCat(String pricingCat) {
        this.pricingCat = pricingCat;
    }

    public String getPricingCat() {
        return this.pricingCat;
    }

    public void setProNameList(String proNameList) {
        this.proNameList = proNameList;
    }

    public String getProNameList() {
        return this.proNameList;
    }

    public void setProValueList(String proValueList) {
        this.proValueList = proValueList;
    }

    public String getProValueList() {
        return this.proValueList;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setSupportBatch(Boolean supportBatch) {
        this.supportBatch = supportBatch;
    }

    public Boolean getSupportBatch() {
        return this.supportBatch;
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

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getVolume() {
        return this.volume;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getWeight() {
        return this.weight;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getWidth() {
        return this.width;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("color", this.color);
        txtParams.put("goods_cat", this.goodsCat);
        txtParams.put("height", this.height);
        txtParams.put("is_dangerous", this.isDangerous);
        txtParams.put("is_friable", this.isFriable);
        txtParams.put("is_sku", this.isSku);
        txtParams.put("item_code", this.itemCode);
        txtParams.put("length", this.length);
        txtParams.put("name", this.name);
        txtParams.put("package_material", this.packageMaterial);
        txtParams.put("price", this.price);
        txtParams.put("pricing_cat", this.pricingCat);
        txtParams.put("pro_name_list", this.proNameList);
        txtParams.put("pro_value_list", this.proValueList);
        txtParams.put("remark", this.remark);
        txtParams.put("support_batch", this.supportBatch);
        txtParams.put("title", this.title);
        txtParams.put("type", this.type);
        txtParams.put("volume", this.volume);
        txtParams.put("weight", this.weight);
        txtParams.put("width", this.width);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbItemAddResponse> getResponseClass() {
        return WlbItemAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.isSku, "isSku");
        RequestCheckUtils.checkNotEmpty(this.itemCode, "itemCode");
        RequestCheckUtils.checkNotEmpty(this.name, "name");
    }
}


