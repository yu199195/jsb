package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WaybillDetailQueryInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbWaybillIQuerydetailResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4476878362786365378L;
    @ApiListField("error_codes")
    @ApiField("string")
    private List<String> errorCodes;
    @ApiListField("inexistent_waybill_codes")
    @ApiField("string")
    private List<String> inexistentWaybillCodes;
    @ApiField("query_success")
    private Boolean querySuccess;
    @ApiListField("waybill_details")
    @ApiField("waybill_detail_query_info")
    private List<WaybillDetailQueryInfo> waybillDetails;

    public void setErrorCodes(List<String> errorCodes) {
        this.errorCodes = errorCodes;
    }

    public List<String> getErrorCodes() {
        return this.errorCodes;
    }

    public void setInexistentWaybillCodes(List<String> inexistentWaybillCodes) {
        this.inexistentWaybillCodes = inexistentWaybillCodes;
    }

    public List<String> getInexistentWaybillCodes() {
        return this.inexistentWaybillCodes;
    }

    public void setQuerySuccess(Boolean querySuccess) {
        this.querySuccess = querySuccess;
    }

    public Boolean getQuerySuccess() {
        return this.querySuccess;
    }

    public void setWaybillDetails(List<WaybillDetailQueryInfo> waybillDetails) {
        this.waybillDetails = waybillDetails;
    }

    public List<WaybillDetailQueryInfo> getWaybillDetails() {
        return this.waybillDetails;
    }
}


