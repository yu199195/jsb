package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductGradepriceGetResponse;

import java.util.Map;

public class FenxiaoProductGradepriceGetRequest
        extends BaseTaobaoRequest<FenxiaoProductGradepriceGetResponse> {
    private Long productId;
    private Long skuId;
    private Long tradeType;

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setTradeType(Long tradeType) {
        this.tradeType = tradeType;
    }

    public Long getTradeType() {
        return this.tradeType;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.product.gradeprice.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("product_id", this.productId);
        txtParams.put("sku_id", this.skuId);
        txtParams.put("trade_type", this.tradeType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoProductGradepriceGetResponse> getResponseClass() {
        return FenxiaoProductGradepriceGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
    }
}


