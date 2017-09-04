package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SkusQuantityUpdateResponse;

import java.util.Map;

public class SkusQuantityUpdateRequest
        extends BaseTaobaoRequest<SkusQuantityUpdateResponse> {
    private Long numIid;
    private String outeridQuantities;
    private String skuidQuantities;
    private Long type;

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setOuteridQuantities(String outeridQuantities) {
        this.outeridQuantities = outeridQuantities;
    }

    public String getOuteridQuantities() {
        return this.outeridQuantities;
    }

    public void setSkuidQuantities(String skuidQuantities) {
        this.skuidQuantities = skuidQuantities;
    }

    public String getSkuidQuantities() {
        return this.skuidQuantities;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }

    public String getApiMethodName() {
        return "taobao.skus.quantity.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("num_iid", this.numIid);
        txtParams.put("outerid_quantities", this.outeridQuantities);
        txtParams.put("skuid_quantities", this.skuidQuantities);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<SkusQuantityUpdateResponse> getResponseClass() {
        return SkusQuantityUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.numIid, "numIid");
    }
}


