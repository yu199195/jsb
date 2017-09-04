package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Duty
        extends TaobaoObject {
    private static final long serialVersionUID = 2893217827782526989L;
    @ApiField("duty_id")
    private Long dutyId;
    @ApiField("duty_level")
    private Long dutyLevel;
    @ApiField("duty_name")
    private String dutyName;

    public Long getDutyId() {
        return this.dutyId;
    }

    public void setDutyId(Long dutyId) {
        this.dutyId = dutyId;
    }

    public Long getDutyLevel() {
        return this.dutyLevel;
    }

    public void setDutyLevel(Long dutyLevel) {
        this.dutyLevel = dutyLevel;
    }

    public String getDutyName() {
        return this.dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }
}


