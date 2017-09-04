package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductcatDeleteResponse;

import java.util.Map;

public class FenxiaoProductcatDeleteRequest
        extends BaseTaobaoRequest<FenxiaoProductcatDeleteResponse> {
    private Long productLineId;

    public void setProductLineId(Long productLineId) {
        this.productLineId = productLineId;
    }

    public Long getProductLineId() {
        return this.productLineId;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.productcat.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("product_line_id", this.productLineId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoProductcatDeleteResponse> getResponseClass() {
        return FenxiaoProductcatDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.productLineId, "productLineId");
    }
}


