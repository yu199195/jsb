package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemConsignmentDeleteResponse;

import java.util.Map;

public class WlbItemConsignmentDeleteRequest
        extends BaseTaobaoRequest<WlbItemConsignmentDeleteResponse> {
    private Long icItemId;
    private Long ownerItemId;
    private Long ruleId;

    public void setIcItemId(Long icItemId) {
        this.icItemId = icItemId;
    }

    public Long getIcItemId() {
        return this.icItemId;
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
        return "taobao.wlb.item.consignment.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ic_item_id", this.icItemId);
        txtParams.put("owner_item_id", this.ownerItemId);
        txtParams.put("rule_id", this.ruleId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbItemConsignmentDeleteResponse> getResponseClass() {
        return WlbItemConsignmentDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.icItemId, "icItemId");
        RequestCheckUtils.checkNotEmpty(this.ownerItemId, "ownerItemId");
        RequestCheckUtils.checkNotEmpty(this.ruleId, "ruleId");
    }
}


