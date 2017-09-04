package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SellercatsListGetResponse;

import java.util.Map;

public class SellercatsListGetRequest
        extends BaseTaobaoRequest<SellercatsListGetResponse> {
    private String fields;
    private String nick;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public String getApiMethodName() {
        return "taobao.sellercats.list.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("nick", this.nick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<SellercatsListGetResponse> getResponseClass() {
        return SellercatsListGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(this.fields, 20, "fields");
        RequestCheckUtils.checkNotEmpty(this.nick, "nick");
    }
}


