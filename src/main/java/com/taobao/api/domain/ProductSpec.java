package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class ProductSpec
        extends TaobaoObject {
    private static final long serialVersionUID = 1512219524952249363L;
    @ApiField("barcode")
    private String barcode;
    @ApiField("brand_id")
    private Long brandId;
    @ApiListField("certified_pics")
    @ApiField("cert_pic_info")
    private List<CertPicInfo> certifiedPics;
    @ApiListField("certified_txts")
    @ApiField("cert_txt_info")
    private List<CertTxtInfo> certifiedTxts;
    @ApiField("change_prop")
    private String changeProp;
    @ApiField("custome_props_name")
    private String customePropsName;
    @ApiField("label_price")
    private Long labelPrice;
    @ApiField("market_time")
    private Date marketTime;
    @ApiField("number")
    private Long number;
    @ApiField("pic_url")
    private String picUrl;
    @ApiField("product_code")
    private String productCode;
    @ApiField("product_id")
    private Long productId;
    @ApiField("spec_id")
    private Long specId;
    @ApiField("spec_props")
    private String specProps;
    @ApiField("spec_props_alias")
    private String specPropsAlias;
    @ApiField("status")
    private Long status;

    public String getBarcode() {
        return this.barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public List<CertPicInfo> getCertifiedPics() {
        return this.certifiedPics;
    }

    public void setCertifiedPics(List<CertPicInfo> certifiedPics) {
        this.certifiedPics = certifiedPics;
    }

    public List<CertTxtInfo> getCertifiedTxts() {
        return this.certifiedTxts;
    }

    public void setCertifiedTxts(List<CertTxtInfo> certifiedTxts) {
        this.certifiedTxts = certifiedTxts;
    }

    public String getChangeProp() {
        return this.changeProp;
    }

    public void setChangeProp(String changeProp) {
        this.changeProp = changeProp;
    }

    public String getCustomePropsName() {
        return this.customePropsName;
    }

    public void setCustomePropsName(String customePropsName) {
        this.customePropsName = customePropsName;
    }

    public Long getLabelPrice() {
        return this.labelPrice;
    }

    public void setLabelPrice(Long labelPrice) {
        this.labelPrice = labelPrice;
    }

    public Date getMarketTime() {
        return this.marketTime;
    }

    public void setMarketTime(Date marketTime) {
        this.marketTime = marketTime;
    }

    public Long getNumber() {
        return this.number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSpecId() {
        return this.specId;
    }

    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    public String getSpecProps() {
        return this.specProps;
    }

    public void setSpecProps(String specProps) {
        this.specProps = specProps;
    }

    public String getSpecPropsAlias() {
        return this.specPropsAlias;
    }

    public void setSpecPropsAlias(String specPropsAlias) {
        this.specPropsAlias = specPropsAlias;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}


