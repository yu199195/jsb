package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelOrderGetResponse;

import java.util.Map;

public class HotelOrderGetRequest
        extends BaseTaobaoRequest<HotelOrderGetResponse> {
    private Boolean needGuest;
    private Boolean needMessage;
    private Long oid;
    private Long tid;

    public void setNeedGuest(Boolean needGuest) {
        this.needGuest = needGuest;
    }

    public Boolean getNeedGuest() {
        return this.needGuest;
    }

    public void setNeedMessage(Boolean needMessage) {
        this.needMessage = needMessage;
    }

    public Boolean getNeedMessage() {
        return this.needMessage;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public String getApiMethodName() {
        return "taobao.hotel.order.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("need_guest", this.needGuest);
        txtParams.put("need_message", this.needMessage);
        txtParams.put("oid", this.oid);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<HotelOrderGetResponse> getResponseClass() {
        return HotelOrderGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


