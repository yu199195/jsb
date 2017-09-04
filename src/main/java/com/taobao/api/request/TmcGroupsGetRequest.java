package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcGroupsGetResponse;

import java.util.Map;

public class TmcGroupsGetRequest
        extends BaseTaobaoRequest<TmcGroupsGetResponse> {
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
        return "taobao.tmc.groups.get";
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

    public Class<TmcGroupsGetResponse> getResponseClass() {
        return TmcGroupsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(this.groupNames, 20, "groupNames");
        RequestCheckUtils.checkMinValue(this.pageNo, 1L, "pageNo");
        RequestCheckUtils.checkMaxValue(this.pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(this.pageSize, 1L, "pageSize");
    }
}


