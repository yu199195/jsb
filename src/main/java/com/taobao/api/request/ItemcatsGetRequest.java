package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemcatsGetResponse;

import java.util.Date;
import java.util.Map;

public class ItemcatsGetRequest
        extends BaseTaobaoRequest<ItemcatsGetResponse> {
    private String cids;
    private Date datetime;
    private String fields;
    private Long parentCid;

    public void setCids(String cids) {
        this.cids = cids;
    }

    public String getCids() {
        return this.cids;
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

    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }

    public Long getParentCid() {
        return this.parentCid;
    }

    public String getApiMethodName() {
        return "taobao.itemcats.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cids", this.cids);
        txtParams.put("datetime", this.datetime);
        txtParams.put("fields", this.fields);
        txtParams.put("parent_cid", this.parentCid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemcatsGetResponse> getResponseClass() {
        return ItemcatsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(this.cids, 1000, "cids");
        RequestCheckUtils.checkMaxListSize(this.fields, 20, "fields");
    }
}


