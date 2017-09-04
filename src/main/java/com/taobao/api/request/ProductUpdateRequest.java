package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductUpdateResponse;

import java.util.HashMap;
import java.util.Map;

public class ProductUpdateRequest
        extends BaseTaobaoRequest<ProductUpdateResponse>
        implements TaobaoUploadRequest<ProductUpdateResponse> {
    private String binds;
    private String desc;
    private String extraInfo;
    private FileItem image;
    private Boolean major;
    private String marketId;
    private String name;
    private String nativeUnkeyprops;
    private String outerId;
    private String packingList;
    private String price;
    private Long productId;
    private String saleProps;
    private String sellPt;

    public void setBinds(String binds) {
        this.binds = binds;
    }

    public String getBinds() {
        return this.binds;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNativeUnkeyprops(String nativeUnkeyprops) {
        this.nativeUnkeyprops = nativeUnkeyprops;
    }

    public String getNativeUnkeyprops() {
        return this.nativeUnkeyprops;
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

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
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

    public String getApiMethodName() {
        return "taobao.product.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("binds", this.binds);
        txtParams.put("desc", this.desc);
        txtParams.put("extra_info", this.extraInfo);
        txtParams.put("major", this.major);
        txtParams.put("market_id", this.marketId);
        txtParams.put("name", this.name);
        txtParams.put("native_unkeyprops", this.nativeUnkeyprops);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("packing_list", this.packingList);
        txtParams.put("price", this.price);
        txtParams.put("product_id", this.productId);
        txtParams.put("sale_props", this.saleProps);
        txtParams.put("sell_pt", this.sellPt);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ProductUpdateResponse> getResponseClass() {
        return ProductUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(this.extraInfo, 25000, "extraInfo");
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("image", this.image);
        return params;
    }
}


