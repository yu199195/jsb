package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class Consignorder
        extends TaobaoObject {
    private static final long serialVersionUID = 8516386823437338365L;
    @ApiListField("consign_order_item_list")
    @ApiField("consignorderitemlistwlbwmsconsignordernotify")
    private List<Consignorderitemlistwlbwmsconsignordernotify> consignOrderItemList;
    @ApiField("error_code")
    private String errorCode;
    @ApiField("error_msg")
    private String errorMsg;
    @ApiField("store_code")
    private String storeCode;
    @ApiField("store_order_code")
    private String storeOrderCode;
    @ApiField("success")
    private Boolean success;
    @ApiField("tms_code")
    private String tmsCode;

    public List<Consignorderitemlistwlbwmsconsignordernotify> getConsignOrderItemList() {
        return this.consignOrderItemList;
    }

    public void setConsignOrderItemList(List<Consignorderitemlistwlbwmsconsignordernotify> consignOrderItemList) {
        this.consignOrderItemList = consignOrderItemList;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreOrderCode() {
        return this.storeOrderCode;
    }

    public void setStoreOrderCode(String storeOrderCode) {
        this.storeOrderCode = storeOrderCode;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getTmsCode() {
        return this.tmsCode;
    }

    public void setTmsCode(String tmsCode) {
        this.tmsCode = tmsCode;
    }
}


