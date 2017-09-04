package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class Item
        extends TaobaoObject {
    private static final long serialVersionUID = 5222173544198915588L;
    @ApiField("after_sale_id")
    private Long afterSaleId;
    @ApiField("appkey")
    private String appkey;
    @ApiField("approve_status")
    private String approveStatus;
    @ApiField("auction_point")
    private Long auctionPoint;
    @ApiField("auto_fill")
    private String autoFill;
    @ApiField("auto_repost")
    private Boolean autoRepost;
    @ApiField("barcode")
    private String barcode;
    @ApiField("callbackUrl")
    private String callbackUrl;
    @ApiField("change_prop")
    private String changeProp;
    @ApiField("chaoshi_extends_info")
    private String chaoshiExtendsInfo;
    @ApiField("cid")
    private Long cid;
    @ApiField("cod_postage_id")
    private Long codPostageId;
    @ApiField("cpv_memo")
    private String cpvMemo;
    @ApiField("created")
    private Date created;
    @ApiField("cuntao_item_specific")
    private CuntaoItemSpecific cuntaoItemSpecific;
    @ApiField("custom_made_type_id")
    private String customMadeTypeId;
    @ApiField("delist_time")
    private Date delistTime;
    @ApiField("delivery_time")
    private DeliveryTime deliveryTime;
    @ApiField("desc")
    private String desc;
    @ApiField("desc_module_info")
    private DescModuleInfo descModuleInfo;
    @ApiField("desc_modules")
    private String descModules;
    @ApiField("detail_url")
    private String detailUrl;
    @ApiField("ems_fee")
    private String emsFee;
    @ApiField("express_fee")
    private String expressFee;
    @ApiField("features")
    private String features;
    @ApiField("food_security")
    private FoodSecurity foodSecurity;
    @ApiField("freight_payer")
    private String freightPayer;
    @ApiField("global_stock_country")
    private String globalStockCountry;
    @ApiField("global_stock_delivery_place")
    private String globalStockDeliveryPlace;
    @ApiField("global_stock_tax_free_promise")
    private Boolean globalStockTaxFreePromise;
    @ApiField("global_stock_type")
    private String globalStockType;
    @ApiField("gmt_modified")
    private Date gmtModified;
    @ApiField("has_discount")
    private Boolean hasDiscount;
    @ApiField("has_invoice")
    private Boolean hasInvoice;
    @ApiField("has_showcase")
    private Boolean hasShowcase;
    @ApiField("has_warranty")
    private Boolean hasWarranty;
    @ApiField("iid")
    private String iid;
    @ApiField("increment")
    private String increment;
    @ApiField("inner_shop_auction_template_id")
    private Long innerShopAuctionTemplateId;
    @ApiField("input_custom_cpv")
    private String inputCustomCpv;
    @ApiField("input_pids")
    private String inputPids;
    @ApiField("input_str")
    private String inputStr;
    @ApiField("is_3D")
    private Boolean is3D;
    @ApiField("is_area_sale")
    private Boolean isAreaSale;
    @ApiField("is_cspu")
    private Boolean isCspu;
    @ApiField("is_ex")
    private Boolean isEx;
    @ApiField("is_fenxiao")
    private Long isFenxiao;
    @ApiField("is_lightning_consignment")
    private Boolean isLightningConsignment;
    @ApiField("is_offline")
    private String isOffline;
    @ApiField("is_prepay")
    private Boolean isPrepay;
    @ApiField("is_taobao")
    private Boolean isTaobao;
    @ApiField("is_timing")
    private Boolean isTiming;
    @ApiField("is_virtual")
    private Boolean isVirtual;
    @ApiField("is_xinpin")
    private Boolean isXinpin;
    @ApiListField("item_imgs")
    @ApiField("item_img")
    private List<ItemImg> itemImgs;
    @ApiField("item_size")
    private String itemSize;
    @ApiField("item_weight")
    private String itemWeight;
    @ApiField("list_time")
    private Date listTime;
    @ApiField("locality_life")
    private LocalityLife localityLife;
    @ApiField("location")
    private Location location;
    @ApiField("logistics_info")
    private String logisticsInfo;
    @ApiField("modified")
    private Date modified;
    @ApiField("mpic_video")
    private MpicVideo mpicVideo;
    @ApiField("ms_payment")
    private String msPayment;
    @ApiField("newprepay")
    private String newprepay;
    @ApiField("nick")
    private String nick;
    @ApiField("num")
    private Long num;
    @ApiField("num_iid")
    private Long numIid;
    @ApiField("o2o_bind_service")
    private Boolean o2oBindService;
    @ApiField("one_station")
    private Boolean oneStation;
    @ApiField("open_iid")
    private String openIid;
    @ApiField("outer_id")
    private String outerId;
    @ApiField("outer_shop_auction_template_id")
    private Long outerShopAuctionTemplateId;
    @ApiField("paimai_info")
    private PaimaiInfo paimaiInfo;
    @ApiField("period_sold_quantity")
    private Long periodSoldQuantity;
    @ApiField("pic_url")
    private String picUrl;
    @ApiField("post_fee")
    private String postFee;
    @ApiField("postage_id")
    private Long postageId;
    @ApiField("price")
    private String price;
    @ApiField("product_id")
    private Long productId;
    @ApiField("promoted_service")
    private String promotedService;
    @ApiListField("prop_imgs")
    @ApiField("prop_img")
    private List<PropImg> propImgs;
    @ApiField("property_alias")
    private String propertyAlias;
    @ApiField("props")
    private String props;
    @ApiField("props_name")
    private String propsName;
    @ApiField("qualification")
    private String qualification;
    @ApiField("score")
    private Long score;
    @ApiField("second_kill")
    private String secondKill;
    @ApiField("second_result")
    private Boolean secondResult;
    @ApiField("sell_point")
    private String sellPoint;
    @ApiField("sell_promise")
    private Boolean sellPromise;
    @ApiField("seller_cids")
    private String sellerCids;
    @ApiField("shop_type")
    private String shopType;
    @ApiListField("skus")
    @ApiField("sku")
    private List<Sku> skus;
    @ApiField("sold_quantity")
    private Long soldQuantity;
    @ApiField("spu_confirm")
    private Boolean spuConfirm;
    @ApiField("stuff_status")
    private String stuffStatus;
    @ApiField("sub_stock")
    private Long subStock;
    @ApiField("sub_title")
    private String subTitle;
    @ApiField("template_id")
    private String templateId;
    @ApiField("title")
    private String title;
    @ApiField("type")
    private String type;
    @ApiField("valid_thru")
    private Long validThru;
    @ApiField("video_id")
    private Long videoId;
    @ApiListField("videos")
    @ApiField("video")
    private List<Video> videos;
    @ApiField("violation")
    private Boolean violation;
    @ApiField("volume")
    private Long volume;
    @ApiField("wap_desc")
    private String wapDesc;
    @ApiField("wap_detail_url")
    private String wapDetailUrl;
    @ApiField("wireless_desc")
    private String wirelessDesc;
    @ApiField("with_hold_quantity")
    private Long withHoldQuantity;
    @ApiField("ww_status")
    private Boolean wwStatus;

    public Long getAfterSaleId() {
        return this.afterSaleId;
    }

    public void setAfterSaleId(Long afterSaleId) {
        this.afterSaleId = afterSaleId;
    }

    public String getAppkey() {
        return this.appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getApproveStatus() {
        return this.approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public Long getAuctionPoint() {
        return this.auctionPoint;
    }

    public void setAuctionPoint(Long auctionPoint) {
        this.auctionPoint = auctionPoint;
    }

    public String getAutoFill() {
        return this.autoFill;
    }

    public void setAutoFill(String autoFill) {
        this.autoFill = autoFill;
    }

    public Boolean getAutoRepost() {
        return this.autoRepost;
    }

    public void setAutoRepost(Boolean autoRepost) {
        this.autoRepost = autoRepost;
    }

    public String getBarcode() {
        return this.barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getChangeProp() {
        return this.changeProp;
    }

    public void setChangeProp(String changeProp) {
        this.changeProp = changeProp;
    }

    public String getChaoshiExtendsInfo() {
        return this.chaoshiExtendsInfo;
    }

    public void setChaoshiExtendsInfo(String chaoshiExtendsInfo) {
        this.chaoshiExtendsInfo = chaoshiExtendsInfo;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCodPostageId() {
        return this.codPostageId;
    }

    public void setCodPostageId(Long codPostageId) {
        this.codPostageId = codPostageId;
    }

    public String getCpvMemo() {
        return this.cpvMemo;
    }

    public void setCpvMemo(String cpvMemo) {
        this.cpvMemo = cpvMemo;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public CuntaoItemSpecific getCuntaoItemSpecific() {
        return this.cuntaoItemSpecific;
    }

    public void setCuntaoItemSpecific(CuntaoItemSpecific cuntaoItemSpecific) {
        this.cuntaoItemSpecific = cuntaoItemSpecific;
    }

    public String getCustomMadeTypeId() {
        return this.customMadeTypeId;
    }

    public void setCustomMadeTypeId(String customMadeTypeId) {
        this.customMadeTypeId = customMadeTypeId;
    }

    public Date getDelistTime() {
        return this.delistTime;
    }

    public void setDelistTime(Date delistTime) {
        this.delistTime = delistTime;
    }

    public DeliveryTime getDeliveryTime() {
        return this.deliveryTime;
    }

    public void setDeliveryTime(DeliveryTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DescModuleInfo getDescModuleInfo() {
        return this.descModuleInfo;
    }

    public void setDescModuleInfo(DescModuleInfo descModuleInfo) {
        this.descModuleInfo = descModuleInfo;
    }

    public String getDescModules() {
        return this.descModules;
    }

    public void setDescModules(String descModules) {
        this.descModules = descModules;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getEmsFee() {
        return this.emsFee;
    }

    public void setEmsFee(String emsFee) {
        this.emsFee = emsFee;
    }

    public String getExpressFee() {
        return this.expressFee;
    }

    public void setExpressFee(String expressFee) {
        this.expressFee = expressFee;
    }

    public String getFeatures() {
        return this.features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public FoodSecurity getFoodSecurity() {
        return this.foodSecurity;
    }

    public void setFoodSecurity(FoodSecurity foodSecurity) {
        this.foodSecurity = foodSecurity;
    }

    public String getFreightPayer() {
        return this.freightPayer;
    }

    public void setFreightPayer(String freightPayer) {
        this.freightPayer = freightPayer;
    }

    public String getGlobalStockCountry() {
        return this.globalStockCountry;
    }

    public void setGlobalStockCountry(String globalStockCountry) {
        this.globalStockCountry = globalStockCountry;
    }

    public String getGlobalStockDeliveryPlace() {
        return this.globalStockDeliveryPlace;
    }

    public void setGlobalStockDeliveryPlace(String globalStockDeliveryPlace) {
        this.globalStockDeliveryPlace = globalStockDeliveryPlace;
    }

    public Boolean getGlobalStockTaxFreePromise() {
        return this.globalStockTaxFreePromise;
    }

    public void setGlobalStockTaxFreePromise(Boolean globalStockTaxFreePromise) {
        this.globalStockTaxFreePromise = globalStockTaxFreePromise;
    }

    public String getGlobalStockType() {
        return this.globalStockType;
    }

    public void setGlobalStockType(String globalStockType) {
        this.globalStockType = globalStockType;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Boolean getHasDiscount() {
        return this.hasDiscount;
    }

    public void setHasDiscount(Boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public Boolean getHasInvoice() {
        return this.hasInvoice;
    }

    public void setHasInvoice(Boolean hasInvoice) {
        this.hasInvoice = hasInvoice;
    }

    public Boolean getHasShowcase() {
        return this.hasShowcase;
    }

    public void setHasShowcase(Boolean hasShowcase) {
        this.hasShowcase = hasShowcase;
    }

    public Boolean getHasWarranty() {
        return this.hasWarranty;
    }

    public void setHasWarranty(Boolean hasWarranty) {
        this.hasWarranty = hasWarranty;
    }

    public String getIid() {
        return this.iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public String getIncrement() {
        return this.increment;
    }

    public void setIncrement(String increment) {
        this.increment = increment;
    }

    public Long getInnerShopAuctionTemplateId() {
        return this.innerShopAuctionTemplateId;
    }

    public void setInnerShopAuctionTemplateId(Long innerShopAuctionTemplateId) {
        this.innerShopAuctionTemplateId = innerShopAuctionTemplateId;
    }

    public String getInputCustomCpv() {
        return this.inputCustomCpv;
    }

    public void setInputCustomCpv(String inputCustomCpv) {
        this.inputCustomCpv = inputCustomCpv;
    }

    public String getInputPids() {
        return this.inputPids;
    }

    public void setInputPids(String inputPids) {
        this.inputPids = inputPids;
    }

    public String getInputStr() {
        return this.inputStr;
    }

    public void setInputStr(String inputStr) {
        this.inputStr = inputStr;
    }

    public Boolean getIs3D() {
        return this.is3D;
    }

    public void setIs3D(Boolean is3D) {
        this.is3D = is3D;
    }

    public Boolean getIsAreaSale() {
        return this.isAreaSale;
    }

    public void setIsAreaSale(Boolean isAreaSale) {
        this.isAreaSale = isAreaSale;
    }

    public Boolean getIsCspu() {
        return this.isCspu;
    }

    public void setIsCspu(Boolean isCspu) {
        this.isCspu = isCspu;
    }

    public Boolean getIsEx() {
        return this.isEx;
    }

    public void setIsEx(Boolean isEx) {
        this.isEx = isEx;
    }

    public Long getIsFenxiao() {
        return this.isFenxiao;
    }

    public void setIsFenxiao(Long isFenxiao) {
        this.isFenxiao = isFenxiao;
    }

    public Boolean getIsLightningConsignment() {
        return this.isLightningConsignment;
    }

    public void setIsLightningConsignment(Boolean isLightningConsignment) {
        this.isLightningConsignment = isLightningConsignment;
    }

    public String getIsOffline() {
        return this.isOffline;
    }

    public void setIsOffline(String isOffline) {
        this.isOffline = isOffline;
    }

    public Boolean getIsPrepay() {
        return this.isPrepay;
    }

    public void setIsPrepay(Boolean isPrepay) {
        this.isPrepay = isPrepay;
    }

    public Boolean getIsTaobao() {
        return this.isTaobao;
    }

    public void setIsTaobao(Boolean isTaobao) {
        this.isTaobao = isTaobao;
    }

    public Boolean getIsTiming() {
        return this.isTiming;
    }

    public void setIsTiming(Boolean isTiming) {
        this.isTiming = isTiming;
    }

    public Boolean getIsVirtual() {
        return this.isVirtual;
    }

    public void setIsVirtual(Boolean isVirtual) {
        this.isVirtual = isVirtual;
    }

    public Boolean getIsXinpin() {
        return this.isXinpin;
    }

    public void setIsXinpin(Boolean isXinpin) {
        this.isXinpin = isXinpin;
    }

    public List<ItemImg> getItemImgs() {
        return this.itemImgs;
    }

    public void setItemImgs(List<ItemImg> itemImgs) {
        this.itemImgs = itemImgs;
    }

    public String getItemSize() {
        return this.itemSize;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }

    public String getItemWeight() {
        return this.itemWeight;
    }

    public void setItemWeight(String itemWeight) {
        this.itemWeight = itemWeight;
    }

    public Date getListTime() {
        return this.listTime;
    }

    public void setListTime(Date listTime) {
        this.listTime = listTime;
    }

    public LocalityLife getLocalityLife() {
        return this.localityLife;
    }

    public void setLocalityLife(LocalityLife localityLife) {
        this.localityLife = localityLife;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getLogisticsInfo() {
        return this.logisticsInfo;
    }

    public void setLogisticsInfo(String logisticsInfo) {
        this.logisticsInfo = logisticsInfo;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public MpicVideo getMpicVideo() {
        return this.mpicVideo;
    }

    public void setMpicVideo(MpicVideo mpicVideo) {
        this.mpicVideo = mpicVideo;
    }

    public String getMsPayment() {
        return this.msPayment;
    }

    public void setMsPayment(String msPayment) {
        this.msPayment = msPayment;
    }

    public void setMsPaymentString(String msPayment) {
        this.msPayment = msPayment;
    }

    public String getNewprepay() {
        return this.newprepay;
    }

    public void setNewprepay(String newprepay) {
        this.newprepay = newprepay;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
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

    public Boolean getO2oBindService() {
        return this.o2oBindService;
    }

    public void setO2oBindService(Boolean o2oBindService) {
        this.o2oBindService = o2oBindService;
    }

    public Boolean getOneStation() {
        return this.oneStation;
    }

    public void setOneStation(Boolean oneStation) {
        this.oneStation = oneStation;
    }

    public String getOpenIid() {
        return this.openIid;
    }

    public void setOpenIid(String openIid) {
        this.openIid = openIid;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public Long getOuterShopAuctionTemplateId() {
        return this.outerShopAuctionTemplateId;
    }

    public void setOuterShopAuctionTemplateId(Long outerShopAuctionTemplateId) {
        this.outerShopAuctionTemplateId = outerShopAuctionTemplateId;
    }

    public PaimaiInfo getPaimaiInfo() {
        return this.paimaiInfo;
    }

    public void setPaimaiInfo(PaimaiInfo paimaiInfo) {
        this.paimaiInfo = paimaiInfo;
    }

    public Long getPeriodSoldQuantity() {
        return this.periodSoldQuantity;
    }

    public void setPeriodSoldQuantity(Long periodSoldQuantity) {
        this.periodSoldQuantity = periodSoldQuantity;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPostFee() {
        return this.postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public Long getPostageId() {
        return this.postageId;
    }

    public void setPostageId(Long postageId) {
        this.postageId = postageId;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getPromotedService() {
        return this.promotedService;
    }

    public void setPromotedService(String promotedService) {
        this.promotedService = promotedService;
    }

    public List<PropImg> getPropImgs() {
        return this.propImgs;
    }

    public void setPropImgs(List<PropImg> propImgs) {
        this.propImgs = propImgs;
    }

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public String getProps() {
        return this.props;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public String getPropsName() {
        return this.propsName;
    }

    public void setPropsName(String propsName) {
        this.propsName = propsName;
    }

    public String getQualification() {
        return this.qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Long getScore() {
        return this.score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getSecondKill() {
        return this.secondKill;
    }

    public void setSecondKill(String secondKill) {
        this.secondKill = secondKill;
    }

    public Boolean getSecondResult() {
        return this.secondResult;
    }

    public void setSecondResult(Boolean secondResult) {
        this.secondResult = secondResult;
    }

    public String getSellPoint() {
        return this.sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public Boolean getSellPromise() {
        return this.sellPromise;
    }

    public void setSellPromise(Boolean sellPromise) {
        this.sellPromise = sellPromise;
    }

    public String getSellerCids() {
        return this.sellerCids;
    }

    public void setSellerCids(String sellerCids) {
        this.sellerCids = sellerCids;
    }

    public String getShopType() {
        return this.shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public List<Sku> getSkus() {
        return this.skus;
    }

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }

    public Long getSoldQuantity() {
        return this.soldQuantity;
    }

    public void setSoldQuantity(Long soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public Boolean getSpuConfirm() {
        return this.spuConfirm;
    }

    public void setSpuConfirm(Boolean spuConfirm) {
        this.spuConfirm = spuConfirm;
    }

    public String getStuffStatus() {
        return this.stuffStatus;
    }

    public void setStuffStatus(String stuffStatus) {
        this.stuffStatus = stuffStatus;
    }

    public Long getSubStock() {
        return this.subStock;
    }

    public void setSubStock(Long subStock) {
        this.subStock = subStock;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getValidThru() {
        return this.validThru;
    }

    public void setValidThru(Long validThru) {
        this.validThru = validThru;
    }

    public Long getVideoId() {
        return this.videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public List<Video> getVideos() {
        return this.videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public Boolean getViolation() {
        return this.violation;
    }

    public void setViolation(Boolean violation) {
        this.violation = violation;
    }

    public Long getVolume() {
        return this.volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public String getWapDesc() {
        return this.wapDesc;
    }

    public void setWapDesc(String wapDesc) {
        this.wapDesc = wapDesc;
    }

    public String getWapDetailUrl() {
        return this.wapDetailUrl;
    }

    public void setWapDetailUrl(String wapDetailUrl) {
        this.wapDetailUrl = wapDetailUrl;
    }

    public String getWirelessDesc() {
        return this.wirelessDesc;
    }

    public void setWirelessDesc(String wirelessDesc) {
        this.wirelessDesc = wirelessDesc;
    }

    public Long getWithHoldQuantity() {
        return this.withHoldQuantity;
    }

    public void setWithHoldQuantity(Long withHoldQuantity) {
        this.withHoldQuantity = withHoldQuantity;
    }

    public Boolean getWwStatus() {
        return this.wwStatus;
    }

    public void setWwStatus(Boolean wwStatus) {
        this.wwStatus = wwStatus;
    }
}


