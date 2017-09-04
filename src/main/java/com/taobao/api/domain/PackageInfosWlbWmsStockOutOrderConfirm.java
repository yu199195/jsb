package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class PackageInfosWlbWmsStockOutOrderConfirm
        extends TaobaoObject {
    private static final long serialVersionUID = 4171999255743911394L;
    @ApiField("package_code")
    private String packageCode;
    @ApiField("package_height")
    private Long packageHeight;
    @ApiField("package_item_items")
    private PackageItemItemsWlbWmsStockOutOrderConfirm packageItemItems;
    @ApiField("package_length")
    private Long packageLength;
    @ApiField("package_weight")
    private Long packageWeight;
    @ApiField("package_width")
    private Long packageWidth;
    @ApiField("tms_code")
    private String tmsCode;
    @ApiField("tms_order_code")
    private String tmsOrderCode;

    public String getPackageCode() {
        return this.packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public Long getPackageHeight() {
        return this.packageHeight;
    }

    public void setPackageHeight(Long packageHeight) {
        this.packageHeight = packageHeight;
    }

    public PackageItemItemsWlbWmsStockOutOrderConfirm getPackageItemItems() {
        return this.packageItemItems;
    }

    public void setPackageItemItems(PackageItemItemsWlbWmsStockOutOrderConfirm packageItemItems) {
        this.packageItemItems = packageItemItems;
    }

    public Long getPackageLength() {
        return this.packageLength;
    }

    public void setPackageLength(Long packageLength) {
        this.packageLength = packageLength;
    }

    public Long getPackageWeight() {
        return this.packageWeight;
    }

    public void setPackageWeight(Long packageWeight) {
        this.packageWeight = packageWeight;
    }

    public Long getPackageWidth() {
        return this.packageWidth;
    }

    public void setPackageWidth(Long packageWidth) {
        this.packageWidth = packageWidth;
    }

    public String getTmsCode() {
        return this.tmsCode;
    }

    public void setTmsCode(String tmsCode) {
        this.tmsCode = tmsCode;
    }

    public String getTmsOrderCode() {
        return this.tmsOrderCode;
    }

    public void setTmsOrderCode(String tmsOrderCode) {
        this.tmsOrderCode = tmsOrderCode;
    }
}


