package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class CainiaoStockOutBillPackageinfo
        extends TaobaoObject {
    private static final long serialVersionUID = 8275862385661228661L;
    @ApiField("package_code")
    private String packageCode;
    @ApiField("package_height")
    private Long packageHeight;
    @ApiListField("package_item_list")
    @ApiField("cainiao_stock_out_bill_packageitemlist")
    private List<CainiaoStockOutBillPackageitemlist> packageItemList;
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

    public List<CainiaoStockOutBillPackageitemlist> getPackageItemList() {
        return this.packageItemList;
    }

    public void setPackageItemList(List<CainiaoStockOutBillPackageitemlist> packageItemList) {
        this.packageItemList = packageItemList;
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


