package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TmcUser;
import com.taobao.api.internal.mapping.ApiField;

public class TmcUserGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6584811132982764535L;
    @ApiField("tmc_user")
    private TmcUser tmcUser;

    public void setTmcUser(TmcUser tmcUser) {
        this.tmcUser = tmcUser;
    }

    public TmcUser getTmcUser() {
        return this.tmcUser;
    }
}


