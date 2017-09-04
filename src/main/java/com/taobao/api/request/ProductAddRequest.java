package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductAddResponse;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ProductAddRequest
        extends BaseTaobaoRequest<ProductAddResponse>
        implements TaobaoUploadRequest<ProductAddResponse> {
    private String binds;
    private Long cid;
    private String customerProps;
    private String desc;
    private String extraInfo;
    private FileItem image;
    private Boolean isPubSuite;
    private Boolean major;
    private String marketId;
    private Date marketTime;
    private String name;
    private String outerId;
    private String packingList;
    private String price;
    private String propertyAlias;
    private String props;
    private String saleProps;
    private String sellPt;
    private String suiteItemsStr;
    private Long templateId;
    private Long verticalMarket;

    public void setBinds(String binds) {
        this.binds = binds;
    }

    public String getBinds() {
        return this.binds;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setCustomerProps(String customerProps) {
        this.customerProps = customerProps;
    }

    public String getCustomerProps() {
        return this.customerProps;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public FileItem getImage() {
        return this.image;
    }

    public void setIsPubSuite(Boolean isPubSuite) {
        this.isPubSuite = isPubSuite;
    }

    public Boolean getIsPubSuite() {
        return this.isPubSuite;
    }

    public void setMajor(Boolean major) {
        this.major = major;
    }

    public Boolean getMajor() {
        return this.major;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getMarketId() {
        return this.marketId;
    }

    public void setMarketTime(Date marketTime) {
        this.marketTime = marketTime;
    }

    public Date getMarketTime() {
        return this.marketTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setPackingList(String packingList) {
        this.packingList = packingList;
    }

    public String getPackingList() {
        return this.packingList;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return this.price;
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

    public void setSaleProps(String saleProps) {
        this.saleProps = saleProps;
    }

    public String getSaleProps() {
        return this.saleProps;
    }

    public void setSellPt(String sellPt) {
        this.sellPt = sellPt;
    }

    public String getSellPt() {
        return this.sellPt;
    }

    public void setSuiteItemsStr(String suiteItemsStr) {
        this.suiteItemsStr = suiteItemsStr;
    }

    public String getSuiteItemsStr() {
        return this.suiteItemsStr;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getTemplateId() {
        return this.templateId;
    }

    public void setVerticalMarket(Long verticalMarket) {
        this.verticalMarket = verticalMarket;
    }

    public Long getVerticalMarket() {
        return this.verticalMarket;
    }

    public String getApiMethodName() {
        return "taobao.product.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("binds", this.binds);
        txtParams.put("cid", this.cid);
        txtParams.put("customer_props", this.customerProps);
        txtParams.put("desc", this.desc);
        txtParams.put("extra_info", this.extraInfo);
        txtParams.put("is_pub_suite", this.isPubSuite);
        txtParams.put("major", this.major);
        txtParams.put("market_id", this.marketId);
        txtParams.put("market_time", this.marketTime);
        txtParams.put("name", this.name);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("packing_list", this.packingList);
        txtParams.put("price", this.price);
        txtParams.put("property_alias", this.propertyAlias);
        txtParams.put("props", this.props);
        txtParams.put("sale_props", this.saleProps);
        txtParams.put("sell_pt", this.sellPt);
        txtParams.put("suite_items_str", this.suiteItemsStr);
        txtParams.put("template_id", this.templateId);
        txtParams.put("vertical_market", this.verticalMarket);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ProductAddResponse> getResponseClass() {
        return ProductAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(this.binds, 512, "binds");
        RequestCheckUtils.checkNotEmpty(this.cid, "cid");
        RequestCheckUtils.checkMaxLength(this.extraInfo, 25000, "extraInfo");
        RequestCheckUtils.checkNotEmpty(this.image, "image");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("image", this.image);
        return params;
    }
}


