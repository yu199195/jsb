package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LogisticsPartner;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class LogisticsPartnersGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4724482695434363766L;
    @ApiListField("logistics_partners")
    @ApiField("logistics_partner")
    private List<LogisticsPartner> logisticsPartners;

    public void setLogisticsPartners(List<LogisticsPartner> logisticsPartners) {
        this.logisticsPartners = logisticsPartners;
    }

    public List<LogisticsPartner> getLogisticsPartners() {
        return this.logisticsPartners;
    }
}


