package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PartnerNew;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbOrderJzpartnerQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7389725758555576988L;
    @ApiListField("install_list")
    @ApiField("partner_new")
    private List<PartnerNew> installList;
    @ApiField("is_success")
    private Boolean isSuccess;
    @ApiField("result_info")
    private String resultInfo;
    @ApiListField("server_list")
    @ApiField("partner_new")
    private List<PartnerNew> serverList;

    public void setInstallList(List<PartnerNew> installList) {
        this.installList = installList;
    }

    public List<PartnerNew> getInstallList() {
        return this.installList;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public String getResultInfo() {
        return this.resultInfo;
    }

    public void setServerList(List<PartnerNew> serverList) {
        this.serverList = serverList;
    }

    public List<PartnerNew> getServerList() {
        return this.serverList;
    }
}


