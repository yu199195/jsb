package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class PromotionDetail
        extends TaobaoObject {
    private static final long serialVersionUID = 3455784192466832795L;
    @ApiField("discount_fee")
    private String discountFee;
    @ApiField("gift_item_id")
    private String giftItemId;
    @ApiField("gift_item_name")
    private String giftItemName;
    @ApiField("gift_item_num")
    private String giftItemNum;
    @ApiField("id")
    private Long id;
    @ApiField("promotion_desc")
    private String promotionDesc;
    @ApiField("promotion_id")
    private String promotionId;
    @ApiField("promotion_name")
    private String promotionName;

    public String getDiscountFee() {
        return this.discountFee;
    }

    public void setDiscountFee(String discountFee) {
        this.discountFee = discountFee;
    }

    public String getGiftItemId() {
        return this.giftItemId;
    }

    public void setGiftItemId(String giftItemId) {
        this.giftItemId = giftItemId;
    }

    public String getGiftItemName() {
        return this.giftItemName;
    }

    public void setGiftItemName(String giftItemName) {
        this.giftItemName = giftItemName;
    }

    public String getGiftItemNum() {
        return this.giftItemNum;
    }

    public void setGiftItemNum(String giftItemNum) {
        this.giftItemNum = giftItemNum;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPromotionDesc() {
        return this.promotionDesc;
    }

    public void setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionName() {
        return this.promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }
}


