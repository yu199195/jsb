package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductSkusGetResponse;

import java.util.Map;

public class FenxiaoProductSkusGetRequest
        extends BaseTaobaoRequest<FenxiaoProductSkusGetResponse> {
    private Long productId;

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.product.skus.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("product_id", this.productId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoProductSkusGetResponse> getResponseClass() {
        return FenxiaoProductSkusGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
    }
}


