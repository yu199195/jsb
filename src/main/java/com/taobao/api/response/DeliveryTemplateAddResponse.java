package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DeliveryTemplate;
import com.taobao.api.internal.mapping.ApiField;

public class DeliveryTemplateAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3811281592121512371L;
    @ApiField("delivery_template")
    private DeliveryTemplate deliveryTemplate;

    public void setDeliveryTemplate(DeliveryTemplate deliveryTemplate) {
        this.deliveryTemplate = deliveryTemplate;
    }

    public DeliveryTemplate getDeliveryTemplate() {
        return this.deliveryTemplate;
    }
}


