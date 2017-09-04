package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemConsignmentPageGetResponse;

import java.util.Map;

public class WlbItemConsignmentPageGetRequest
        extends BaseTaobaoRequest<WlbItemConsignmentPageGetResponse> {
    private Long icItemId;
    private Long ownerItemId;
    private String ownerUserNick;

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

    public void setOwnerUserNick(String ownerUserNick) {
        this.ownerUserNick = ownerUserNick;
    }

    public String getOwnerUserNick() {
        return this.ownerUserNick;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.consignment.page.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ic_item_id", this.icItemId);
        txtParams.put("owner_item_id", this.ownerItemId);
        txtParams.put("owner_user_nick", this.ownerUserNick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbItemConsignmentPageGetResponse> getResponseClass() {
        return WlbItemConsignmentPageGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


