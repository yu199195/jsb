package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmcMsgSendrecordResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2461738244264841663L;
    @ApiField("tb_send_list")
    private String tbSendList;
    @ApiField("tb_send_times")
    private Long tbSendTimes;
    @ApiField("tmc_send_list")
    private String tmcSendList;
    @ApiField("tmc_send_times")
    private Long tmcSendTimes;

    public void setTbSendList(String tbSendList) {
        this.tbSendList = tbSendList;
    }

    public String getTbSendList() {
        return this.tbSendList;
    }

    public void setTbSendTimes(Long tbSendTimes) {
        this.tbSendTimes = tbSendTimes;
    }

    public Long getTbSendTimes() {
        return this.tbSendTimes;
    }

    public void setTmcSendList(String tmcSendList) {
        this.tmcSendList = tmcSendList;
    }

    public String getTmcSendList() {
        return this.tmcSendList;
    }

    public void setTmcSendTimes(Long tmcSendTimes) {
        this.tmcSendTimes = tmcSendTimes;
    }

    public Long getTmcSendTimes() {
        return this.tmcSendTimes;
    }
}


