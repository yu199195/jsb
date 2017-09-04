package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class Trade
        extends TaobaoObject {
    private static final long serialVersionUID = 3349325883261114774L;
    @ApiField("acookie_id")
    private String acookieId;
    @ApiField("adjust_fee")
    private String adjustFee;
    @ApiField("alipay_id")
    private Long alipayId;
    @ApiField("alipay_no")
    private String alipayNo;
    @ApiField("alipay_point")
    private Long alipayPoint;
    @ApiField("alipay_url")
    private String alipayUrl;
    @ApiField("alipay_warn_msg")
    private String alipayWarnMsg;
    @ApiField("area_id")
    private String areaId;
    @ApiField("arrive_cut_time")
    private String arriveCutTime;
    @ApiField("arrive_interval")
    private Long arriveInterval;
    @ApiField("async_modified")
    private Date asyncModified;
    @ApiField("available_confirm_fee")
    private String availableConfirmFee;
    @ApiField("buyer_alipay_no")
    private String buyerAlipayNo;
    @ApiField("buyer_area")
    private String buyerArea;
    @ApiField("buyer_cod_fee")
    private String buyerCodFee;
    @ApiField("buyer_email")
    private String buyerEmail;
    @ApiField("buyer_flag")
    private Long buyerFlag;
    @ApiField("buyer_ip")
    private String buyerIp;
    @ApiField("buyer_memo")
    private String buyerMemo;
    @ApiField("buyer_message")
    private String buyerMessage;
    @ApiField("buyer_nick")
    private String buyerNick;
    @ApiField("buyer_obtain_point_fee")
    private Long buyerObtainPointFee;
    @ApiField("buyer_rate")
    private Boolean buyerRate;
    @ApiField("can_rate")
    private Boolean canRate;
    @ApiField("cod_fee")
    private String codFee;
    @ApiField("cod_status")
    private String codStatus;
    @ApiField("commission_fee")
    private String commissionFee;
    @ApiField("consign_interval")
    private Long consignInterval;
    @ApiField("consign_time")
    private Date consignTime;
    @ApiField("coupon_fee")
    private Long couponFee;
    @ApiField("created")
    private Date created;
    @ApiField("credit_card_fee")
    private String creditCardFee;
    @ApiField("cross_bonded_declare")
    private Boolean crossBondedDeclare;
    @ApiField("discount_fee")
    private String discountFee;
    @ApiField("end_time")
    private Date endTime;
    @ApiField("es_date")
    private String esDate;
    @ApiField("es_range")
    private String esRange;
    @ApiField("est_con_time")
    private String estConTime;
    @ApiField("et_plate_number")
    private String etPlateNumber;
    @ApiField("et_ser_time")
    private String etSerTime;
    @ApiField("et_shop_id")
    private Long etShopId;
    @ApiField("et_shop_name")
    private String etShopName;
    @ApiField("et_type")
    private String etType;
    @ApiField("et_verified_shop_name")
    private String etVerifiedShopName;
    @ApiField("eticket_ext")
    private String eticketExt;
    @ApiField("eticket_service_addr")
    private String eticketServiceAddr;
    @ApiField("express_agency_fee")
    private String expressAgencyFee;
    @ApiField("has_buyer_message")
    private Boolean hasBuyerMessage;
    @ApiField("has_post_fee")
    private Boolean hasPostFee;
    @ApiField("has_yfx")
    private Boolean hasYfx;
    @ApiField("hk_birthday")
    private String hkBirthday;
    @ApiField("hk_card_code")
    private String hkCardCode;
    @ApiField("hk_card_type")
    private String hkCardType;
    @ApiField("hk_china_name")
    private String hkChinaName;
    @ApiField("hk_en_name")
    private String hkEnName;
    @ApiField("hk_flight_date")
    private String hkFlightDate;
    @ApiField("hk_flight_no")
    private String hkFlightNo;
    @ApiField("hk_gender")
    private String hkGender;
    @ApiField("hk_pickup")
    private String hkPickup;
    @ApiField("hk_pickup_id")
    private String hkPickupId;
    @ApiField("iid")
    private String iid;
    @ApiField("invoice_kind")
    private String invoiceKind;
    @ApiField("invoice_name")
    private String invoiceName;
    @ApiField("invoice_type")
    private String invoiceType;
    @ApiField("is_3D")
    private Boolean is3D;
    @ApiField("is_brand_sale")
    private Boolean isBrandSale;
    @ApiField("is_daixiao")
    private Boolean isDaixiao;
    @ApiField("is_force_wlb")
    private Boolean isForceWlb;
    @ApiField("is_lgtype")
    private Boolean isLgtype;
    @ApiField("is_part_consign")
    private Boolean isPartConsign;
    @ApiField("is_sh_ship")
    private Boolean isShShip;
    @ApiField("is_wt")
    private Boolean isWt;
    @ApiField("lg_aging")
    private String lgAging;
    @ApiField("lg_aging_type")
    private String lgAgingType;
    @ApiField("mark_desc")
    private String markDesc;
    @ApiField("market")
    private String market;
    @ApiField("modified")
    private Date modified;
    @ApiField("num")
    private Long num;
    @ApiField("num_iid")
    private Long numIid;
    @ApiField("nut_feature")
    private String nutFeature;
    @ApiField("o2o")
    private String o2o;
    @ApiField("o2o_delivery")
    private String o2oDelivery;
    @ApiField("o2o_et_order_id")
    private String o2oEtOrderId;
    @ApiField("o2o_guide_id")
    private String o2oGuideId;
    @ApiField("o2o_guide_name")
    private String o2oGuideName;
    @ApiField("o2o_out_trade_id")
    private String o2oOutTradeId;
    @ApiField("o2o_shop_id")
    private String o2oShopId;
    @ApiField("o2o_shop_name")
    private String o2oShopName;
    @ApiField("o2o_snatch_status")
    private String o2oSnatchStatus;
    @ApiField("obs")
    private String obs;
    @ApiField("omnichannel_param")
    private String omnichannelParam;
    @ApiField("order_tax_fee")
    private String orderTaxFee;
    @ApiListField("orders")
    @ApiField("order")
    private List<Order> orders;
    @ApiField("os_date")
    private String osDate;
    @ApiField("os_range")
    private String osRange;
    @ApiField("paid_coupon_fee")
    private String paidCouponFee;
    @ApiField("pay_time")
    private Date payTime;
    @ApiField("payment")
    private String payment;
    @ApiField("pcc_af")
    private Long pccAf;
    @ApiField("pic_path")
    private String picPath;
    @ApiField("point_fee")
    private Long pointFee;
    @ApiField("post_fee")
    private String postFee;
    @ApiField("post_gate_declare")
    private Boolean postGateDeclare;
    @ApiField("price")
    private String price;
    @ApiField("promotion")
    private String promotion;
    @ApiListField("promotion_details")
    @ApiField("promotion_detail")
    private List<PromotionDetail> promotionDetails;
    @ApiField("real_point_fee")
    private Long realPointFee;
    @ApiField("received_payment")
    private String receivedPayment;
    @ApiField("receiver_address")
    private String receiverAddress;
    @ApiField("receiver_city")
    private String receiverCity;
    @ApiField("receiver_country")
    private String receiverCountry;
    @ApiField("receiver_district")
    private String receiverDistrict;
    @ApiField("receiver_mobile")
    private String receiverMobile;
    @ApiField("receiver_name")
    private String receiverName;
    @ApiField("receiver_phone")
    private String receiverPhone;
    @ApiField("receiver_state")
    private String receiverState;
    @ApiField("receiver_town")
    private String receiverTown;
    @ApiField("receiver_zip")
    private String receiverZip;
    @ApiField("rx_audit_status")
    private String rxAuditStatus;
    @ApiField("seller_alipay_no")
    private String sellerAlipayNo;
    @ApiField("seller_can_rate")
    private Boolean sellerCanRate;
    @ApiField("seller_cod_fee")
    private String sellerCodFee;
    @ApiField("seller_email")
    private String sellerEmail;
    @ApiField("seller_flag")
    private Long sellerFlag;
    @ApiField("seller_memo")
    private String sellerMemo;
    @ApiField("seller_mobile")
    private String sellerMobile;
    @ApiField("seller_name")
    private String sellerName;
    @ApiField("seller_nick")
    private String sellerNick;
    @ApiField("seller_phone")
    private String sellerPhone;
    @ApiField("seller_rate")
    private Boolean sellerRate;
    @ApiField("send_time")
    private String sendTime;
    @ApiListField("service_orders")
    @ApiField("service_order")
    private List<ServiceOrder> serviceOrders;
    @ApiListField("service_tags")
    @ApiField("logistics_tag")
    private List<LogisticsTag> serviceTags;
    @ApiField("shipping_type")
    private String shippingType;
    @ApiField("shop_code")
    private String shopCode;
    @ApiField("shop_pick")
    private String shopPick;
    @ApiField("sid")
    private String sid;
    @ApiField("snapshot")
    private String snapshot;
    @ApiField("snapshot_url")
    private String snapshotUrl;
    @ApiField("status")
    private String status;
    @ApiField("step_paid_fee")
    private String stepPaidFee;
    @ApiField("step_trade_status")
    private String stepTradeStatus;
    @ApiField("tid")
    private Long tid;
    @ApiField("timeout_action_time")
    private Date timeoutActionTime;
    @ApiField("title")
    private String title;
    @ApiField("total_fee")
    private String totalFee;
    @ApiField("trade_attr")
    private String tradeAttr;
    @ApiField("trade_ext")
    private TradeExt tradeExt;
    @ApiField("trade_from")
    private String tradeFrom;
    @ApiField("trade_memo")
    private String tradeMemo;
    @ApiField("trade_source")
    private String tradeSource;
    @ApiField("type")
    private String type;
    @ApiField("yfx_fee")
    private String yfxFee;
    @ApiField("yfx_id")
    private String yfxId;
    @ApiField("yfx_type")
    private String yfxType;
    @ApiField("zero_purchase")
    private Boolean zeroPurchase;

    public String getAcookieId() {
        return this.acookieId;
    }

    public void setAcookieId(String acookieId) {
        this.acookieId = acookieId;
    }

    public String getAdjustFee() {
        return this.adjustFee;
    }

    public void setAdjustFee(String adjustFee) {
        this.adjustFee = adjustFee;
    }

    public Long getAlipayId() {
        return this.alipayId;
    }

    public void setAlipayId(Long alipayId) {
        this.alipayId = alipayId;
    }

    public String getAlipayNo() {
        return this.alipayNo;
    }

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
    }

    public Long getAlipayPoint() {
        return this.alipayPoint;
    }

    public void setAlipayPoint(Long alipayPoint) {
        this.alipayPoint = alipayPoint;
    }

    public String getAlipayUrl() {
        return this.alipayUrl;
    }

    public void setAlipayUrl(String alipayUrl) {
        this.alipayUrl = alipayUrl;
    }

    public String getAlipayWarnMsg() {
        return this.alipayWarnMsg;
    }

    public void setAlipayWarnMsg(String alipayWarnMsg) {
        this.alipayWarnMsg = alipayWarnMsg;
    }

    public String getAreaId() {
        return this.areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getArriveCutTime() {
        return this.arriveCutTime;
    }

    public void setArriveCutTime(String arriveCutTime) {
        this.arriveCutTime = arriveCutTime;
    }

    public Long getArriveInterval() {
        return this.arriveInterval;
    }

    public void setArriveInterval(Long arriveInterval) {
        this.arriveInterval = arriveInterval;
    }

    public Date getAsyncModified() {
        return this.asyncModified;
    }

    public void setAsyncModified(Date asyncModified) {
        this.asyncModified = asyncModified;
    }

    public String getAvailableConfirmFee() {
        return this.availableConfirmFee;
    }

    public void setAvailableConfirmFee(String availableConfirmFee) {
        this.availableConfirmFee = availableConfirmFee;
    }

    public String getBuyerAlipayNo() {
        return this.buyerAlipayNo;
    }

    public void setBuyerAlipayNo(String buyerAlipayNo) {
        this.buyerAlipayNo = buyerAlipayNo;
    }

    public String getBuyerArea() {
        return this.buyerArea;
    }

    public void setBuyerArea(String buyerArea) {
        this.buyerArea = buyerArea;
    }

    public String getBuyerCodFee() {
        return this.buyerCodFee;
    }

    public void setBuyerCodFee(String buyerCodFee) {
        this.buyerCodFee = buyerCodFee;
    }

    public String getBuyerEmail() {
        return this.buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public Long getBuyerFlag() {
        return this.buyerFlag;
    }

    public void setBuyerFlag(Long buyerFlag) {
        this.buyerFlag = buyerFlag;
    }

    public String getBuyerIp() {
        return this.buyerIp;
    }

    public void setBuyerIp(String buyerIp) {
        this.buyerIp = buyerIp;
    }

    public String getBuyerMemo() {
        return this.buyerMemo;
    }

    public void setBuyerMemo(String buyerMemo) {
        this.buyerMemo = buyerMemo;
    }

    public String getBuyerMessage() {
        return this.buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public Long getBuyerObtainPointFee() {
        return this.buyerObtainPointFee;
    }

    public void setBuyerObtainPointFee(Long buyerObtainPointFee) {
        this.buyerObtainPointFee = buyerObtainPointFee;
    }

    public Boolean getBuyerRate() {
        return this.buyerRate;
    }

    public void setBuyerRate(Boolean buyerRate) {
        this.buyerRate = buyerRate;
    }

    public Boolean getCanRate() {
        return this.canRate;
    }

    public void setCanRate(Boolean canRate) {
        this.canRate = canRate;
    }

    public String getCodFee() {
        return this.codFee;
    }

    public void setCodFee(String codFee) {
        this.codFee = codFee;
    }

    public String getCodStatus() {
        return this.codStatus;
    }

    public void setCodStatus(String codStatus) {
        this.codStatus = codStatus;
    }

    public String getCommissionFee() {
        return this.commissionFee;
    }

    public void setCommissionFee(String commissionFee) {
        this.commissionFee = commissionFee;
    }

    public Long getConsignInterval() {
        return this.consignInterval;
    }

    public void setConsignInterval(Long consignInterval) {
        this.consignInterval = consignInterval;
    }

    public Date getConsignTime() {
        return this.consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Long getCouponFee() {
        return this.couponFee;
    }

    public void setCouponFee(Long couponFee) {
        this.couponFee = couponFee;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreditCardFee() {
        return this.creditCardFee;
    }

    public void setCreditCardFee(String creditCardFee) {
        this.creditCardFee = creditCardFee;
    }

    public Boolean getCrossBondedDeclare() {
        return this.crossBondedDeclare;
    }

    public void setCrossBondedDeclare(Boolean crossBondedDeclare) {
        this.crossBondedDeclare = crossBondedDeclare;
    }

    public String getDiscountFee() {
        return this.discountFee;
    }

    public void setDiscountFee(String discountFee) {
        this.discountFee = discountFee;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getEsDate() {
        return this.esDate;
    }

    public void setEsDate(String esDate) {
        this.esDate = esDate;
    }

    public String getEsRange() {
        return this.esRange;
    }

    public void setEsRange(String esRange) {
        this.esRange = esRange;
    }

    public String getEstConTime() {
        return this.estConTime;
    }

    public void setEstConTime(String estConTime) {
        this.estConTime = estConTime;
    }

    public String getEtPlateNumber() {
        return this.etPlateNumber;
    }

    public void setEtPlateNumber(String etPlateNumber) {
        this.etPlateNumber = etPlateNumber;
    }

    public String getEtSerTime() {
        return this.etSerTime;
    }

    public void setEtSerTime(String etSerTime) {
        this.etSerTime = etSerTime;
    }

    public Long getEtShopId() {
        return this.etShopId;
    }

    public void setEtShopId(Long etShopId) {
        this.etShopId = etShopId;
    }

    public String getEtShopName() {
        return this.etShopName;
    }

    public void setEtShopName(String etShopName) {
        this.etShopName = etShopName;
    }

    public String getEtType() {
        return this.etType;
    }

    public void setEtType(String etType) {
        this.etType = etType;
    }

    public String getEtVerifiedShopName() {
        return this.etVerifiedShopName;
    }

    public void setEtVerifiedShopName(String etVerifiedShopName) {
        this.etVerifiedShopName = etVerifiedShopName;
    }

    public String getEticketExt() {
        return this.eticketExt;
    }

    public void setEticketExt(String eticketExt) {
        this.eticketExt = eticketExt;
    }

    public String getEticketServiceAddr() {
        return this.eticketServiceAddr;
    }

    public void setEticketServiceAddr(String eticketServiceAddr) {
        this.eticketServiceAddr = eticketServiceAddr;
    }

    public String getExpressAgencyFee() {
        return this.expressAgencyFee;
    }

    public void setExpressAgencyFee(String expressAgencyFee) {
        this.expressAgencyFee = expressAgencyFee;
    }

    public Boolean getHasBuyerMessage() {
        return this.hasBuyerMessage;
    }

    public void setHasBuyerMessage(Boolean hasBuyerMessage) {
        this.hasBuyerMessage = hasBuyerMessage;
    }

    public Boolean getHasPostFee() {
        return this.hasPostFee;
    }

    public void setHasPostFee(Boolean hasPostFee) {
        this.hasPostFee = hasPostFee;
    }

    public Boolean getHasYfx() {
        return this.hasYfx;
    }

    public void setHasYfx(Boolean hasYfx) {
        this.hasYfx = hasYfx;
    }

    public String getHkBirthday() {
        return this.hkBirthday;
    }

    public void setHkBirthday(String hkBirthday) {
        this.hkBirthday = hkBirthday;
    }

    public String getHkCardCode() {
        return this.hkCardCode;
    }

    public void setHkCardCode(String hkCardCode) {
        this.hkCardCode = hkCardCode;
    }

    public String getHkCardType() {
        return this.hkCardType;
    }

    public void setHkCardType(String hkCardType) {
        this.hkCardType = hkCardType;
    }

    public String getHkChinaName() {
        return this.hkChinaName;
    }

    public void setHkChinaName(String hkChinaName) {
        this.hkChinaName = hkChinaName;
    }

    public String getHkEnName() {
        return this.hkEnName;
    }

    public void setHkEnName(String hkEnName) {
        this.hkEnName = hkEnName;
    }

    public String getHkFlightDate() {
        return this.hkFlightDate;
    }

    public void setHkFlightDate(String hkFlightDate) {
        this.hkFlightDate = hkFlightDate;
    }

    public String getHkFlightNo() {
        return this.hkFlightNo;
    }

    public void setHkFlightNo(String hkFlightNo) {
        this.hkFlightNo = hkFlightNo;
    }

    public String getHkGender() {
        return this.hkGender;
    }

    public void setHkGender(String hkGender) {
        this.hkGender = hkGender;
    }

    public String getHkPickup() {
        return this.hkPickup;
    }

    public void setHkPickup(String hkPickup) {
        this.hkPickup = hkPickup;
    }

    public String getHkPickupId() {
        return this.hkPickupId;
    }

    public void setHkPickupId(String hkPickupId) {
        this.hkPickupId = hkPickupId;
    }

    public String getIid() {
        return this.iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public String getInvoiceKind() {
        return this.invoiceKind;
    }

    public void setInvoiceKind(String invoiceKind) {
        this.invoiceKind = invoiceKind;
    }

    public String getInvoiceName() {
        return this.invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public String getInvoiceType() {
        return this.invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Boolean getIs3D() {
        return this.is3D;
    }

    public void setIs3D(Boolean is3D) {
        this.is3D = is3D;
    }

    public Boolean getIsBrandSale() {
        return this.isBrandSale;
    }

    public void setIsBrandSale(Boolean isBrandSale) {
        this.isBrandSale = isBrandSale;
    }

    public Boolean getIsDaixiao() {
        return this.isDaixiao;
    }

    public void setIsDaixiao(Boolean isDaixiao) {
        this.isDaixiao = isDaixiao;
    }

    public Boolean getIsForceWlb() {
        return this.isForceWlb;
    }

    public void setIsForceWlb(Boolean isForceWlb) {
        this.isForceWlb = isForceWlb;
    }

    public Boolean getIsLgtype() {
        return this.isLgtype;
    }

    public void setIsLgtype(Boolean isLgtype) {
        this.isLgtype = isLgtype;
    }

    public Boolean getIsPartConsign() {
        return this.isPartConsign;
    }

    public void setIsPartConsign(Boolean isPartConsign) {
        this.isPartConsign = isPartConsign;
    }

    public Boolean getIsShShip() {
        return this.isShShip;
    }

    public void setIsShShip(Boolean isShShip) {
        this.isShShip = isShShip;
    }

    public Boolean getIsWt() {
        return this.isWt;
    }

    public void setIsWt(Boolean isWt) {
        this.isWt = isWt;
    }

    public String getLgAging() {
        return this.lgAging;
    }

    public void setLgAging(String lgAging) {
        this.lgAging = lgAging;
    }

    public String getLgAgingType() {
        return this.lgAgingType;
    }

    public void setLgAgingType(String lgAgingType) {
        this.lgAgingType = lgAgingType;
    }

    public String getMarkDesc() {
        return this.markDesc;
    }

    public void setMarkDesc(String markDesc) {
        this.markDesc = markDesc;
    }

    public String getMarket() {
        return this.market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Long getNum() {
        return this.num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public String getNutFeature() {
        return this.nutFeature;
    }

    public void setNutFeature(String nutFeature) {
        this.nutFeature = nutFeature;
    }

    public String getO2o() {
        return this.o2o;
    }

    public void setO2o(String o2o) {
        this.o2o = o2o;
    }

    public String getO2oDelivery() {
        return this.o2oDelivery;
    }

    public void setO2oDelivery(String o2oDelivery) {
        this.o2oDelivery = o2oDelivery;
    }

    public String getO2oEtOrderId() {
        return this.o2oEtOrderId;
    }

    public void setO2oEtOrderId(String o2oEtOrderId) {
        this.o2oEtOrderId = o2oEtOrderId;
    }

    public String getO2oGuideId() {
        return this.o2oGuideId;
    }

    public void setO2oGuideId(String o2oGuideId) {
        this.o2oGuideId = o2oGuideId;
    }

    public String getO2oGuideName() {
        return this.o2oGuideName;
    }

    public void setO2oGuideName(String o2oGuideName) {
        this.o2oGuideName = o2oGuideName;
    }

    public String getO2oOutTradeId() {
        return this.o2oOutTradeId;
    }

    public void setO2oOutTradeId(String o2oOutTradeId) {
        this.o2oOutTradeId = o2oOutTradeId;
    }

    public String getO2oShopId() {
        return this.o2oShopId;
    }

    public void setO2oShopId(String o2oShopId) {
        this.o2oShopId = o2oShopId;
    }

    public String getO2oShopName() {
        return this.o2oShopName;
    }

    public void setO2oShopName(String o2oShopName) {
        this.o2oShopName = o2oShopName;
    }

    public String getO2oSnatchStatus() {
        return this.o2oSnatchStatus;
    }

    public void setO2oSnatchStatus(String o2oSnatchStatus) {
        this.o2oSnatchStatus = o2oSnatchStatus;
    }

    public String getObs() {
        return this.obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getOmnichannelParam() {
        return this.omnichannelParam;
    }

    public void setOmnichannelParam(String omnichannelParam) {
        this.omnichannelParam = omnichannelParam;
    }

    public String getOrderTaxFee() {
        return this.orderTaxFee;
    }

    public void setOrderTaxFee(String orderTaxFee) {
        this.orderTaxFee = orderTaxFee;
    }

    public List<Order> getOrders() {
        return this.orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getOsDate() {
        return this.osDate;
    }

    public void setOsDate(String osDate) {
        this.osDate = osDate;
    }

    public String getOsRange() {
        return this.osRange;
    }

    public void setOsRange(String osRange) {
        this.osRange = osRange;
    }

    public String getPaidCouponFee() {
        return this.paidCouponFee;
    }

    public void setPaidCouponFee(String paidCouponFee) {
        this.paidCouponFee = paidCouponFee;
    }

    public Date getPayTime() {
        return this.payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayment() {
        return this.payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Long getPccAf() {
        return this.pccAf;
    }

    public void setPccAf(Long pccAf) {
        this.pccAf = pccAf;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public Long getPointFee() {
        return this.pointFee;
    }

    public void setPointFee(Long pointFee) {
        this.pointFee = pointFee;
    }

    public String getPostFee() {
        return this.postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public Boolean getPostGateDeclare() {
        return this.postGateDeclare;
    }

    public void setPostGateDeclare(Boolean postGateDeclare) {
        this.postGateDeclare = postGateDeclare;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPromotion() {
        return this.promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public List<PromotionDetail> getPromotionDetails() {
        return this.promotionDetails;
    }

    public void setPromotionDetails(List<PromotionDetail> promotionDetails) {
        this.promotionDetails = promotionDetails;
    }

    public Long getRealPointFee() {
        return this.realPointFee;
    }

    public void setRealPointFee(Long realPointFee) {
        this.realPointFee = realPointFee;
    }

    public String getReceivedPayment() {
        return this.receivedPayment;
    }

    public void setReceivedPayment(String receivedPayment) {
        this.receivedPayment = receivedPayment;
    }

    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverCity() {
        return this.receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverCountry() {
        return this.receiverCountry;
    }

    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    public String getReceiverDistrict() {
        return this.receiverDistrict;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    public String getReceiverMobile() {
        return this.receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverState() {
        return this.receiverState;
    }

    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

    public String getReceiverTown() {
        return this.receiverTown;
    }

    public void setReceiverTown(String receiverTown) {
        this.receiverTown = receiverTown;
    }

    public String getReceiverZip() {
        return this.receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip;
    }

    public String getRxAuditStatus() {
        return this.rxAuditStatus;
    }

    public void setRxAuditStatus(String rxAuditStatus) {
        this.rxAuditStatus = rxAuditStatus;
    }

    public String getSellerAlipayNo() {
        return this.sellerAlipayNo;
    }

    public void setSellerAlipayNo(String sellerAlipayNo) {
        this.sellerAlipayNo = sellerAlipayNo;
    }

    public Boolean getSellerCanRate() {
        return this.sellerCanRate;
    }

    public void setSellerCanRate(Boolean sellerCanRate) {
        this.sellerCanRate = sellerCanRate;
    }

    public String getSellerCodFee() {
        return this.sellerCodFee;
    }

    public void setSellerCodFee(String sellerCodFee) {
        this.sellerCodFee = sellerCodFee;
    }

    public String getSellerEmail() {
        return this.sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    public Long getSellerFlag() {
        return this.sellerFlag;
    }

    public void setSellerFlag(Long sellerFlag) {
        this.sellerFlag = sellerFlag;
    }

    public String getSellerMemo() {
        return this.sellerMemo;
    }

    public void setSellerMemo(String sellerMemo) {
        this.sellerMemo = sellerMemo;
    }

    public String getSellerMobile() {
        return this.sellerMobile;
    }

    public void setSellerMobile(String sellerMobile) {
        this.sellerMobile = sellerMobile;
    }

    public String getSellerName() {
        return this.sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getSellerPhone() {
        return this.sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public Boolean getSellerRate() {
        return this.sellerRate;
    }

    public void setSellerRate(Boolean sellerRate) {
        this.sellerRate = sellerRate;
    }

    public String getSendTime() {
        return this.sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public List<ServiceOrder> getServiceOrders() {
        return this.serviceOrders;
    }

    public void setServiceOrders(List<ServiceOrder> serviceOrders) {
        this.serviceOrders = serviceOrders;
    }

    public List<LogisticsTag> getServiceTags() {
        return this.serviceTags;
    }

    public void setServiceTags(List<LogisticsTag> serviceTags) {
        this.serviceTags = serviceTags;
    }

    public String getShippingType() {
        return this.shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getShopCode() {
        return this.shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getShopPick() {
        return this.shopPick;
    }

    public void setShopPick(String shopPick) {
        this.shopPick = shopPick;
    }

    public String getSid() {
        return this.sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSnapshot() {
        return this.snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public String getSnapshotUrl() {
        return this.snapshotUrl;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStepPaidFee() {
        return this.stepPaidFee;
    }

    public void setStepPaidFee(String stepPaidFee) {
        this.stepPaidFee = stepPaidFee;
    }

    public String getStepTradeStatus() {
        return this.stepTradeStatus;
    }

    public void setStepTradeStatus(String stepTradeStatus) {
        this.stepTradeStatus = stepTradeStatus;
    }

    public Long getTid() {
        return this.tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Date getTimeoutActionTime() {
        return this.timeoutActionTime;
    }

    public void setTimeoutActionTime(Date timeoutActionTime) {
        this.timeoutActionTime = timeoutActionTime;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getTradeAttr() {
        return this.tradeAttr;
    }

    public void setTradeAttr(String tradeAttr) {
        this.tradeAttr = tradeAttr;
    }

    public void setTradeAttrString(String tradeAttr) {
        this.tradeAttr = tradeAttr;
    }

    public TradeExt getTradeExt() {
        return this.tradeExt;
    }

    public void setTradeExt(TradeExt tradeExt) {
        this.tradeExt = tradeExt;
    }

    public String getTradeFrom() {
        return this.tradeFrom;
    }

    public void setTradeFrom(String tradeFrom) {
        this.tradeFrom = tradeFrom;
    }

    public String getTradeMemo() {
        return this.tradeMemo;
    }

    public void setTradeMemo(String tradeMemo) {
        this.tradeMemo = tradeMemo;
    }

    public String getTradeSource() {
        return this.tradeSource;
    }

    public void setTradeSource(String tradeSource) {
        this.tradeSource = tradeSource;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYfxFee() {
        return this.yfxFee;
    }

    public void setYfxFee(String yfxFee) {
        this.yfxFee = yfxFee;
    }

    public String getYfxId() {
        return this.yfxId;
    }

    public void setYfxId(String yfxId) {
        this.yfxId = yfxId;
    }

    public String getYfxType() {
        return this.yfxType;
    }

    public void setYfxType(String yfxType) {
        this.yfxType = yfxType;
    }

    public Boolean getZeroPurchase() {
        return this.zeroPurchase;
    }

    public void setZeroPurchase(Boolean zeroPurchase) {
        this.zeroPurchase = zeroPurchase;
    }
}


