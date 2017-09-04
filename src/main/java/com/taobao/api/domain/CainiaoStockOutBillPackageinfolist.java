package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoStockOutBillPackageinfolist
        extends TaobaoObject {
    private static final long serialVersionUID = 1298112124795629668L;
    @ApiField("package_info")
    private CainiaoStockOutBillPackageinfo packageInfo;

    public CainiaoStockOutBillPackageinfo getPackageInfo() {
        return this.packageInfo;
    }

    public void setPackageInfo(CainiaoStockOutBillPackageinfo packageInfo) {
        this.packageInfo = packageInfo;
    }
}


