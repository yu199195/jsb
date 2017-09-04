package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class TradeExt
        extends TaobaoObject {
    private static final long serialVersionUID = 8817716866882235828L;
    @ApiField("before_close_flag")
    private Long beforeCloseFlag;
    @ApiField("before_confirm_flag")
    private Long beforeConfirmFlag;
    @ApiField("before_enable_flag")
    private Long beforeEnableFlag;
    @ApiField("before_modify_flag")
    private Long beforeModifyFlag;
    @ApiField("before_pay_flag")
    private Long beforePayFlag;
    @ApiField("before_rate_flag")
    private Long beforeRateFlag;
    @ApiField("before_refund_flag")
    private Long beforeRefundFlag;
    @ApiField("before_ship_flag")
    private Long beforeShipFlag;
    @ApiField("ext_attributes")
    private String extAttributes;
    @ApiField("extra_data")
    private String extraData;
    @ApiField("third_party_status")
    private Long thirdPartyStatus;

    public Long getBeforeCloseFlag() {
        return this.beforeCloseFlag;
    }

    public void setBeforeCloseFlag(Long beforeCloseFlag) {
        this.beforeCloseFlag = beforeCloseFlag;
    }

    public Long getBeforeConfirmFlag() {
        return this.beforeConfirmFlag;
    }

    public void setBeforeConfirmFlag(Long beforeConfirmFlag) {
        this.beforeConfirmFlag = beforeConfirmFlag;
    }

    public Long getBeforeEnableFlag() {
        return this.beforeEnableFlag;
    }

    public void setBeforeEnableFlag(Long beforeEnableFlag) {
        this.beforeEnableFlag = beforeEnableFlag;
    }

    public Long getBeforeModifyFlag() {
        return this.beforeModifyFlag;
    }

    public void setBeforeModifyFlag(Long beforeModifyFlag) {
        this.beforeModifyFlag = beforeModifyFlag;
    }

    public Long getBeforePayFlag() {
        return this.beforePayFlag;
    }

    public void setBeforePayFlag(Long beforePayFlag) {
        this.beforePayFlag = beforePayFlag;
    }

    public Long getBeforeRateFlag() {
        return this.beforeRateFlag;
    }

    public void setBeforeRateFlag(Long beforeRateFlag) {
        this.beforeRateFlag = beforeRateFlag;
    }

    public Long getBeforeRefundFlag() {
        return this.beforeRefundFlag;
    }

    public void setBeforeRefundFlag(Long beforeRefundFlag) {
        this.beforeRefundFlag = beforeRefundFlag;
    }

    public Long getBeforeShipFlag() {
        return this.beforeShipFlag;
    }

    public void setBeforeShipFlag(Long beforeShipFlag) {
        this.beforeShipFlag = beforeShipFlag;
    }

    public String getExtAttributes() {
        return this.extAttributes;
    }

    public void setExtAttributes(String extAttributes) {
        this.extAttributes = extAttributes;
    }

    public String getExtraData() {
        return this.extraData;
    }

    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }

    public Long getThirdPartyStatus() {
        return this.thirdPartyStatus;
    }

    public void setThirdPartyStatus(Long thirdPartyStatus) {
        this.thirdPartyStatus = thirdPartyStatus;
    }
}


