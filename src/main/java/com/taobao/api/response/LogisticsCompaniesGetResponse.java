package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LogisticsCompany;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class LogisticsCompaniesGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5882129271862418759L;
    @ApiListField("logistics_companies")
    @ApiField("logistics_company")
    private List<LogisticsCompany> logisticsCompanies;

    public void setLogisticsCompanies(List<LogisticsCompany> logisticsCompanies) {
        this.logisticsCompanies = logisticsCompanies;
    }

    public List<LogisticsCompany> getLogisticsCompanies() {
        return this.logisticsCompanies;
    }
}


