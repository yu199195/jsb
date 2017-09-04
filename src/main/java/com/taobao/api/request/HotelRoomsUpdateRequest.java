package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomsUpdateResponse;

import java.util.Map;

public class HotelRoomsUpdateRequest
        extends BaseTaobaoRequest<HotelRoomsUpdateResponse> {
    private String gidRoomQuotaMap;
    private String multiRoomQuotas;

    public void setGidRoomQuotaMap(String gidRoomQuotaMap) {
        this.gidRoomQuotaMap = gidRoomQuotaMap;
    }

    public String getGidRoomQuotaMap() {
        return this.gidRoomQuotaMap;
    }

    public void setMultiRoomQuotas(String multiRoomQuotas) {
        this.multiRoomQuotas = multiRoomQuotas;
    }

    public String getMultiRoomQuotas() {
        return this.multiRoomQuotas;
    }

    public String getApiMethodName() {
        return "taobao.hotel.rooms.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("gid_room_quota_map", this.gidRoomQuotaMap);
        txtParams.put("multi_room_quotas", this.multiRoomQuotas);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<HotelRoomsUpdateResponse> getResponseClass() {
        return HotelRoomsUpdateResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


