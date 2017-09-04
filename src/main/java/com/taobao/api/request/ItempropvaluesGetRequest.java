package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItempropvaluesGetResponse;

import java.util.Date;
import java.util.Map;

public class ItempropvaluesGetRequest
        extends BaseTaobaoRequest<ItempropvaluesGetResponse> {
    private String attrKeys;
    private Long cid;
    private Date datetime;
    private String fields;
    private String pvs;
    private Long type;

    public void setAttrKeys(String attrKeys) {
        this.attrKeys = attrKeys;
    }

    public String getAttrKeys() {
        return this.attrKeys;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Date getDatetime() {
        return this.datetime;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setPvs(String pvs) {
        this.pvs = pvs;
    }

    public String getPvs() {
        return this.pvs;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }

    public String getApiMethodName() {
        return "taobao.itempropvalues.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("attr_keys", this.attrKeys);
        txtParams.put("cid", this.cid);
        txtParams.put("datetime", this.datetime);
        txtParams.put("fields", this.fields);
        txtParams.put("pvs", this.pvs);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItempropvaluesGetResponse> getResponseClass() {
        return ItempropvaluesGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(this.attrKeys, 20, "attrKeys");
        RequestCheckUtils.checkNotEmpty(this.cid, "cid");
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkMaxListSize(this.fields, 20, "fields");
        RequestCheckUtils.checkMaxValue(this.type, 2L, "type");
        RequestCheckUtils.checkMinValue(this.type, 1L, "type");
    }
}


