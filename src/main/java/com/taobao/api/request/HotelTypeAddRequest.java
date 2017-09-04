package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelTypeAddResponse;

import java.util.Map;

public class HotelTypeAddRequest
        extends BaseTaobaoRequest<HotelTypeAddResponse> {
    private Long hid;
    private String name;
    private String outerId;
    private String siteParam;

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setSiteParam(String siteParam) {
        this.siteParam = siteParam;
    }

    public String getSiteParam() {
        return this.siteParam;
    }

    public String getApiMethodName() {
        return "taobao.hotel.type.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("hid", this.hid);
        txtParams.put("name", this.name);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("site_param", this.siteParam);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<HotelTypeAddResponse> getResponseClass() {
        return HotelTypeAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.hid, "hid");
        RequestCheckUtils.checkMinValue(this.hid, 0L, "hid");
        RequestCheckUtils.checkNotEmpty(this.name, "name");
        RequestCheckUtils.checkMaxLength(this.name, 30, "name");
        RequestCheckUtils.checkMaxLength(this.siteParam, 100, "siteParam");
    }
}


