package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LimitDiscountDetail;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class PromotionLimitdiscountDetailGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3634794788732832495L;
    @ApiListField("item_discount_detail_list")
    @ApiField("limit_discount_detail")
    private List<LimitDiscountDetail> itemDiscountDetailList;

    public void setItemDiscountDetailList(List<LimitDiscountDetail> itemDiscountDetailList) {
        this.itemDiscountDetailList = itemDiscountDetailList;
    }

    public List<LimitDiscountDetail> getItemDiscountDetailList() {
        return this.itemDiscountDetailList;
    }
}


