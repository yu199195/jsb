package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WaybillProductType;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbWaybillIProductResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8892356998196642723L;
    @ApiListField("product_types")
    @ApiField("waybill_product_type")
    private List<WaybillProductType> productTypes;

    public void setProductTypes(List<WaybillProductType> productTypes) {
        this.productTypes = productTypes;
    }

    public List<WaybillProductType> getProductTypes() {
        return this.productTypes;
    }
}


