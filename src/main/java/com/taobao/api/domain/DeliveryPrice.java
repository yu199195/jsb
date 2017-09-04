package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class DeliveryPrice
        extends TaobaoObject {
    private static final long serialVersionUID = 7471447341543145414L;
    @ApiField("basic_weight")
    private Long basicWeight;
    @ApiField("basic_weight_price")
    private Long basicWeightPrice;
    @ApiField("step_weight")
    private Long stepWeight;
    @ApiField("step_weight_price")
    private Long stepWeightPrice;

    public Long getBasicWeight() {
        return this.basicWeight;
    }

    public void setBasicWeight(Long basicWeight) {
        this.basicWeight = basicWeight;
    }

    public Long getBasicWeightPrice() {
        return this.basicWeightPrice;
    }

    public void setBasicWeightPrice(Long basicWeightPrice) {
        this.basicWeightPrice = basicWeightPrice;
    }

    public Long getStepWeight() {
        return this.stepWeight;
    }

    public void setStepWeight(Long stepWeight) {
        this.stepWeight = stepWeight;
    }

    public Long getStepWeightPrice() {
        return this.stepWeightPrice;
    }

    public void setStepWeightPrice(Long stepWeightPrice) {
        this.stepWeightPrice = stepWeightPrice;
    }
}


