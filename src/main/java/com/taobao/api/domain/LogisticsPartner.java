package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class LogisticsPartner
        extends TaobaoObject {
    private static final long serialVersionUID = 3417858512279559154L;
    @ApiField("carriage")
    private CarriageDetail carriage;
    @ApiField("cover_remark")
    private String coverRemark;
    @ApiField("partner")
    private PartnerDetail partner;
    @ApiField("uncover_remark")
    private String uncoverRemark;

    public CarriageDetail getCarriage() {
        return this.carriage;
    }

    public void setCarriage(CarriageDetail carriage) {
        this.carriage = carriage;
    }

    public String getCoverRemark() {
        return this.coverRemark;
    }

    public void setCoverRemark(String coverRemark) {
        this.coverRemark = coverRemark;
    }

    public PartnerDetail getPartner() {
        return this.partner;
    }

    public void setPartner(PartnerDetail partner) {
        this.partner = partner;
    }

    public String getUncoverRemark() {
        return this.uncoverRemark;
    }

    public void setUncoverRemark(String uncoverRemark) {
        this.uncoverRemark = uncoverRemark;
    }
}


