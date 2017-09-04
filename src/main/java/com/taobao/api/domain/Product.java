package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class Product
        extends TaobaoObject {
    private static final long serialVersionUID = 7151639891612214539L;
    @ApiField("barcode_str")
    private String barcodeStr;
    @ApiField("binds")
    private String binds;
    @ApiField("binds_str")
    private String bindsStr;
    @ApiField("cat_name")
    private String catName;
    @ApiField("cid")
    private Long cid;
    @ApiField("collect_num")
    private Long collectNum;
    @ApiField("commodity_id")
    private Long commodityId;
    @ApiField("created")
    private Date created;
    @ApiField("cspu_feature")
    private String cspuFeature;
    @ApiField("customer_props")
    private String customerProps;
    @ApiField("desc")
    private String desc;
    @ApiField("is_suite_effective")
    private Boolean isSuiteEffective;
    @ApiField("level")
    private Long level;
    @ApiField("modified")
    private Date modified;
    @ApiField("name")
    private String name;
    @ApiField("outer_id")
    private String outerId;
    @ApiField("pic_path")
    private String picPath;
    @ApiField("pic_url")
    private String picUrl;
    @ApiField("price")
    private String price;
    @ApiListField("product_extra_infos")
    @ApiField("product_extra_info")
    private List<ProductExtraInfo> productExtraInfos;
    @ApiField("product_id")
    private Long productId;
    @ApiListField("product_imgs")
    @ApiField("product_img")
    private List<ProductImg> productImgs;
    @ApiListField("product_prop_imgs")
    @ApiField("product_prop_img")
    private List<ProductPropImg> productPropImgs;
    @ApiField("property_alias")
    private String propertyAlias;
    @ApiField("props")
    private String props;
    @ApiField("props_str")
    private String propsStr;
    @ApiField("rate_num")
    private Long rateNum;
    @ApiField("sale_num")
    private Long saleNum;
    @ApiField("sale_props")
    private String saleProps;
    @ApiField("sale_props_str")
    private String salePropsStr;
    @ApiField("sell_pt")
    private String sellPt;
    @ApiField("shop_price")
    private String shopPrice;
    @ApiField("standard_price")
    private String standardPrice;
    @ApiField("status")
    private Long status;
    @ApiField("suite_items_str")
    private String suiteItemsStr;
    @ApiField("template_id")
    private Long templateId;
    @ApiField("tsc")
    private String tsc;
    @ApiField("vertical_market")
    private Long verticalMarket;

    public String getBarcodeStr() {
        return this.barcodeStr;
    }

    public void setBarcodeStr(String barcodeStr) {
        this.barcodeStr = barcodeStr;
    }

    public String getBinds() {
        return this.binds;
    }

    public void setBinds(String binds) {
        this.binds = binds;
    }

    public String getBindsStr() {
        return this.bindsStr;
    }

    public void setBindsStr(String bindsStr) {
        this.bindsStr = bindsStr;
    }

    public String getCatName() {
        return this.catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCollectNum() {
        return this.collectNum;
    }

    public void setCollectNum(Long collectNum) {
        this.collectNum = collectNum;
    }

    public Long getCommodityId() {
        return this.commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCspuFeature() {
        return this.cspuFeature;
    }

    public void setCspuFeature(String cspuFeature) {
        this.cspuFeature = cspuFeature;
    }

    public String getCustomerProps() {
        return this.customerProps;
    }

    public void setCustomerProps(String customerProps) {
        this.customerProps = customerProps;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Boolean getIsSuiteEffective() {
        return this.isSuiteEffective;
    }

    public void setIsSuiteEffective(Boolean isSuiteEffective) {
        this.isSuiteEffective = isSuiteEffective;
    }

    public Long getLevel() {
        return this.level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<ProductExtraInfo> getProductExtraInfos() {
        return this.productExtraInfos;
    }

    public void setProductExtraInfos(List<ProductExtraInfo> productExtraInfos) {
        this.productExtraInfos = productExtraInfos;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public List<ProductImg> getProductImgs() {
        return this.productImgs;
    }

    public void setProductImgs(List<ProductImg> productImgs) {
        this.productImgs = productImgs;
    }

    public List<ProductPropImg> getProductPropImgs() {
        return this.productPropImgs;
    }

    public void setProductPropImgs(List<ProductPropImg> productPropImgs) {
        this.productPropImgs = productPropImgs;
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

    public String getPropsStr() {
        return this.propsStr;
    }

    public void setPropsStr(String propsStr) {
        this.propsStr = propsStr;
    }

    public Long getRateNum() {
        return this.rateNum;
    }

    public void setRateNum(Long rateNum) {
        this.rateNum = rateNum;
    }

    public Long getSaleNum() {
        return this.saleNum;
    }

    public void setSaleNum(Long saleNum) {
        this.saleNum = saleNum;
    }

    public String getSaleProps() {
        return this.saleProps;
    }

    public void setSaleProps(String saleProps) {
        this.saleProps = saleProps;
    }

    public String getSalePropsStr() {
        return this.salePropsStr;
    }

    public void setSalePropsStr(String salePropsStr) {
        this.salePropsStr = salePropsStr;
    }

    public String getSellPt() {
        return this.sellPt;
    }

    public void setSellPt(String sellPt) {
        this.sellPt = sellPt;
    }

    public String getShopPrice() {
        return this.shopPrice;
    }

    public void setShopPrice(String shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getStandardPrice() {
        return this.standardPrice;
    }

    public void setStandardPrice(String standardPrice) {
        this.standardPrice = standardPrice;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getSuiteItemsStr() {
        return this.suiteItemsStr;
    }

    public void setSuiteItemsStr(String suiteItemsStr) {
        this.suiteItemsStr = suiteItemsStr;
    }

    public Long getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getTsc() {
        return this.tsc;
    }

    public void setTsc(String tsc) {
        this.tsc = tsc;
    }

    public Long getVerticalMarket() {
        return this.verticalMarket;
    }

    public void setVerticalMarket(Long verticalMarket) {
        this.verticalMarket = verticalMarket;
    }
}


