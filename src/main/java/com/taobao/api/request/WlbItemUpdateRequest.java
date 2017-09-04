package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemUpdateResponse;

import java.util.Map;

public class WlbItemUpdateRequest
        extends BaseTaobaoRequest<WlbItemUpdateResponse> {
    private String color;
    private String deletePropertyKeyList;
    private String goodsCat;
    private Long height;
    private Long id;
    private Boolean isDangerous;
    private Boolean isFriable;
    private Long length;
    private String name;
    private String packageMaterial;
    private String pricingCat;
    private String remark;
    private String title;
    private String updatePropertyKeyList;
    private String updatePropertyValueList;
    private Long volume;
    private Long weight;
    private Long width;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setDeletePropertyKeyList(String deletePropertyKeyList) {
        this.deletePropertyKeyList = deletePropertyKeyList;
    }

    public String getDeletePropertyKeyList() {
        return this.deletePropertyKeyList;
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
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

    public void setPricingCat(String pricingCat) {
        this.pricingCat = pricingCat;
    }

    public String getPricingCat() {
        return this.pricingCat;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setUpdatePropertyKeyList(String updatePropertyKeyList) {
        this.updatePropertyKeyList = updatePropertyKeyList;
    }

    public String getUpdatePropertyKeyList() {
        return this.updatePropertyKeyList;
    }

    public void setUpdatePropertyValueList(String updatePropertyValueList) {
        this.updatePropertyValueList = updatePropertyValueList;
    }

    public String getUpdatePropertyValueList() {
        return this.updatePropertyValueList;
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
        return "taobao.wlb.item.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("color", this.color);
        txtParams.put("delete_property_key_list", this.deletePropertyKeyList);
        txtParams.put("goods_cat", this.goodsCat);
        txtParams.put("height", this.height);
        txtParams.put("id", this.id);
        txtParams.put("is_dangerous", this.isDangerous);
        txtParams.put("is_friable", this.isFriable);
        txtParams.put("length", this.length);
        txtParams.put("name", this.name);
        txtParams.put("package_material", this.packageMaterial);
        txtParams.put("pricing_cat", this.pricingCat);
        txtParams.put("remark", this.remark);
        txtParams.put("title", this.title);
        txtParams.put("update_property_key_list", this.updatePropertyKeyList);
        txtParams.put("update_property_value_list", this.updatePropertyValueList);
        txtParams.put("volume", this.volume);
        txtParams.put("weight", this.weight);
        txtParams.put("width", this.width);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbItemUpdateResponse> getResponseClass() {
        return WlbItemUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.id, "id");
    }
}


