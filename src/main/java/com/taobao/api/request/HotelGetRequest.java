package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelGetResponse;

import java.util.Map;

public class HotelGetRequest
        extends BaseTaobaoRequest<HotelGetResponse> {
    private Boolean checkAudit;
    private Long hid;
    private Boolean needRoomType;

    public void setCheckAudit(Boolean checkAudit) {
        this.checkAudit = checkAudit;
    }

    public Boolean getCheckAudit() {
        return this.checkAudit;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setNeedRoomType(Boolean needRoomType) {
        this.needRoomType = needRoomType;
    }

    public Boolean getNeedRoomType() {
        return this.needRoomType;
    }

    public String getApiMethodName() {
        return "taobao.hotel.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("check_audit", this.checkAudit);
        txtParams.put("hid", this.hid);
        txtParams.put("need_room_type", this.needRoomType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<HotelGetResponse> getResponseClass() {
        return HotelGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.hid, "hid");
    }
}


