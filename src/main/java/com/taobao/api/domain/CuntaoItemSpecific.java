package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CuntaoItemSpecific
        extends TaobaoObject {
    private static final long serialVersionUID = 3535488761791811767L;
    @ApiField("kick_back_rate")
    private String kickBackRate;

    public String getKickBackRate() {
        return this.kickBackRate;
    }

    public void setKickBackRate(String kickBackRate) {
        this.kickBackRate = kickBackRate;
    }
}


