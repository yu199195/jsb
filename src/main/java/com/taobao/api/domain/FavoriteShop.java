package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class FavoriteShop
        extends TaobaoObject {
    private static final long serialVersionUID = 3872214795327478454L;
    @ApiField("rate")
    private Long rate;
    @ApiField("seller_id")
    private Long sellerId;
    @ApiField("seller_nick")
    private String sellerNick;
    @ApiField("shop_id")
    private Long shopId;
    @ApiField("shop_name")
    private String shopName;
    @ApiField("shop_pic")
    private String shopPic;
    @ApiField("shop_url")
    private String shopUrl;

    public Long getRate() {
        return this.rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return this.shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopPic() {
        return this.shopPic;
    }

    public void setShopPic(String shopPic) {
        this.shopPic = shopPic;
    }

    public String getShopUrl() {
        return this.shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }
}


