package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class PromotionInShop
        extends TaobaoObject {
    private static final long serialVersionUID = 5372465341344792412L;
    @ApiField("name")
    private String name;
    @ApiField("promotion_detail_desc")
    private String promotionDetailDesc;
    @ApiField("promotion_id")
    private String promotionId;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPromotionDetailDesc() {
        return this.promotionDetailDesc;
    }

    public void setPromotionDetailDesc(String promotionDetailDesc) {
        this.promotionDetailDesc = promotionDetailDesc;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }
}


