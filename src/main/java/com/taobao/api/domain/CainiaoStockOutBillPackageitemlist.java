package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoStockOutBillPackageitemlist
        extends TaobaoObject {
    private static final long serialVersionUID = 4326976346941288493L;
    @ApiField("package_item")
    private CainiaoStockOutBillPackageitem packageItem;

    public CainiaoStockOutBillPackageitem getPackageItem() {
        return this.packageItem;
    }

    public void setPackageItem(CainiaoStockOutBillPackageitem packageItem) {
        this.packageItem = packageItem;
    }
}


