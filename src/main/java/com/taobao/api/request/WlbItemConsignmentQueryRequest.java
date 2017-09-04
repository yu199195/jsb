package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemConsignmentQueryResponse;

import java.util.Date;
import java.util.Map;

public class WlbItemConsignmentQueryRequest
        extends BaseTaobaoRequest<WlbItemConsignmentQueryResponse> {
    private Date authorizeEndTime;
    private Date authorizeStartTime;
    private String ownerUserNick;
    private Long pageNo;
    private Long pageSize;

    public void setAuthorizeEndTime(Date authorizeEndTime) {
        this.authorizeEndTime = authorizeEndTime;
    }

    public Date getAuthorizeEndTime() {
        return this.authorizeEndTime;
    }

    public void setAuthorizeStartTime(Date authorizeStartTime) {
        this.authorizeStartTime = authorizeStartTime;
    }

    public Date getAuthorizeStartTime() {
        return this.authorizeStartTime;
    }

    public void setOwnerUserNick(String ownerUserNick) {
        this.ownerUserNick = ownerUserNick;
    }

    public String getOwnerUserNick() {
        return this.ownerUserNick;
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
        return "taobao.wlb.item.consignment.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("authorize_end_time", this.authorizeEndTime);
        txtParams.put("authorize_start_time", this.authorizeStartTime);
        txtParams.put("owner_user_nick", this.ownerUserNick);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbItemConsignmentQueryResponse> getResponseClass() {
        return WlbItemConsignmentQueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.pageNo, "pageNo");
        RequestCheckUtils.checkNotEmpty(this.pageSize, "pageSize");
    }
}


