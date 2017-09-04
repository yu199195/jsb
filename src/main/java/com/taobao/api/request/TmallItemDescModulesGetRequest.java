package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemDescModulesGetResponse;

import java.util.Map;

public class TmallItemDescModulesGetRequest
        extends BaseTaobaoRequest<TmallItemDescModulesGetResponse> {
    private Long catId;
    private Long usrId;

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public Long getCatId() {
        return this.catId;
    }

    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    public Long getUsrId() {
        return this.usrId;
    }

    public String getApiMethodName() {
        return "tmall.item.desc.modules.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cat_id", this.catId);
        txtParams.put("usr_id", this.usrId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallItemDescModulesGetResponse> getResponseClass() {
        return TmallItemDescModulesGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.catId, "catId");
        RequestCheckUtils.checkNotEmpty(this.usrId, "usrId");
    }
}


