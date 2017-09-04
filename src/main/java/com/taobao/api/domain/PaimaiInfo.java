package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class PaimaiInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 7667614661254491781L;
    @ApiField("deposit")
    private Long deposit;
    @ApiField("interval")
    private Long interval;
    @ApiField("mode")
    private Long mode;
    @ApiField("reserve")
    private String reserve;
    @ApiField("valid_hour")
    private Long validHour;
    @ApiField("valid_minute")
    private Long validMinute;

    public Long getDeposit() {
        return this.deposit;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public Long getInterval() {
        return this.interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public Long getMode() {
        return this.mode;
    }

    public void setMode(Long mode) {
        this.mode = mode;
    }

    public String getReserve() {
        return this.reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public Long getValidHour() {
        return this.validHour;
    }

    public void setValidHour(Long validHour) {
        this.validHour = validHour;
    }

    public Long getValidMinute() {
        return this.validMinute;
    }

    public void setValidMinute(Long validMinute) {
        this.validMinute = validMinute;
    }
}


