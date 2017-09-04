package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductGradepriceUpdateResponse;

import java.util.Map;

public class FenxiaoProductGradepriceUpdateRequest
        extends BaseTaobaoRequest<FenxiaoProductGradepriceUpdateResponse> {
    private String ids;
    private String prices;
    private Long productId;
    private Long skuId;
    private String targetType;
    private String tradeType;

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getIds() {
        return this.ids;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public String getPrices() {
        return this.prices;
    }

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

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getTargetType() {
        return this.targetType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.product.gradeprice.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ids", this.ids);
        txtParams.put("prices", this.prices);
        txtParams.put("product_id", this.productId);
        txtParams.put("sku_id", this.skuId);
        txtParams.put("target_type", this.targetType);
        txtParams.put("trade_type", this.tradeType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoProductGradepriceUpdateResponse> getResponseClass() {
        return FenxiaoProductGradepriceUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.ids, "ids");
        RequestCheckUtils.checkMaxListSize(this.ids, 200, "ids");
        RequestCheckUtils.checkNotEmpty(this.prices, "prices");
        RequestCheckUtils.checkMaxListSize(this.prices, 200, "prices");
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
        RequestCheckUtils.checkNotEmpty(this.targetType, "targetType");
    }
}


