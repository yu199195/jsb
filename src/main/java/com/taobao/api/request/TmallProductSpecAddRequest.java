package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallProductSpecAddResponse;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TmallProductSpecAddRequest
        extends BaseTaobaoRequest<TmallProductSpecAddResponse>
        implements TaobaoUploadRequest<TmallProductSpecAddResponse> {
    private String barcode;
    private String certifiedPicStr;
    private String certifiedTxtStr;
    private String changeProp;
    private String customerSpecProps;
    private FileItem image;
    private Long labelPrice;
    private Date marketTime;
    private String productCode;
    private Long productId;
    private String specProps;
    private String specPropsAlias;

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBarcode() {
        return this.barcode;
    }

    public void setCertifiedPicStr(String certifiedPicStr) {
        this.certifiedPicStr = certifiedPicStr;
    }

    public String getCertifiedPicStr() {
        return this.certifiedPicStr;
    }

    public void setCertifiedTxtStr(String certifiedTxtStr) {
        this.certifiedTxtStr = certifiedTxtStr;
    }

    public String getCertifiedTxtStr() {
        return this.certifiedTxtStr;
    }

    public void setChangeProp(String changeProp) {
        this.changeProp = changeProp;
    }

    public String getChangeProp() {
        return this.changeProp;
    }

    public void setCustomerSpecProps(String customerSpecProps) {
        this.customerSpecProps = customerSpecProps;
    }

    public String getCustomerSpecProps() {
        return this.customerSpecProps;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public FileItem getImage() {
        return this.image;
    }

    public void setLabelPrice(Long labelPrice) {
        this.labelPrice = labelPrice;
    }

    public Long getLabelPrice() {
        return this.labelPrice;
    }

    public void setMarketTime(Date marketTime) {
        this.marketTime = marketTime;
    }

    public Date getMarketTime() {
        return this.marketTime;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setSpecProps(String specProps) {
        this.specProps = specProps;
    }

    public String getSpecProps() {
        return this.specProps;
    }

    public void setSpecPropsAlias(String specPropsAlias) {
        this.specPropsAlias = specPropsAlias;
    }

    public String getSpecPropsAlias() {
        return this.specPropsAlias;
    }

    public String getApiMethodName() {
        return "tmall.product.spec.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("barcode", this.barcode);
        txtParams.put("certified_pic_str", this.certifiedPicStr);
        txtParams.put("certified_txt_str", this.certifiedTxtStr);
        txtParams.put("change_prop", this.changeProp);
        txtParams.put("customer_spec_props", this.customerSpecProps);
        txtParams.put("label_price", this.labelPrice);
        txtParams.put("market_time", this.marketTime);
        txtParams.put("product_code", this.productCode);
        txtParams.put("product_id", this.productId);
        txtParams.put("spec_props", this.specProps);
        txtParams.put("spec_props_alias", this.specPropsAlias);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallProductSpecAddResponse> getResponseClass() {
        return TmallProductSpecAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.image, "image");
        RequestCheckUtils.checkMaxValue(this.labelPrice, 999999999L, "labelPrice");
        RequestCheckUtils.checkMinValue(this.labelPrice, 0L, "labelPrice");
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
        RequestCheckUtils.checkMaxLength(this.specPropsAlias, 60, "specPropsAlias");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("image", this.image);
        return params;
    }
}


