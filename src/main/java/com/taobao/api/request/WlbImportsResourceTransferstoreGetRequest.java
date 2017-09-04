package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.ReciverAddressDo;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbImportsResourceTransferstoreGetResponse;

import java.util.Map;

public class WlbImportsResourceTransferstoreGetRequest
        extends BaseTaobaoRequest<WlbImportsResourceTransferstoreGetResponse> {
    private String cids;
    private Long fromId;
    private Long resourceId;
    private String toAddress;

    public void setCids(String cids) {
        this.cids = cids;
    }

    public String getCids() {
        return this.cids;
    }

    public void setFromId(Long fromId) {
        this.fromId = fromId;
    }

    public Long getFromId() {
        return this.fromId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getResourceId() {
        return this.resourceId;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public void setToAddress(ReciverAddressDo toAddress) {
        this.toAddress = new JSONWriter(false, true).write(toAddress);
    }

    public String getToAddress() {
        return this.toAddress;
    }

    public String getApiMethodName() {
        return "taobao.wlb.imports.resource.transferstore.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cids", this.cids);
        txtParams.put("from_id", this.fromId);
        txtParams.put("resource_id", this.resourceId);
        txtParams.put("to_address", this.toAddress);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbImportsResourceTransferstoreGetResponse> getResponseClass() {
        return WlbImportsResourceTransferstoreGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.cids, "cids");
        RequestCheckUtils.checkMaxListSize(this.cids, 20, "cids");
        RequestCheckUtils.checkNotEmpty(this.resourceId, "resourceId");
    }
}


