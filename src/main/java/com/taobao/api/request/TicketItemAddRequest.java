package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TicketItemAddResponse;

import java.util.Map;

public class TicketItemAddRequest
        extends BaseTaobaoRequest<TicketItemAddResponse> {
    private String auctionPoint;
    private String auctionStatus;
    private String checkToolMerchant;
    private String city;
    private String description;
    private Boolean etcAssociationStatus;
    private Long etcAutoRefund;
    private String etcMerchantId;
    private String etcMerchantNick;
    private String etcNetworkId;
    private Long etcOverduePay;
    private Boolean etcVerificationPay;
    private Boolean haveInvoice;
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private String image5;
    private String listTime;
    private Long postageId;
    private Long productId;
    private Boolean promotedStatus;
    private String prov;
    private String sellerCsPhone;
    private String shopCats;
    private String skus;
    private Boolean subStockAtBuy;
    private String title;
    private Long videoId;
    private Boolean vipPromoted;

    public void setAuctionPoint(String auctionPoint) {
        this.auctionPoint = auctionPoint;
    }

    public String getAuctionPoint() {
        return this.auctionPoint;
    }

    public void setAuctionStatus(String auctionStatus) {
        this.auctionStatus = auctionStatus;
    }

    public String getAuctionStatus() {
        return this.auctionStatus;
    }

    public void setCheckToolMerchant(String checkToolMerchant) {
        this.checkToolMerchant = checkToolMerchant;
    }

    public String getCheckToolMerchant() {
        return this.checkToolMerchant;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setEtcAssociationStatus(Boolean etcAssociationStatus) {
        this.etcAssociationStatus = etcAssociationStatus;
    }

    public Boolean getEtcAssociationStatus() {
        return this.etcAssociationStatus;
    }

    public void setEtcAutoRefund(Long etcAutoRefund) {
        this.etcAutoRefund = etcAutoRefund;
    }

    public Long getEtcAutoRefund() {
        return this.etcAutoRefund;
    }

    public void setEtcMerchantId(String etcMerchantId) {
        this.etcMerchantId = etcMerchantId;
    }

    public String getEtcMerchantId() {
        return this.etcMerchantId;
    }

    public void setEtcMerchantNick(String etcMerchantNick) {
        this.etcMerchantNick = etcMerchantNick;
    }

    public String getEtcMerchantNick() {
        return this.etcMerchantNick;
    }

    public void setEtcNetworkId(String etcNetworkId) {
        this.etcNetworkId = etcNetworkId;
    }

    public String getEtcNetworkId() {
        return this.etcNetworkId;
    }

    public void setEtcOverduePay(Long etcOverduePay) {
        this.etcOverduePay = etcOverduePay;
    }

    public Long getEtcOverduePay() {
        return this.etcOverduePay;
    }

    public void setEtcVerificationPay(Boolean etcVerificationPay) {
        this.etcVerificationPay = etcVerificationPay;
    }

    public Boolean getEtcVerificationPay() {
        return this.etcVerificationPay;
    }

    public void setHaveInvoice(Boolean haveInvoice) {
        this.haveInvoice = haveInvoice;
    }

    public Boolean getHaveInvoice() {
        return this.haveInvoice;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage1() {
        return this.image1;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage2() {
        return this.image2;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage3() {
        return this.image3;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public String getImage4() {
        return this.image4;
    }

    public void setImage5(String image5) {
        this.image5 = image5;
    }

    public String getImage5() {
        return this.image5;
    }

    public void setListTime(String listTime) {
        this.listTime = listTime;
    }

    public String getListTime() {
        return this.listTime;
    }

    public void setPostageId(Long postageId) {
        this.postageId = postageId;
    }

    public Long getPostageId() {
        return this.postageId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setPromotedStatus(Boolean promotedStatus) {
        this.promotedStatus = promotedStatus;
    }

    public Boolean getPromotedStatus() {
        return this.promotedStatus;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getProv() {
        return this.prov;
    }

    public void setSellerCsPhone(String sellerCsPhone) {
        this.sellerCsPhone = sellerCsPhone;
    }

    public String getSellerCsPhone() {
        return this.sellerCsPhone;
    }

    public void setShopCats(String shopCats) {
        this.shopCats = shopCats;
    }

    public String getShopCats() {
        return this.shopCats;
    }

    public void setSkus(String skus) {
        this.skus = skus;
    }

    public String getSkus() {
        return this.skus;
    }

    public void setSubStockAtBuy(Boolean subStockAtBuy) {
        this.subStockAtBuy = subStockAtBuy;
    }

    public Boolean getSubStockAtBuy() {
        return this.subStockAtBuy;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public Long getVideoId() {
        return this.videoId;
    }

    public void setVipPromoted(Boolean vipPromoted) {
        this.vipPromoted = vipPromoted;
    }

    public Boolean getVipPromoted() {
        return this.vipPromoted;
    }

    public String getApiMethodName() {
        return "taobao.ticket.item.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auction_point", this.auctionPoint);
        txtParams.put("auction_status", this.auctionStatus);
        txtParams.put("check_tool_merchant", this.checkToolMerchant);
        txtParams.put("city", this.city);
        txtParams.put("description", this.description);
        txtParams.put("etc.association_status", this.etcAssociationStatus);
        txtParams.put("etc.auto_refund", this.etcAutoRefund);
        txtParams.put("etc.merchant_id", this.etcMerchantId);
        txtParams.put("etc.merchant_nick", this.etcMerchantNick);
        txtParams.put("etc.network_id", this.etcNetworkId);
        txtParams.put("etc.overdue_pay", this.etcOverduePay);
        txtParams.put("etc.verification_pay", this.etcVerificationPay);
        txtParams.put("have_invoice", this.haveInvoice);
        txtParams.put("image_1", this.image1);
        txtParams.put("image_2", this.image2);
        txtParams.put("image_3", this.image3);
        txtParams.put("image_4", this.image4);
        txtParams.put("image_5", this.image5);
        txtParams.put("list_time", this.listTime);
        txtParams.put("postage_id", this.postageId);
        txtParams.put("product_id", this.productId);
        txtParams.put("promoted_status", this.promotedStatus);
        txtParams.put("prov", this.prov);
        txtParams.put("seller_cs_phone", this.sellerCsPhone);
        txtParams.put("shop_cats", this.shopCats);
        txtParams.put("skus", this.skus);
        txtParams.put("sub_stock_at_buy", this.subStockAtBuy);
        txtParams.put("title", this.title);
        txtParams.put("video_id", this.videoId);
        txtParams.put("vip_promoted", this.vipPromoted);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TicketItemAddResponse> getResponseClass() {
        return TicketItemAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.auctionStatus, "auctionStatus");
        RequestCheckUtils.checkMaxLength(this.auctionStatus, 10, "auctionStatus");
        RequestCheckUtils.checkNotEmpty(this.checkToolMerchant, "checkToolMerchant");
        RequestCheckUtils.checkNotEmpty(this.city, "city");
        RequestCheckUtils.checkMaxLength(this.city, 20, "city");
        RequestCheckUtils.checkNotEmpty(this.description, "description");
        RequestCheckUtils.checkMaxLength(this.description, 25000, "description");
        RequestCheckUtils.checkMaxValue(this.etcAutoRefund, 100L, "etcAutoRefund");
        RequestCheckUtils.checkMinValue(this.etcAutoRefund, 0L, "etcAutoRefund");
        RequestCheckUtils.checkMaxValue(this.etcOverduePay, 100L, "etcOverduePay");
        RequestCheckUtils.checkMinValue(this.etcOverduePay, 0L, "etcOverduePay");
        RequestCheckUtils.checkNotEmpty(this.image1, "image1");
        RequestCheckUtils.checkMaxLength(this.listTime, 20, "listTime");
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
        RequestCheckUtils.checkNotEmpty(this.prov, "prov");
        RequestCheckUtils.checkMaxLength(this.prov, 20, "prov");
        RequestCheckUtils.checkNotEmpty(this.sellerCsPhone, "sellerCsPhone");
        RequestCheckUtils.checkNotEmpty(this.skus, "skus");
        RequestCheckUtils.checkNotEmpty(this.subStockAtBuy, "subStockAtBuy");
        RequestCheckUtils.checkNotEmpty(this.title, "title");
        RequestCheckUtils.checkMaxLength(this.title, 60, "title");
    }
}


