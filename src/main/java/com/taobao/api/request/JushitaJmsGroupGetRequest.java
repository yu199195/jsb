package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JushitaJmsGroupGetResponse;

import java.util.Map;

public class JushitaJmsGroupGetRequest
        extends BaseTaobaoRequest<JushitaJmsGroupGetResponse> {
    private String groupNames;
    private Long pageNo;
    private Long pageSize;

    public void setGroupNames(String groupNames) {
        this.groupNames = groupNames;
    }

    public String getGroupNames() {
        return this.groupNames;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getApiMethodName() {
        return "taobao.jushita.jms.group.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("group_names", this.groupNames);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<JushitaJmsGroupGetResponse> getResponseClass() {
        return JushitaJmsGroupGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(this.groupNames, 20, "groupNames");
    }
}


