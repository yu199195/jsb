package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductImageDeleteResponse;

import java.util.Map;

public class FenxiaoProductImageDeleteRequest
        extends BaseTaobaoRequest<FenxiaoProductImageDeleteResponse> {
    private Long position;
    private Long productId;
    private String properties;

    public void setPosition(Long position) {
        this.position = position;
    }

    public Long getPosition() {
        return this.position;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getProperties() {
        return this.properties;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.product.image.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("position", this.position);
        txtParams.put("product_id", this.productId);
        txtParams.put("properties", this.properties);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoProductImageDeleteResponse> getResponseClass() {
        return FenxiaoProductImageDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.position, "position");
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
    }
}


