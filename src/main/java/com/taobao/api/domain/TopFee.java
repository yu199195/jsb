package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class TopFee
        extends TaobaoObject {
    private static final long serialVersionUID = 1663579396655572392L;
    @ApiField("add_fee")
    private String addFee;
    @ApiField("add_standard")
    private String addStandard;
    @ApiField("destination")
    private String destination;
    @ApiField("service_type")
    private String serviceType;
    @ApiField("start_fee")
    private String startFee;
    @ApiField("start_standard")
    private String startStandard;

    public String getAddFee() {
        return this.addFee;
    }

    public void setAddFee(String addFee) {
        this.addFee = addFee;
    }

    public String getAddStandard() {
        return this.addStandard;
    }

    public void setAddStandard(String addStandard) {
        this.addStandard = addStandard;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStartFee() {
        return this.startFee;
    }

    public void setStartFee(String startFee) {
        this.startFee = startFee;
    }

    public String getStartStandard() {
        return this.startStandard;
    }

    public void setStartStandard(String startStandard) {
        this.startStandard = startStandard;
    }
}


