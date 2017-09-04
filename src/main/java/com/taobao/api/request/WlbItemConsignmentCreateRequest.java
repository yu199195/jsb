package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemConsignmentCreateResponse;

import java.util.Map;

public class WlbItemConsignmentCreateRequest
        extends BaseTaobaoRequest<WlbItemConsignmentCreateResponse> {
    private Long number;
    private Long ownerItemId;
    private Long ruleId;

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getNumber() {
        return this.number;
    }

    public void setOwnerItemId(Long ownerItemId) {
        this.ownerItemId = ownerItemId;
    }

    public Long getOwnerItemId() {
        return this.ownerItemId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public Long getRuleId() {
        return this.ruleId;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.consignment.create";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("number", this.number);
        txtParams.put("owner_item_id", this.ownerItemId);
        txtParams.put("rule_id", this.ruleId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbItemConsignmentCreateResponse> getResponseClass() {
        return WlbItemConsignmentCreateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.number, "number");
        RequestCheckUtils.checkNotEmpty(this.ownerItemId, "ownerItemId");
        RequestCheckUtils.checkNotEmpty(this.ruleId, "ruleId");
    }
}


