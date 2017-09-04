package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SellerAuthorize;
import com.taobao.api.internal.mapping.ApiField;

public class ItemcatsAuthorizeGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5534981997115682333L;
    @ApiField("seller_authorize")
    private SellerAuthorize sellerAuthorize;

    public void setSellerAuthorize(SellerAuthorize sellerAuthorize) {
        this.sellerAuthorize = sellerAuthorize;
    }

    public SellerAuthorize getSellerAuthorize() {
        return this.sellerAuthorize;
    }
}


