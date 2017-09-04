package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class FavoriteItem
        extends TaobaoObject {
    private static final long serialVersionUID = 7165346928585919982L;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("item_name")
    private String itemName;
    @ApiField("item_pictrue")
    private String itemPictrue;
    @ApiField("item_price")
    private String itemPrice;
    @ApiField("item_url")
    private String itemUrl;
    @ApiField("promotion_price")
    private String promotionPrice;
    @ApiField("sell_count")
    private Long sellCount;
    @ApiField("track_iid")
    private String trackIid;

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPictrue() {
        return this.itemPictrue;
    }

    public void setItemPictrue(String itemPictrue) {
        this.itemPictrue = itemPictrue;
    }

    public String getItemPrice() {
        return this.itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemUrl() {
        return this.itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public String getPromotionPrice() {
        return this.promotionPrice;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Long getSellCount() {
        return this.sellCount;
    }

    public void setSellCount(Long sellCount) {
        this.sellCount = sellCount;
    }

    public String getTrackIid() {
        return this.trackIid;
    }

    public void setTrackIid(String trackIid) {
        this.trackIid = trackIid;
    }
}


