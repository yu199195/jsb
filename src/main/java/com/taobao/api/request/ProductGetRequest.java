package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductGetResponse;

import java.util.Map;

public class ProductGetRequest
        extends BaseTaobaoRequest<ProductGetResponse> {
    private Long cid;
    private String customerProps;
    private String fields;
    private String marketId;
    private Long productId;
    private String props;

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

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public String getProps() {
        return this.props;
    }

    public String getApiMethodName() {
        return "taobao.product.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cid", this.cid);
        txtParams.put("customer_props", this.customerProps);
        txtParams.put("fields", this.fields);
        txtParams.put("market_id", this.marketId);
        txtParams.put("product_id", this.productId);
        txtParams.put("props", this.props);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ProductGetResponse> getResponseClass() {
        return ProductGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
    }
}


