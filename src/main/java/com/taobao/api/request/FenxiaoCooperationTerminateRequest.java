package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoCooperationTerminateResponse;

import java.util.Map;

public class FenxiaoCooperationTerminateRequest
        extends BaseTaobaoRequest<FenxiaoCooperationTerminateResponse> {
    private Long cooperateId;
    private Long endRemainDays;
    private String endRemark;

    public void setCooperateId(Long cooperateId) {
        this.cooperateId = cooperateId;
    }

    public Long getCooperateId() {
        return this.cooperateId;
    }

    public void setEndRemainDays(Long endRemainDays) {
        this.endRemainDays = endRemainDays;
    }

    public Long getEndRemainDays() {
        return this.endRemainDays;
    }

    public void setEndRemark(String endRemark) {
        this.endRemark = endRemark;
    }

    public String getEndRemark() {
        return this.endRemark;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.cooperation.terminate";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cooperate_id", this.cooperateId);
        txtParams.put("end_remain_days", this.endRemainDays);
        txtParams.put("end_remark", this.endRemark);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoCooperationTerminateResponse> getResponseClass() {
        return FenxiaoCooperationTerminateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.cooperateId, "cooperateId");
        RequestCheckUtils.checkNotEmpty(this.endRemainDays, "endRemainDays");
        RequestCheckUtils.checkNotEmpty(this.endRemark, "endRemark");
        RequestCheckUtils.checkMaxLength(this.endRemark, 2000, "endRemark");
    }
}


