package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemAddResponse;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ItemAddRequest
        extends BaseTaobaoRequest<ItemAddResponse>
        implements TaobaoUploadRequest<ItemAddResponse> {
    private Long afterSaleId;
    private String approveStatus;
    private Long auctionPoint;
    private String autoFill;
    private Boolean autoRepost;
    private String barcode;
    private String changeProp;
    private String chaoshiExtendsInfo;
    private Long cid;
    private Long codPostageId;
    private String cpvMemo;
    private String customMadeTypeId;
    private String deliveryTimeDeliveryTime;
    private String deliveryTimeDeliveryTimeType;
    private String deliveryTimeNeedDeliveryTime;
    private String desc;
    private String descModules;
    private String emsFee;
    private String expressFee;
    private String features;
    private String foodSecurityContact;
    private String foodSecurityDesignCode;
    private String foodSecurityFactory;
    private String foodSecurityFactorySite;
    private String foodSecurityFoodAdditive;
    private String foodSecurityHealthProductNo;
    private String foodSecurityMix;
    private String foodSecurityPeriod;
    private String foodSecurityPlanStorage;
    private String foodSecurityPrdLicenseNo;
    private String foodSecurityProductDateEnd;
    private String foodSecurityProductDateStart;
    private String foodSecurityStockDateEnd;
    private String foodSecurityStockDateStart;
    private String foodSecuritySupplier;
    private String freightPayer;
    private String globalStockCountry;
    private String globalStockDeliveryPlace;
    private Boolean globalStockTaxFreePromise;
    private String globalStockType;
    private Boolean hasDiscount;
    private Boolean hasInvoice;
    private Boolean hasShowcase;
    private Boolean hasWarranty;
    private String ignorewarning;
    private FileItem image;
    private String increment;
    private String inputCustomCpv;
    private String inputPids;
    private String inputStr;
    private Boolean is3D;
    private Boolean isEx;
    private Boolean isLightningConsignment;
    private String isOffline;
    private Boolean isTaobao;
    private Boolean isXinpin;
    private String itemSize;
    private String itemWeight;
    private String lang;
    private Date listTime;
    private String localityLifeChooseLogis;
    private String localityLifeEticket;
    private String localityLifeExpirydate;
    private String localityLifeMerchant;
    private String localityLifeNetworkId;
    private String localityLifeObs;
    private Long localityLifeOnsaleAutoRefundRatio;
    private String localityLifePackageid;
    private Long localityLifeRefundRatio;
    private String localityLifeRefundmafee;
    private String localityLifeVerification;
    private String localityLifeVersion;
    private String locationCity;
    private String locationState;
    private String msPaymentPrice;
    private String msPaymentReferencePrice;
    private String msPaymentVoucherPrice;
    private String newprepay;
    private Long num;
    private Boolean o2oBindService;
    private String outerId;
    private Long paimaiInfoDeposit;
    private Long paimaiInfoInterval;
    private Long paimaiInfoMode;
    private String paimaiInfoReserve;
    private Long paimaiInfoValidHour;
    private Long paimaiInfoValidMinute;
    private String picPath;
    private String postFee;
    private Long postageId;
    private String price;
    private Long productId;
    private String propertyAlias;
    private String props;
    private String qualification;
    private String scenicTicketBookCost;
    private Long scenicTicketPayWay;
    private String sellPoint;
    private Boolean sellPromise;
    private String sellerCids;
    private String shape;
    private String skuBarcode;
    private String skuDeliveryTimes;
    private String skuHdHeight;
    private String skuHdLampQuantity;
    private String skuHdLength;
    private String skuOuterIds;
    private String skuPrices;
    private String skuProperties;
    private String skuQuantities;
    private String skuSpecIds;
    private Boolean spuConfirm;
    private String stuffStatus;
    private Long subStock;
    private Boolean supportCustomMade;
    private String title;
    private String type;
    private Long validThru;
    private Long weight;
    private String wirelessDesc;

    public void setAfterSaleId(Long afterSaleId) {
        this.afterSaleId = afterSaleId;
    }

    public Long getAfterSaleId() {
        return this.afterSaleId;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getApproveStatus() {
        return this.approveStatus;
    }

    public void setAuctionPoint(Long auctionPoint) {
        this.auctionPoint = auctionPoint;
    }

    public Long getAuctionPoint() {
        return this.auctionPoint;
    }

    public void setAutoFill(String autoFill) {
        this.autoFill = autoFill;
    }

    public String getAutoFill() {
        return this.autoFill;
    }

    public void setAutoRepost(Boolean autoRepost) {
        this.autoRepost = autoRepost;
    }

    public Boolean getAutoRepost() {
        return this.autoRepost;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBarcode() {
        return this.barcode;
    }

    public void setChangeProp(String changeProp) {
        this.changeProp = changeProp;
    }

    public String getChangeProp() {
        return this.changeProp;
    }

    public void setChaoshiExtendsInfo(String chaoshiExtendsInfo) {
        this.chaoshiExtendsInfo = chaoshiExtendsInfo;
    }

    public String getChaoshiExtendsInfo() {
        return this.chaoshiExtendsInfo;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setCodPostageId(Long codPostageId) {
        this.codPostageId = codPostageId;
    }

    public Long getCodPostageId() {
        return this.codPostageId;
    }

    public void setCpvMemo(String cpvMemo) {
        this.cpvMemo = cpvMemo;
    }

    public String getCpvMemo() {
        return this.cpvMemo;
    }

    public void setCustomMadeTypeId(String customMadeTypeId) {
        this.customMadeTypeId = customMadeTypeId;
    }

    public String getCustomMadeTypeId() {
        return this.customMadeTypeId;
    }

    public void setDeliveryTimeDeliveryTime(String deliveryTimeDeliveryTime) {
        this.deliveryTimeDeliveryTime = deliveryTimeDeliveryTime;
    }

    public String getDeliveryTimeDeliveryTime() {
        return this.deliveryTimeDeliveryTime;
    }

    public void setDeliveryTimeDeliveryTimeType(String deliveryTimeDeliveryTimeType) {
        this.deliveryTimeDeliveryTimeType = deliveryTimeDeliveryTimeType;
    }

    public String getDeliveryTimeDeliveryTimeType() {
        return this.deliveryTimeDeliveryTimeType;
    }

    public void setDeliveryTimeNeedDeliveryTime(String deliveryTimeNeedDeliveryTime) {
        this.deliveryTimeNeedDeliveryTime = deliveryTimeNeedDeliveryTime;
    }

    public String getDeliveryTimeNeedDeliveryTime() {
        return this.deliveryTimeNeedDeliveryTime;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDescModules(String descModules) {
        this.descModules = descModules;
    }

    public String getDescModules() {
        return this.descModules;
    }

    public void setEmsFee(String emsFee) {
        this.emsFee = emsFee;
    }

    public String getEmsFee() {
        return this.emsFee;
    }

    public void setExpressFee(String expressFee) {
        this.expressFee = expressFee;
    }

    public String getExpressFee() {
        return this.expressFee;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getFeatures() {
        return this.features;
    }

    public void setFoodSecurityContact(String foodSecurityContact) {
        this.foodSecurityContact = foodSecurityContact;
    }

    public String getFoodSecurityContact() {
        return this.foodSecurityContact;
    }

    public void setFoodSecurityDesignCode(String foodSecurityDesignCode) {
        this.foodSecurityDesignCode = foodSecurityDesignCode;
    }

    public String getFoodSecurityDesignCode() {
        return this.foodSecurityDesignCode;
    }

    public void setFoodSecurityFactory(String foodSecurityFactory) {
        this.foodSecurityFactory = foodSecurityFactory;
    }

    public String getFoodSecurityFactory() {
        return this.foodSecurityFactory;
    }

    public void setFoodSecurityFactorySite(String foodSecurityFactorySite) {
        this.foodSecurityFactorySite = foodSecurityFactorySite;
    }

    public String getFoodSecurityFactorySite() {
        return this.foodSecurityFactorySite;
    }

    public void setFoodSecurityFoodAdditive(String foodSecurityFoodAdditive) {
        this.foodSecurityFoodAdditive = foodSecurityFoodAdditive;
    }

    public String getFoodSecurityFoodAdditive() {
        return this.foodSecurityFoodAdditive;
    }

    public void setFoodSecurityHealthProductNo(String foodSecurityHealthProductNo) {
        this.foodSecurityHealthProductNo = foodSecurityHealthProductNo;
    }

    public String getFoodSecurityHealthProductNo() {
        return this.foodSecurityHealthProductNo;
    }

    public void setFoodSecurityMix(String foodSecurityMix) {
        this.foodSecurityMix = foodSecurityMix;
    }

    public String getFoodSecurityMix() {
        return this.foodSecurityMix;
    }

    public void setFoodSecurityPeriod(String foodSecurityPeriod) {
        this.foodSecurityPeriod = foodSecurityPeriod;
    }

    public String getFoodSecurityPeriod() {
        return this.foodSecurityPeriod;
    }

    public void setFoodSecurityPlanStorage(String foodSecurityPlanStorage) {
        this.foodSecurityPlanStorage = foodSecurityPlanStorage;
    }

    public String getFoodSecurityPlanStorage() {
        return this.foodSecurityPlanStorage;
    }

    public void setFoodSecurityPrdLicenseNo(String foodSecurityPrdLicenseNo) {
        this.foodSecurityPrdLicenseNo = foodSecurityPrdLicenseNo;
    }

    public String getFoodSecurityPrdLicenseNo() {
        return this.foodSecurityPrdLicenseNo;
    }

    public void setFoodSecurityProductDateEnd(String foodSecurityProductDateEnd) {
        this.foodSecurityProductDateEnd = foodSecurityProductDateEnd;
    }

    public String getFoodSecurityProductDateEnd() {
        return this.foodSecurityProductDateEnd;
    }

    public void setFoodSecurityProductDateStart(String foodSecurityProductDateStart) {
        this.foodSecurityProductDateStart = foodSecurityProductDateStart;
    }

    public String getFoodSecurityProductDateStart() {
        return this.foodSecurityProductDateStart;
    }

    public void setFoodSecurityStockDateEnd(String foodSecurityStockDateEnd) {
        this.foodSecurityStockDateEnd = foodSecurityStockDateEnd;
    }

    public String getFoodSecurityStockDateEnd() {
        return this.foodSecurityStockDateEnd;
    }

    public void setFoodSecurityStockDateStart(String foodSecurityStockDateStart) {
        this.foodSecurityStockDateStart = foodSecurityStockDateStart;
    }

    public String getFoodSecurityStockDateStart() {
        return this.foodSecurityStockDateStart;
    }

    public void setFoodSecuritySupplier(String foodSecuritySupplier) {
        this.foodSecuritySupplier = foodSecuritySupplier;
    }

    public String getFoodSecuritySupplier() {
        return this.foodSecuritySupplier;
    }

    public void setFreightPayer(String freightPayer) {
        this.freightPayer = freightPayer;
    }

    public String getFreightPayer() {
        return this.freightPayer;
    }

    public void setGlobalStockCountry(String globalStockCountry) {
        this.globalStockCountry = globalStockCountry;
    }

    public String getGlobalStockCountry() {
        return this.globalStockCountry;
    }

    public void setGlobalStockDeliveryPlace(String globalStockDeliveryPlace) {
        this.globalStockDeliveryPlace = globalStockDeliveryPlace;
    }

    public String getGlobalStockDeliveryPlace() {
        return this.globalStockDeliveryPlace;
    }

    public void setGlobalStockTaxFreePromise(Boolean globalStockTaxFreePromise) {
        this.globalStockTaxFreePromise = globalStockTaxFreePromise;
    }

    public Boolean getGlobalStockTaxFreePromise() {
        return this.globalStockTaxFreePromise;
    }

    public void setGlobalStockType(String globalStockType) {
        this.globalStockType = globalStockType;
    }

    public String getGlobalStockType() {
        return this.globalStockType;
    }

    public void setHasDiscount(Boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public Boolean getHasDiscount() {
        return this.hasDiscount;
    }

    public void setHasInvoice(Boolean hasInvoice) {
        this.hasInvoice = hasInvoice;
    }

    public Boolean getHasInvoice() {
        return this.hasInvoice;
    }

    public void setHasShowcase(Boolean hasShowcase) {
        this.hasShowcase = hasShowcase;
    }

    public Boolean getHasShowcase() {
        return this.hasShowcase;
    }

    public void setHasWarranty(Boolean hasWarranty) {
        this.hasWarranty = hasWarranty;
    }

    public Boolean getHasWarranty() {
        return this.hasWarranty;
    }

    public void setIgnorewarning(String ignorewarning) {
        this.ignorewarning = ignorewarning;
    }

    public String getIgnorewarning() {
        return this.ignorewarning;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public FileItem getImage() {
        return this.image;
    }

    public void setIncrement(String increment) {
        this.increment = increment;
    }

    public String getIncrement() {
        return this.increment;
    }

    public void setInputCustomCpv(String inputCustomCpv) {
        this.inputCustomCpv = inputCustomCpv;
    }

    public String getInputCustomCpv() {
        return this.inputCustomCpv;
    }

    public void setInputPids(String inputPids) {
        this.inputPids = inputPids;
    }

    public String getInputPids() {
        return this.inputPids;
    }

    public void setInputStr(String inputStr) {
        this.inputStr = inputStr;
    }

    public String getInputStr() {
        return this.inputStr;
    }

    public void setIs3D(Boolean is3D) {
        this.is3D = is3D;
    }

    public Boolean getIs3D() {
        return this.is3D;
    }

    public void setIsEx(Boolean isEx) {
        this.isEx = isEx;
    }

    public Boolean getIsEx() {
        return this.isEx;
    }

    public void setIsLightningConsignment(Boolean isLightningConsignment) {
        this.isLightningConsignment = isLightningConsignment;
    }

    public Boolean getIsLightningConsignment() {
        return this.isLightningConsignment;
    }

    public void setIsOffline(String isOffline) {
        this.isOffline = isOffline;
    }

    public String getIsOffline() {
        return this.isOffline;
    }

    public void setIsTaobao(Boolean isTaobao) {
        this.isTaobao = isTaobao;
    }

    public Boolean getIsTaobao() {
        return this.isTaobao;
    }

    public void setIsXinpin(Boolean isXinpin) {
        this.isXinpin = isXinpin;
    }

    public Boolean getIsXinpin() {
        return this.isXinpin;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }

    public String getItemSize() {
        return this.itemSize;
    }

    public void setItemWeight(String itemWeight) {
        this.itemWeight = itemWeight;
    }

    public String getItemWeight() {
        return this.itemWeight;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return this.lang;
    }

    public void setListTime(Date listTime) {
        this.listTime = listTime;
    }

    public Date getListTime() {
        return this.listTime;
    }

    public void setLocalityLifeChooseLogis(String localityLifeChooseLogis) {
        this.localityLifeChooseLogis = localityLifeChooseLogis;
    }

    public String getLocalityLifeChooseLogis() {
        return this.localityLifeChooseLogis;
    }

    public void setLocalityLifeEticket(String localityLifeEticket) {
        this.localityLifeEticket = localityLifeEticket;
    }

    public String getLocalityLifeEticket() {
        return this.localityLifeEticket;
    }

    public void setLocalityLifeExpirydate(String localityLifeExpirydate) {
        this.localityLifeExpirydate = localityLifeExpirydate;
    }

    public String getLocalityLifeExpirydate() {
        return this.localityLifeExpirydate;
    }

    public void setLocalityLifeMerchant(String localityLifeMerchant) {
        this.localityLifeMerchant = localityLifeMerchant;
    }

    public String getLocalityLifeMerchant() {
        return this.localityLifeMerchant;
    }

    public void setLocalityLifeNetworkId(String localityLifeNetworkId) {
        this.localityLifeNetworkId = localityLifeNetworkId;
    }

    public String getLocalityLifeNetworkId() {
        return this.localityLifeNetworkId;
    }

    public void setLocalityLifeObs(String localityLifeObs) {
        this.localityLifeObs = localityLifeObs;
    }

    public String getLocalityLifeObs() {
        return this.localityLifeObs;
    }

    public void setLocalityLifeOnsaleAutoRefundRatio(Long localityLifeOnsaleAutoRefundRatio) {
        this.localityLifeOnsaleAutoRefundRatio = localityLifeOnsaleAutoRefundRatio;
    }

    public Long getLocalityLifeOnsaleAutoRefundRatio() {
        return this.localityLifeOnsaleAutoRefundRatio;
    }

    public void setLocalityLifePackageid(String localityLifePackageid) {
        this.localityLifePackageid = localityLifePackageid;
    }

    public String getLocalityLifePackageid() {
        return this.localityLifePackageid;
    }

    public void setLocalityLifeRefundRatio(Long localityLifeRefundRatio) {
        this.localityLifeRefundRatio = localityLifeRefundRatio;
    }

    public Long getLocalityLifeRefundRatio() {
        return this.localityLifeRefundRatio;
    }

    public void setLocalityLifeRefundmafee(String localityLifeRefundmafee) {
        this.localityLifeRefundmafee = localityLifeRefundmafee;
    }

    public String getLocalityLifeRefundmafee() {
        return this.localityLifeRefundmafee;
    }

    public void setLocalityLifeVerification(String localityLifeVerification) {
        this.localityLifeVerification = localityLifeVerification;
    }

    public String getLocalityLifeVerification() {
        return this.localityLifeVerification;
    }

    public void setLocalityLifeVersion(String localityLifeVersion) {
        this.localityLifeVersion = localityLifeVersion;
    }

    public String getLocalityLifeVersion() {
        return this.localityLifeVersion;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getLocationCity() {
        return this.locationCity;
    }

    public void setLocationState(String locationState) {
        this.locationState = locationState;
    }

    public String getLocationState() {
        return this.locationState;
    }

    public void setMsPaymentPrice(String msPaymentPrice) {
        this.msPaymentPrice = msPaymentPrice;
    }

    public String getMsPaymentPrice() {
        return this.msPaymentPrice;
    }

    public void setMsPaymentReferencePrice(String msPaymentReferencePrice) {
        this.msPaymentReferencePrice = msPaymentReferencePrice;
    }

    public String getMsPaymentReferencePrice() {
        return this.msPaymentReferencePrice;
    }

    public void setMsPaymentVoucherPrice(String msPaymentVoucherPrice) {
        this.msPaymentVoucherPrice = msPaymentVoucherPrice;
    }

    public String getMsPaymentVoucherPrice() {
        return this.msPaymentVoucherPrice;
    }

    public void setNewprepay(String newprepay) {
        this.newprepay = newprepay;
    }

    public String getNewprepay() {
        return this.newprepay;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getNum() {
        return this.num;
    }

    public void setO2oBindService(Boolean o2oBindService) {
        this.o2oBindService = o2oBindService;
    }

    public Boolean getO2oBindService() {
        return this.o2oBindService;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setPaimaiInfoDeposit(Long paimaiInfoDeposit) {
        this.paimaiInfoDeposit = paimaiInfoDeposit;
    }

    public Long getPaimaiInfoDeposit() {
        return this.paimaiInfoDeposit;
    }

    public void setPaimaiInfoInterval(Long paimaiInfoInterval) {
        this.paimaiInfoInterval = paimaiInfoInterval;
    }

    public Long getPaimaiInfoInterval() {
        return this.paimaiInfoInterval;
    }

    public void setPaimaiInfoMode(Long paimaiInfoMode) {
        this.paimaiInfoMode = paimaiInfoMode;
    }

    public Long getPaimaiInfoMode() {
        return this.paimaiInfoMode;
    }

    public void setPaimaiInfoReserve(String paimaiInfoReserve) {
        this.paimaiInfoReserve = paimaiInfoReserve;
    }

    public String getPaimaiInfoReserve() {
        return this.paimaiInfoReserve;
    }

    public void setPaimaiInfoValidHour(Long paimaiInfoValidHour) {
        this.paimaiInfoValidHour = paimaiInfoValidHour;
    }

    public Long getPaimaiInfoValidHour() {
        return this.paimaiInfoValidHour;
    }

    public void setPaimaiInfoValidMinute(Long paimaiInfoValidMinute) {
        this.paimaiInfoValidMinute = paimaiInfoValidMinute;
    }

    public Long getPaimaiInfoValidMinute() {
        return this.paimaiInfoValidMinute;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public String getPostFee() {
        return this.postFee;
    }

    public void setPostageId(Long postageId) {
        this.postageId = postageId;
    }

    public Long getPostageId() {
        return this.postageId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return this.price;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public String getProps() {
        return this.props;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return this.qualification;
    }

    public void setScenicTicketBookCost(String scenicTicketBookCost) {
        this.scenicTicketBookCost = scenicTicketBookCost;
    }

    public String getScenicTicketBookCost() {
        return this.scenicTicketBookCost;
    }

    public void setScenicTicketPayWay(Long scenicTicketPayWay) {
        this.scenicTicketPayWay = scenicTicketPayWay;
    }

    public Long getScenicTicketPayWay() {
        return this.scenicTicketPayWay;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public String getSellPoint() {
        return this.sellPoint;
    }

    public void setSellPromise(Boolean sellPromise) {
        this.sellPromise = sellPromise;
    }

    public Boolean getSellPromise() {
        return this.sellPromise;
    }

    public void setSellerCids(String sellerCids) {
        this.sellerCids = sellerCids;
    }

    public String getSellerCids() {
        return this.sellerCids;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return this.shape;
    }

    public void setSkuBarcode(String skuBarcode) {
        this.skuBarcode = skuBarcode;
    }

    public String getSkuBarcode() {
        return this.skuBarcode;
    }

    public void setSkuDeliveryTimes(String skuDeliveryTimes) {
        this.skuDeliveryTimes = skuDeliveryTimes;
    }

    public String getSkuDeliveryTimes() {
        return this.skuDeliveryTimes;
    }

    public void setSkuHdHeight(String skuHdHeight) {
        this.skuHdHeight = skuHdHeight;
    }

    public String getSkuHdHeight() {
        return this.skuHdHeight;
    }

    public void setSkuHdLampQuantity(String skuHdLampQuantity) {
        this.skuHdLampQuantity = skuHdLampQuantity;
    }

    public String getSkuHdLampQuantity() {
        return this.skuHdLampQuantity;
    }

    public void setSkuHdLength(String skuHdLength) {
        this.skuHdLength = skuHdLength;
    }

    public String getSkuHdLength() {
        return this.skuHdLength;
    }

    public void setSkuOuterIds(String skuOuterIds) {
        this.skuOuterIds = skuOuterIds;
    }

    public String getSkuOuterIds() {
        return this.skuOuterIds;
    }

    public void setSkuPrices(String skuPrices) {
        this.skuPrices = skuPrices;
    }

    public String getSkuPrices() {
        return this.skuPrices;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public String getSkuProperties() {
        return this.skuProperties;
    }

    public void setSkuQuantities(String skuQuantities) {
        this.skuQuantities = skuQuantities;
    }

    public String getSkuQuantities() {
        return this.skuQuantities;
    }

    public void setSkuSpecIds(String skuSpecIds) {
        this.skuSpecIds = skuSpecIds;
    }

    public String getSkuSpecIds() {
        return this.skuSpecIds;
    }

    public void setSpuConfirm(Boolean spuConfirm) {
        this.spuConfirm = spuConfirm;
    }

    public Boolean getSpuConfirm() {
        return this.spuConfirm;
    }

    public void setStuffStatus(String stuffStatus) {
        this.stuffStatus = stuffStatus;
    }

    public String getStuffStatus() {
        return this.stuffStatus;
    }

    public void setSubStock(Long subStock) {
        this.subStock = subStock;
    }

    public Long getSubStock() {
        return this.subStock;
    }

    public void setSupportCustomMade(Boolean supportCustomMade) {
        this.supportCustomMade = supportCustomMade;
    }

    public Boolean getSupportCustomMade() {
        return this.supportCustomMade;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setValidThru(Long validThru) {
        this.validThru = validThru;
    }

    public Long getValidThru() {
        return this.validThru;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getWeight() {
        return this.weight;
    }

    public void setWirelessDesc(String wirelessDesc) {
        this.wirelessDesc = wirelessDesc;
    }

    public String getWirelessDesc() {
        return this.wirelessDesc;
    }

    public String getApiMethodName() {
        return "taobao.item.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("after_sale_id", this.afterSaleId);
        txtParams.put("approve_status", this.approveStatus);
        txtParams.put("auction_point", this.auctionPoint);
        txtParams.put("auto_fill", this.autoFill);
        txtParams.put("auto_repost", this.autoRepost);
        txtParams.put("barcode", this.barcode);
        txtParams.put("change_prop", this.changeProp);
        txtParams.put("chaoshi_extends_info", this.chaoshiExtendsInfo);
        txtParams.put("cid", this.cid);
        txtParams.put("cod_postage_id", this.codPostageId);
        txtParams.put("cpv_memo", this.cpvMemo);
        txtParams.put("custom_made_type_id", this.customMadeTypeId);
        txtParams.put("delivery_time.delivery_time", this.deliveryTimeDeliveryTime);
        txtParams.put("delivery_time.delivery_time_type", this.deliveryTimeDeliveryTimeType);
        txtParams.put("delivery_time.need_delivery_time", this.deliveryTimeNeedDeliveryTime);
        txtParams.put("desc", this.desc);
        txtParams.put("desc_modules", this.descModules);
        txtParams.put("ems_fee", this.emsFee);
        txtParams.put("express_fee", this.expressFee);
        txtParams.put("features", this.features);
        txtParams.put("food_security.contact", this.foodSecurityContact);
        txtParams.put("food_security.design_code", this.foodSecurityDesignCode);
        txtParams.put("food_security.factory", this.foodSecurityFactory);
        txtParams.put("food_security.factory_site", this.foodSecurityFactorySite);
        txtParams.put("food_security.food_additive", this.foodSecurityFoodAdditive);
        txtParams.put("food_security.health_product_no", this.foodSecurityHealthProductNo);
        txtParams.put("food_security.mix", this.foodSecurityMix);
        txtParams.put("food_security.period", this.foodSecurityPeriod);
        txtParams.put("food_security.plan_storage", this.foodSecurityPlanStorage);
        txtParams.put("food_security.prd_license_no", this.foodSecurityPrdLicenseNo);
        txtParams.put("food_security.product_date_end", this.foodSecurityProductDateEnd);
        txtParams.put("food_security.product_date_start", this.foodSecurityProductDateStart);
        txtParams.put("food_security.stock_date_end", this.foodSecurityStockDateEnd);
        txtParams.put("food_security.stock_date_start", this.foodSecurityStockDateStart);
        txtParams.put("food_security.supplier", this.foodSecuritySupplier);
        txtParams.put("freight_payer", this.freightPayer);
        txtParams.put("global_stock_country", this.globalStockCountry);
        txtParams.put("global_stock_delivery_place", this.globalStockDeliveryPlace);
        txtParams.put("global_stock_tax_free_promise", this.globalStockTaxFreePromise);
        txtParams.put("global_stock_type", this.globalStockType);
        txtParams.put("has_discount", this.hasDiscount);
        txtParams.put("has_invoice", this.hasInvoice);
        txtParams.put("has_showcase", this.hasShowcase);
        txtParams.put("has_warranty", this.hasWarranty);
        txtParams.put("ignorewarning", this.ignorewarning);
        txtParams.put("increment", this.increment);
        txtParams.put("input_custom_cpv", this.inputCustomCpv);
        txtParams.put("input_pids", this.inputPids);
        txtParams.put("input_str", this.inputStr);
        txtParams.put("is_3D", this.is3D);
        txtParams.put("is_ex", this.isEx);
        txtParams.put("is_lightning_consignment", this.isLightningConsignment);
        txtParams.put("is_offline", this.isOffline);
        txtParams.put("is_taobao", this.isTaobao);
        txtParams.put("is_xinpin", this.isXinpin);
        txtParams.put("item_size", this.itemSize);
        txtParams.put("item_weight", this.itemWeight);
        txtParams.put("lang", this.lang);
        txtParams.put("list_time", this.listTime);
        txtParams.put("locality_life.choose_logis", this.localityLifeChooseLogis);
        txtParams.put("locality_life.eticket", this.localityLifeEticket);
        txtParams.put("locality_life.expirydate", this.localityLifeExpirydate);
        txtParams.put("locality_life.merchant", this.localityLifeMerchant);
        txtParams.put("locality_life.network_id", this.localityLifeNetworkId);
        txtParams.put("locality_life.obs", this.localityLifeObs);
        txtParams.put("locality_life.onsale_auto_refund_ratio", this.localityLifeOnsaleAutoRefundRatio);
        txtParams.put("locality_life.packageid", this.localityLifePackageid);
        txtParams.put("locality_life.refund_ratio", this.localityLifeRefundRatio);
        txtParams.put("locality_life.refundmafee", this.localityLifeRefundmafee);
        txtParams.put("locality_life.verification", this.localityLifeVerification);
        txtParams.put("locality_life.version", this.localityLifeVersion);
        txtParams.put("location.city", this.locationCity);
        txtParams.put("location.state", this.locationState);
        txtParams.put("ms_payment.price", this.msPaymentPrice);
        txtParams.put("ms_payment.reference_price", this.msPaymentReferencePrice);
        txtParams.put("ms_payment.voucher_price", this.msPaymentVoucherPrice);
        txtParams.put("newprepay", this.newprepay);
        txtParams.put("num", this.num);
        txtParams.put("o2o_bind_service", this.o2oBindService);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("paimai_info.deposit", this.paimaiInfoDeposit);
        txtParams.put("paimai_info.interval", this.paimaiInfoInterval);
        txtParams.put("paimai_info.mode", this.paimaiInfoMode);
        txtParams.put("paimai_info.reserve", this.paimaiInfoReserve);
        txtParams.put("paimai_info.valid_hour", this.paimaiInfoValidHour);
        txtParams.put("paimai_info.valid_minute", this.paimaiInfoValidMinute);
        txtParams.put("pic_path", this.picPath);
        txtParams.put("post_fee", this.postFee);
        txtParams.put("postage_id", this.postageId);
        txtParams.put("price", this.price);
        txtParams.put("product_id", this.productId);
        txtParams.put("property_alias", this.propertyAlias);
        txtParams.put("props", this.props);
        txtParams.put("qualification", this.qualification);
        txtParams.put("scenic_ticket_book_cost", this.scenicTicketBookCost);
        txtParams.put("scenic_ticket_pay_way", this.scenicTicketPayWay);
        txtParams.put("sell_point", this.sellPoint);
        txtParams.put("sell_promise", this.sellPromise);
        txtParams.put("seller_cids", this.sellerCids);
        txtParams.put("shape", this.shape);
        txtParams.put("sku_barcode", this.skuBarcode);
        txtParams.put("sku_delivery_times", this.skuDeliveryTimes);
        txtParams.put("sku_hd_height", this.skuHdHeight);
        txtParams.put("sku_hd_lamp_quantity", this.skuHdLampQuantity);
        txtParams.put("sku_hd_length", this.skuHdLength);
        txtParams.put("sku_outer_ids", this.skuOuterIds);
        txtParams.put("sku_prices", this.skuPrices);
        txtParams.put("sku_properties", this.skuProperties);
        txtParams.put("sku_quantities", this.skuQuantities);
        txtParams.put("sku_spec_ids", this.skuSpecIds);
        txtParams.put("spu_confirm", this.spuConfirm);
        txtParams.put("stuff_status", this.stuffStatus);
        txtParams.put("sub_stock", this.subStock);
        txtParams.put("support_custom_made", this.supportCustomMade);
        txtParams.put("title", this.title);
        txtParams.put("type", this.type);
        txtParams.put("valid_thru", this.validThru);
        txtParams.put("weight", this.weight);
        txtParams.put("wireless_desc", this.wirelessDesc);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemAddResponse> getResponseClass() {
        return ItemAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.cid, "cid");
        RequestCheckUtils.checkMinValue(this.cid, 0L, "cid");
        RequestCheckUtils.checkNotEmpty(this.desc, "desc");
        RequestCheckUtils.checkMaxLength(this.desc, 200000, "desc");
        RequestCheckUtils.checkMaxLength(this.features, 4000, "features");
        RequestCheckUtils.checkMaxLength(this.globalStockCountry, 30, "globalStockCountry");
        RequestCheckUtils.checkNotEmpty(this.locationCity, "locationCity");
        RequestCheckUtils.checkNotEmpty(this.locationState, "locationState");
        RequestCheckUtils.checkNotEmpty(this.num, "num");
        RequestCheckUtils.checkMaxValue(this.num, 900000000L, "num");
        RequestCheckUtils.checkMinValue(this.num, 0L, "num");
        RequestCheckUtils.checkMaxValue(this.paimaiInfoInterval, 60L, "paimaiInfoInterval");
        RequestCheckUtils.checkMinValue(this.paimaiInfoInterval, 1L, "paimaiInfoInterval");
        RequestCheckUtils.checkMaxValue(this.paimaiInfoMode, 3L, "paimaiInfoMode");
        RequestCheckUtils.checkMinValue(this.paimaiInfoMode, 1L, "paimaiInfoMode");
        RequestCheckUtils.checkMaxValue(this.paimaiInfoValidHour, 48L, "paimaiInfoValidHour");
        RequestCheckUtils.checkMinValue(this.paimaiInfoValidHour, 1L, "paimaiInfoValidHour");
        RequestCheckUtils.checkMaxValue(this.paimaiInfoValidMinute, 59L, "paimaiInfoValidMinute");
        RequestCheckUtils.checkMinValue(this.paimaiInfoValidMinute, 0L, "paimaiInfoValidMinute");
        RequestCheckUtils.checkMaxLength(this.propertyAlias, 800, "propertyAlias");
        RequestCheckUtils.checkMaxLength(this.sellPoint, 150, "sellPoint");
        RequestCheckUtils.checkMaxListSize(this.sellerCids, 10, "sellerCids");
        RequestCheckUtils.checkNotEmpty(this.stuffStatus, "stuffStatus");
        RequestCheckUtils.checkNotEmpty(this.title, "title");
        RequestCheckUtils.checkMaxLength(this.title, 120, "title");
        RequestCheckUtils.checkNotEmpty(this.type, "type");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("image", this.image);
        return params;
    }
}


