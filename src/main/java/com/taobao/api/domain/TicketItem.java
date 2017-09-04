package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class TicketItem
        extends TaobaoObject {
    private static final long serialVersionUID = 2373878741947585929L;
    @ApiField("auction_point")
    private String auctionPoint;
    @ApiField("auction_status")
    private String auctionStatus;
    @ApiField("cat_id")
    private Long catId;
    @ApiField("check_tool_merchant")
    private String checkToolMerchant;
    @ApiField("city")
    private String city;
    @ApiField("description")
    private String description;
    @ApiField("err_msg")
    private String errMsg;
    @ApiField("etc")
    private TicketEtc etc;
    @ApiField("have_invoice")
    private Boolean haveInvoice;
    @ApiField("image_1")
    private String image1;
    @ApiField("image_2")
    private String image2;
    @ApiField("image_3")
    private String image3;
    @ApiField("image_4")
    private String image4;
    @ApiField("image_5")
    private String image5;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("list_time")
    private String listTime;
    @ApiField("postage_id")
    private Long postageId;
    @ApiField("product_id")
    private Long productId;
    @ApiField("promoted_status")
    private Boolean promotedStatus;
    @ApiField("prov")
    private String prov;
    @ApiField("seller_cs_phone")
    private String sellerCsPhone;
    @ApiField("shop_cats")
    private String shopCats;
    @ApiField("skus")
    private String skus;
    @ApiField("sub_stock_at_buy")
    private Boolean subStockAtBuy;
    @ApiField("title")
    private String title;
    @ApiField("video_id")
    private Long videoId;
    @ApiField("vip_promoted")
    private Boolean vipPromoted;

    public String getAuctionPoint() {
        return this.auctionPoint;
    }

    public void setAuctionPoint(String auctionPoint) {
        this.auctionPoint = auctionPoint;
    }

    public String getAuctionStatus() {
        return this.auctionStatus;
    }

    public void setAuctionStatus(String auctionStatus) {
        this.auctionStatus = auctionStatus;
    }

    public Long getCatId() {
        return this.catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getCheckToolMerchant() {
        return this.checkToolMerchant;
    }

    public void setCheckToolMerchant(String checkToolMerchant) {
        this.checkToolMerchant = checkToolMerchant;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public TicketEtc getEtc() {
        return this.etc;
    }

    public void setEtc(TicketEtc etc) {
        this.etc = etc;
    }

    public Boolean getHaveInvoice() {
        return this.haveInvoice;
    }

    public void setHaveInvoice(Boolean haveInvoice) {
        this.haveInvoice = haveInvoice;
    }

    public String getImage1() {
        return this.image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return this.image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return this.image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return this.image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public String getImage5() {
        return this.image5;
    }

    public void setImage5(String image5) {
        this.image5 = image5;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getListTime() {
        return this.listTime;
    }

    public void setListTime(String listTime) {
        this.listTime = listTime;
    }

    public Long getPostageId() {
        return this.postageId;
    }

    public void setPostageId(Long postageId) {
        this.postageId = postageId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Boolean getPromotedStatus() {
        return this.promotedStatus;
    }

    public void setPromotedStatus(Boolean promotedStatus) {
        this.promotedStatus = promotedStatus;
    }

    public String getProv() {
        return this.prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getSellerCsPhone() {
        return this.sellerCsPhone;
    }

    public void setSellerCsPhone(String sellerCsPhone) {
        this.sellerCsPhone = sellerCsPhone;
    }

    public String getShopCats() {
        return this.shopCats;
    }

    public void setShopCats(String shopCats) {
        this.shopCats = shopCats;
    }

    public String getSkus() {
        return this.skus;
    }

    public void setSkus(String skus) {
        this.skus = skus;
    }

    public Boolean getSubStockAtBuy() {
        return this.subStockAtBuy;
    }

    public void setSubStockAtBuy(Boolean subStockAtBuy) {
        this.subStockAtBuy = subStockAtBuy;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getVideoId() {
        return this.videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public Boolean getVipPromoted() {
        return this.vipPromoted;
    }

    public void setVipPromoted(Boolean vipPromoted) {
        this.vipPromoted = vipPromoted;
    }
}


