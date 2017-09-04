package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class Sku
        extends TaobaoObject {
    private static final long serialVersionUID = 6525881799872182428L;
    @ApiField("barcode")
    private String barcode;
    @ApiField("change_prop")
    private String changeProp;
    @ApiField("created")
    private String created;
    @ApiField("extra_id")
    private Long extraId;
    @ApiField("gmt_modified")
    private Date gmtModified;
    @ApiField("iid")
    private String iid;
    @ApiField("memo")
    private String memo;
    @ApiField("modified")
    private String modified;
    @ApiField("num_iid")
    private Long numIid;
    @ApiField("outer_id")
    private String outerId;
    @ApiField("price")
    private String price;
    @ApiField("properties")
    private String properties;
    @ApiField("properties_name")
    private String propertiesName;
    @ApiField("quantity")
    private Long quantity;
    @ApiField("sku_delivery_time")
    private String skuDeliveryTime;
    @ApiField("sku_id")
    private Long skuId;
    @ApiField("sku_spec_id")
    private Long skuSpecId;
    @ApiField("status")
    private String status;
    @ApiField("with_hold_quantity")
    private Long withHoldQuantity;

    public String getBarcode() {
        return this.barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getChangeProp() {
        return this.changeProp;
    }

    public void setChangeProp(String changeProp) {
        this.changeProp = changeProp;
    }

    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Long getExtraId() {
        return this.extraId;
    }

    public void setExtraId(Long extraId) {
        this.extraId = extraId;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getIid() {
        return this.iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getModified() {
        return this.modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProperties() {
        return this.properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getPropertiesName() {
        return this.propertiesName;
    }

    public void setPropertiesName(String propertiesName) {
        this.propertiesName = propertiesName;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getSkuDeliveryTime() {
        return this.skuDeliveryTime;
    }

    public void setSkuDeliveryTime(String skuDeliveryTime) {
        this.skuDeliveryTime = skuDeliveryTime;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuSpecId() {
        return this.skuSpecId;
    }

    public void setSkuSpecId(Long skuSpecId) {
        this.skuSpecId = skuSpecId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getWithHoldQuantity() {
        return this.withHoldQuantity;
    }

    public void setWithHoldQuantity(Long withHoldQuantity) {
        this.withHoldQuantity = withHoldQuantity;
    }
}


