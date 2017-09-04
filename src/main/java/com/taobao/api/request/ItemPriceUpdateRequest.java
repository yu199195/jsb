package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemPriceUpdateResponse;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ItemPriceUpdateRequest
        extends BaseTaobaoRequest<ItemPriceUpdateResponse>
        implements TaobaoUploadRequest<ItemPriceUpdateResponse> {
    private String approveStatus;
    private Long auctionPoint;
    private String autoFill;
    private Boolean autoRepost;
    private Long cid;
    private Long codPostageId;
    private String desc;
    private String emsFee;
    private String expressFee;
    private String freightPayer;
    private Boolean hasDiscount;
    private Boolean hasInvoice;
    private Boolean hasShowcase;
    private Boolean hasWarranty;
    private String ignorewarning;
    private FileItem image;
    private String increment;
    private String inputPids;
    private String inputStr;
    private Boolean is3D;
    private Boolean isEx;
    private Boolean isLightningConsignment;
    private Boolean isReplaceSku;
    private Boolean isTaobao;
    private Boolean isXinpin;
    private String lang;
    private Date listTime;
    private String locationCity;
    private String locationState;
    private Long num;
    private Long numIid;
    private String outerId;
    private String picPath;
    private String postFee;
    private Long postageId;
    private String price;
    private Long productId;
    private String propertyAlias;
    private String props;
    private Boolean sellPromise;
    private String sellerCids;
    private String shape;
    private String skuOuterIds;
    private String skuPrices;
    private String skuProperties;
    private String skuQuantities;
    private String stuffStatus;
    private Long subStock;
    private String title;
    private Long validThru;
    private Long weight;

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

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
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

    public void setFreightPayer(String freightPayer) {
        this.freightPayer = freightPayer;
    }

    public String getFreightPayer() {
        return this.freightPayer;
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

    public void setIsReplaceSku(Boolean isReplaceSku) {
        this.isReplaceSku = isReplaceSku;
    }

    public Boolean getIsReplaceSku() {
        return this.isReplaceSku;
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

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getNum() {
        return this.num;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
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

    public String getApiMethodName() {
        return "taobao.item.price.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("approve_status", this.approveStatus);
        txtParams.put("auction_point", this.auctionPoint);
        txtParams.put("auto_fill", this.autoFill);
        txtParams.put("auto_repost", this.autoRepost);
        txtParams.put("cid", this.cid);
        txtParams.put("cod_postage_id", this.codPostageId);
        txtParams.put("desc", this.desc);
        txtParams.put("ems_fee", this.emsFee);
        txtParams.put("express_fee", this.expressFee);
        txtParams.put("freight_payer", this.freightPayer);
        txtParams.put("has_discount", this.hasDiscount);
        txtParams.put("has_invoice", this.hasInvoice);
        txtParams.put("has_showcase", this.hasShowcase);
        txtParams.put("has_warranty", this.hasWarranty);
        txtParams.put("ignorewarning", this.ignorewarning);
        txtParams.put("increment", this.increment);
        txtParams.put("input_pids", this.inputPids);
        txtParams.put("input_str", this.inputStr);
        txtParams.put("is_3D", this.is3D);
        txtParams.put("is_ex", this.isEx);
        txtParams.put("is_lightning_consignment", this.isLightningConsignment);
        txtParams.put("is_replace_sku", this.isReplaceSku);
        txtParams.put("is_taobao", this.isTaobao);
        txtParams.put("is_xinpin", this.isXinpin);
        txtParams.put("lang", this.lang);
        txtParams.put("list_time", this.listTime);
        txtParams.put("location.city", this.locationCity);
        txtParams.put("location.state", this.locationState);
        txtParams.put("num", this.num);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("pic_path", this.picPath);
        txtParams.put("post_fee", this.postFee);
        txtParams.put("postage_id", this.postageId);
        txtParams.put("price", this.price);
        txtParams.put("product_id", this.productId);
        txtParams.put("property_alias", this.propertyAlias);
        txtParams.put("props", this.props);
        txtParams.put("sell_promise", this.sellPromise);
        txtParams.put("seller_cids", this.sellerCids);
        txtParams.put("shape", this.shape);
        txtParams.put("sku_outer_ids", this.skuOuterIds);
        txtParams.put("sku_prices", this.skuPrices);
        txtParams.put("sku_properties", this.skuProperties);
        txtParams.put("sku_quantities", this.skuQuantities);
        txtParams.put("stuff_status", this.stuffStatus);
        txtParams.put("sub_stock", this.subStock);
        txtParams.put("title", this.title);
        txtParams.put("valid_thru", this.validThru);
        txtParams.put("weight", this.weight);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemPriceUpdateResponse> getResponseClass() {
        return ItemPriceUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMinValue(this.cid, 0L, "cid");
        RequestCheckUtils.checkMaxLength(this.desc, 200000, "desc");
        RequestCheckUtils.checkMaxValue(this.num, 999999L, "num");
        RequestCheckUtils.checkMinValue(this.num, 0L, "num");
        RequestCheckUtils.checkNotEmpty(this.numIid, "numIid");
        RequestCheckUtils.checkMinValue(this.numIid, 1L, "numIid");
        RequestCheckUtils.checkMaxLength(this.title, 60, "title");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("image", this.image);
        return params;
    }
}


