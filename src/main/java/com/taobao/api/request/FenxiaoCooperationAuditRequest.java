package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoCooperationAuditResponse;

import java.util.Map;

public class FenxiaoCooperationAuditRequest
        extends BaseTaobaoRequest<FenxiaoCooperationAuditResponse> {
    private Long auditResult;
    private String productLineListAgent;
    private String productLineListDealer;
    private String remark;
    private Long requisitionId;

    public void setAuditResult(Long auditResult) {
        this.auditResult = auditResult;
    }

    public Long getAuditResult() {
        return this.auditResult;
    }

    public void setProductLineListAgent(String productLineListAgent) {
        this.productLineListAgent = productLineListAgent;
    }

    public String getProductLineListAgent() {
        return this.productLineListAgent;
    }

    public void setProductLineListDealer(String productLineListDealer) {
        this.productLineListDealer = productLineListDealer;
    }

    public String getProductLineListDealer() {
        return this.productLineListDealer;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRequisitionId(Long requisitionId) {
        this.requisitionId = requisitionId;
    }

    public Long getRequisitionId() {
        return this.requisitionId;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.cooperation.audit";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("audit_result", this.auditResult);
        txtParams.put("product_line_list_agent", this.productLineListAgent);
        txtParams.put("product_line_list_dealer", this.productLineListDealer);
        txtParams.put("remark", this.remark);
        txtParams.put("requisition_id", this.requisitionId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoCooperationAuditResponse> getResponseClass() {
        return FenxiaoCooperationAuditResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.auditResult, "auditResult");
        RequestCheckUtils.checkNotEmpty(this.remark, "remark");
        RequestCheckUtils.checkNotEmpty(this.requisitionId, "requisitionId");
    }
}


