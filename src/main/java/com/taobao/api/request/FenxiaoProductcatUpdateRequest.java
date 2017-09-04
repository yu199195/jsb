package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductcatUpdateResponse;

import java.util.Map;

public class FenxiaoProductcatUpdateRequest
        extends BaseTaobaoRequest<FenxiaoProductcatUpdateResponse> {
    private Long agentCostPercent;
    private Long dealerCostPercent;
    private String name;
    private Long productLineId;
    private Long retailHighPercent;
    private Long retailLowPercent;

    public void setAgentCostPercent(Long agentCostPercent) {
        this.agentCostPercent = agentCostPercent;
    }

    public Long getAgentCostPercent() {
        return this.agentCostPercent;
    }

    public void setDealerCostPercent(Long dealerCostPercent) {
        this.dealerCostPercent = dealerCostPercent;
    }

    public Long getDealerCostPercent() {
        return this.dealerCostPercent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setProductLineId(Long productLineId) {
        this.productLineId = productLineId;
    }

    public Long getProductLineId() {
        return this.productLineId;
    }

    public void setRetailHighPercent(Long retailHighPercent) {
        this.retailHighPercent = retailHighPercent;
    }

    public Long getRetailHighPercent() {
        return this.retailHighPercent;
    }

    public void setRetailLowPercent(Long retailLowPercent) {
        this.retailLowPercent = retailLowPercent;
    }

    public Long getRetailLowPercent() {
        return this.retailLowPercent;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.productcat.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("agent_cost_percent", this.agentCostPercent);
        txtParams.put("dealer_cost_percent", this.dealerCostPercent);
        txtParams.put("name", this.name);
        txtParams.put("product_line_id", this.productLineId);
        txtParams.put("retail_high_percent", this.retailHighPercent);
        txtParams.put("retail_low_percent", this.retailLowPercent);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoProductcatUpdateResponse> getResponseClass() {
        return FenxiaoProductcatUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(this.agentCostPercent, 99999L, "agentCostPercent");
        RequestCheckUtils.checkMinValue(this.agentCostPercent, 100L, "agentCostPercent");
        RequestCheckUtils.checkMaxValue(this.dealerCostPercent, 99999L, "dealerCostPercent");
        RequestCheckUtils.checkMinValue(this.dealerCostPercent, 100L, "dealerCostPercent");
        RequestCheckUtils.checkMaxLength(this.name, 10, "name");
        RequestCheckUtils.checkNotEmpty(this.productLineId, "productLineId");
        RequestCheckUtils.checkMaxValue(this.retailHighPercent, 99999L, "retailHighPercent");
        RequestCheckUtils.checkMinValue(this.retailHighPercent, 100L, "retailHighPercent");
        RequestCheckUtils.checkMaxValue(this.retailLowPercent, 99999L, "retailLowPercent");
        RequestCheckUtils.checkMinValue(this.retailLowPercent, 100L, "retailLowPercent");
    }
}


