package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ShopUpdateResponse;

import java.util.Map;

public class ShopUpdateRequest
        extends BaseTaobaoRequest<ShopUpdateResponse> {
    private String bulletin;
    private String desc;
    private String title;

    public void setBulletin(String bulletin) {
        this.bulletin = bulletin;
    }

    public String getBulletin() {
        return this.bulletin;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getApiMethodName() {
        return "taobao.shop.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("bulletin", this.bulletin);
        txtParams.put("desc", this.desc);
        txtParams.put("title", this.title);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ShopUpdateResponse> getResponseClass() {
        return ShopUpdateResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


