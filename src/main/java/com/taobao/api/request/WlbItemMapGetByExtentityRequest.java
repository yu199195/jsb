package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemMapGetByExtentityResponse;

import java.util.Map;

public class WlbItemMapGetByExtentityRequest
        extends BaseTaobaoRequest<WlbItemMapGetByExtentityResponse> {
    private Long extEntityId;
    private String extEntityType;

    public void setExtEntityId(Long extEntityId) {
        this.extEntityId = extEntityId;
    }

    public Long getExtEntityId() {
        return this.extEntityId;
    }

    public void setExtEntityType(String extEntityType) {
        this.extEntityType = extEntityType;
    }

    public String getExtEntityType() {
        return this.extEntityType;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.map.get.by.extentity";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ext_entity_id", this.extEntityId);
        txtParams.put("ext_entity_type", this.extEntityType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbItemMapGetByExtentityResponse> getResponseClass() {
        return WlbItemMapGetByExtentityResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.extEntityId, "extEntityId");
        RequestCheckUtils.checkNotEmpty(this.extEntityType, "extEntityType");
    }
}


