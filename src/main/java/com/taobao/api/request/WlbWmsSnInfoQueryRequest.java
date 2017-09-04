package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWmsSnInfoQueryResponse;

import java.util.Map;

public class WlbWmsSnInfoQueryRequest
        extends BaseTaobaoRequest<WlbWmsSnInfoQueryResponse> {
    private String orderCode;
    private Long orderCodeType;
    private Long pageIndex;

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCodeType(Long orderCodeType) {
        this.orderCodeType = orderCodeType;
    }

    public Long getOrderCodeType() {
        return this.orderCodeType;
    }

    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Long getPageIndex() {
        return this.pageIndex;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.sn.info.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("order_code", this.orderCode);
        txtParams.put("order_code_type", this.orderCodeType);
        txtParams.put("page_index", this.pageIndex);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsSnInfoQueryResponse> getResponseClass() {
        return WlbWmsSnInfoQueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.orderCode, "orderCode");
        RequestCheckUtils.checkNotEmpty(this.orderCodeType, "orderCodeType");
        RequestCheckUtils.checkNotEmpty(this.pageIndex, "pageIndex");
    }
}


