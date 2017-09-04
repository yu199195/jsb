package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductsSearchResponse;

import java.util.Map;

public class ProductsSearchRequest
        extends BaseTaobaoRequest<ProductsSearchResponse> {
    private String barcodeStr;
    private Long cid;
    private String customerProps;
    private String fields;
    private String marketId;
    private Long pageNo;
    private Long pageSize;
    private String props;
    private String q;
    private String status;
    private String suiteItemsStr;
    private Long verticalMarket;

    public void setBarcodeStr(String barcodeStr) {
        this.barcodeStr = barcodeStr;
    }

    public String getBarcodeStr() {
        return this.barcodeStr;
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

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getMarketId() {
        return this.marketId;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public String getProps() {
        return this.props;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getQ() {
        return this.q;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setSuiteItemsStr(String suiteItemsStr) {
        this.suiteItemsStr = suiteItemsStr;
    }

    public String getSuiteItemsStr() {
        return this.suiteItemsStr;
    }

    public void setVerticalMarket(Long verticalMarket) {
        this.verticalMarket = verticalMarket;
    }

    public Long getVerticalMarket() {
        return this.verticalMarket;
    }

    public String getApiMethodName() {
        return "taobao.products.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("barcode_str", this.barcodeStr);
        txtParams.put("cid", this.cid);
        txtParams.put("customer_props", this.customerProps);
        txtParams.put("fields", this.fields);
        txtParams.put("market_id", this.marketId);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("props", this.props);
        txtParams.put("q", this.q);
        txtParams.put("status", this.status);
        txtParams.put("suite_items_str", this.suiteItemsStr);
        txtParams.put("vertical_market", this.verticalMarket);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ProductsSearchResponse> getResponseClass() {
        return ProductsSearchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkMaxLength(this.status, 20, "status");
        RequestCheckUtils.checkMinValue(this.verticalMarket, 0L, "verticalMarket");
    }
}


