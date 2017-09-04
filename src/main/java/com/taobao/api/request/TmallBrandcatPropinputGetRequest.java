package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallBrandcatPropinputGetResponse;

import java.util.Map;

public class TmallBrandcatPropinputGetRequest
        extends BaseTaobaoRequest<TmallBrandcatPropinputGetResponse> {
    private Long brandId;
    private Long cid;
    private Long pid;

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getPid() {
        return this.pid;
    }

    public String getApiMethodName() {
        return "tmall.brandcat.propinput.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("brand_id", this.brandId);
        txtParams.put("cid", this.cid);
        txtParams.put("pid", this.pid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallBrandcatPropinputGetResponse> getResponseClass() {
        return TmallBrandcatPropinputGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.brandId, "brandId");
        RequestCheckUtils.checkNotEmpty(this.cid, "cid");
        RequestCheckUtils.checkNotEmpty(this.pid, "pid");
    }
}


