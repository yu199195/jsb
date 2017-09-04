package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class PromotionInItem
        extends TaobaoObject {
    private static final long serialVersionUID = 6639998226236629268L;
    @ApiField("desc")
    private String desc;
    @ApiField("end_time")
    private Date endTime;
    @ApiField("item_promo_price")
    private String itemPromoPrice;
    @ApiField("name")
    private String name;
    @ApiField("other_need")
    private String otherNeed;
    @ApiField("other_send")
    private String otherSend;
    @ApiField("promotion_id")
    private String promotionId;
    @ApiListField("sku_id_list")
    @ApiField("string")
    private List<String> skuIdList;
    @ApiListField("sku_price_list")
    @ApiField("price")
    private List<String> skuPriceList;
    @ApiField("start_time")
    private Date startTime;

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getItemPromoPrice() {
        return this.itemPromoPrice;
    }

    public void setItemPromoPrice(String itemPromoPrice) {
        this.itemPromoPrice = itemPromoPrice;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherNeed() {
        return this.otherNeed;
    }

    public void setOtherNeed(String otherNeed) {
        this.otherNeed = otherNeed;
    }

    public String getOtherSend() {
        return this.otherSend;
    }

    public void setOtherSend(String otherSend) {
        this.otherSend = otherSend;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public List<String> getSkuIdList() {
        return this.skuIdList;
    }

    public void setSkuIdList(List<String> skuIdList) {
        this.skuIdList = skuIdList;
    }

    public List<String> getSkuPriceList() {
        return this.skuPriceList;
    }

    public void setSkuPriceList(List<String> skuPriceList) {
        this.skuPriceList = skuPriceList;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}


