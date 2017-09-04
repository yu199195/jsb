package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoCooperationUpdateResponse;

import java.util.Map;

public class FenxiaoCooperationUpdateRequest
        extends BaseTaobaoRequest<FenxiaoCooperationUpdateResponse> {
    private Long distributorId;
    private Long gradeId;
    private String tradeType;

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    public Long getDistributorId() {
        return this.distributorId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public Long getGradeId() {
        return this.gradeId;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.cooperation.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("distributor_id", this.distributorId);
        txtParams.put("grade_id", this.gradeId);
        txtParams.put("trade_type", this.tradeType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoCooperationUpdateResponse> getResponseClass() {
        return FenxiaoCooperationUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.distributorId, "distributorId");
        RequestCheckUtils.checkNotEmpty(this.gradeId, "gradeId");
    }
}


