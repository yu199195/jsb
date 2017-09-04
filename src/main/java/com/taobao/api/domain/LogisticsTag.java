package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class LogisticsTag
        extends TaobaoObject {
    private static final long serialVersionUID = 6862156731564228919L;
    @ApiListField("logistic_service_tag_list")
    @ApiField("logistic_service_tag")
    private List<LogisticServiceTag> logisticServiceTagList;
    @ApiField("order_id")
    private String orderId;

    public List<LogisticServiceTag> getLogisticServiceTagList() {
        return this.logisticServiceTagList;
    }

    public void setLogisticServiceTagList(List<LogisticServiceTag> logisticServiceTagList) {
        this.logisticServiceTagList = logisticServiceTagList;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}


