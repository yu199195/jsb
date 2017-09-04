package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.QrcodeDO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class MaQrcodeCommonCreateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1135428539824367623L;
    @ApiListField("modules")
    @ApiField("qrcode_d_o")
    private List<QrcodeDO> modules;
    @ApiField("suc")
    private Boolean suc;

    public void setModules(List<QrcodeDO> modules) {
        this.modules = modules;
    }

    public List<QrcodeDO> getModules() {
        return this.modules;
    }

    public void setSuc(Boolean suc) {
        this.suc = suc;
    }

    public Boolean getSuc() {
        return this.suc;
    }
}


