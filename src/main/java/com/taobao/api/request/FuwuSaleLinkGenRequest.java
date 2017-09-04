package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FuwuSaleLinkGenResponse;

import java.util.Map;

public class FuwuSaleLinkGenRequest
        extends BaseTaobaoRequest<FuwuSaleLinkGenResponse> {
    private String nick;
    private String paramStr;

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public void setParamStr(String paramStr) {
        this.paramStr = paramStr;
    }

    public String getParamStr() {
        return this.paramStr;
    }

    public String getApiMethodName() {
        return "taobao.fuwu.sale.link.gen";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
        txtParams.put("param_str", this.paramStr);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FuwuSaleLinkGenResponse> getResponseClass() {
        return FuwuSaleLinkGenResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.paramStr, "paramStr");
    }
}


