package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DeliveryTemplate;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class DeliveryTemplatesGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1259895385366391378L;
    @ApiListField("delivery_templates")
    @ApiField("delivery_template")
    private List<DeliveryTemplate> deliveryTemplates;
    @ApiField("total_results")
    private Long totalResults;

    public void setDeliveryTemplates(List<DeliveryTemplate> deliveryTemplates) {
        this.deliveryTemplates = deliveryTemplates;
    }

    public List<DeliveryTemplate> getDeliveryTemplates() {
        return this.deliveryTemplates;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


