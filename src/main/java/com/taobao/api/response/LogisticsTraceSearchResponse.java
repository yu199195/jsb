package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TransitStepInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class LogisticsTraceSearchResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1758469324275495981L;
    @ApiField("company_name")
    private String companyName;
    @ApiField("out_sid")
    private String outSid;
    @ApiField("status")
    private String status;
    @ApiField("tid")
    private Long tid;
    @ApiListField("trace_list")
    @ApiField("transit_step_info")
    private List<TransitStepInfo> traceList;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setOutSid(String outSid) {
        this.outSid = outSid;
    }

    public String getOutSid() {
        return this.outSid;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public void setTraceList(List<TransitStepInfo> traceList) {
        this.traceList = traceList;
    }

    public List<TransitStepInfo> getTraceList() {
        return this.traceList;
    }
}


