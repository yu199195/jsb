package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelOrdersSearchResponse;

import java.util.Date;
import java.util.Map;

public class HotelOrdersSearchRequest
        extends BaseTaobaoRequest<HotelOrdersSearchResponse> {
    private Date checkinDateEnd;
    private Date checkinDateStart;
    private Date checkoutDateEnd;
    private Date checkoutDateStart;
    private Date createdEnd;
    private Date createdStart;
    private String gids;
    private String hids;
    private Boolean needGuest;
    private Boolean needMessage;
    private String oids;
    private Long pageNo;
    private String rids;
    private String status;
    private String tids;

    public void setCheckinDateEnd(Date checkinDateEnd) {
        this.checkinDateEnd = checkinDateEnd;
    }

    public Date getCheckinDateEnd() {
        return this.checkinDateEnd;
    }

    public void setCheckinDateStart(Date checkinDateStart) {
        this.checkinDateStart = checkinDateStart;
    }

    public Date getCheckinDateStart() {
        return this.checkinDateStart;
    }

    public void setCheckoutDateEnd(Date checkoutDateEnd) {
        this.checkoutDateEnd = checkoutDateEnd;
    }

    public Date getCheckoutDateEnd() {
        return this.checkoutDateEnd;
    }

    public void setCheckoutDateStart(Date checkoutDateStart) {
        this.checkoutDateStart = checkoutDateStart;
    }

    public Date getCheckoutDateStart() {
        return this.checkoutDateStart;
    }

    public void setCreatedEnd(Date createdEnd) {
        this.createdEnd = createdEnd;
    }

    public Date getCreatedEnd() {
        return this.createdEnd;
    }

    public void setCreatedStart(Date createdStart) {
        this.createdStart = createdStart;
    }

    public Date getCreatedStart() {
        return this.createdStart;
    }

    public void setGids(String gids) {
        this.gids = gids;
    }

    public String getGids() {
        return this.gids;
    }

    public void setHids(String hids) {
        this.hids = hids;
    }

    public String getHids() {
        return this.hids;
    }

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

    public void setOids(String oids) {
        this.oids = oids;
    }

    public String getOids() {
        return this.oids;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setRids(String rids) {
        this.rids = rids;
    }

    public String getRids() {
        return this.rids;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setTids(String tids) {
        this.tids = tids;
    }

    public String getTids() {
        return this.tids;
    }

    public String getApiMethodName() {
        return "taobao.hotel.orders.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("checkin_date_end", this.checkinDateEnd);
        txtParams.put("checkin_date_start", this.checkinDateStart);
        txtParams.put("checkout_date_end", this.checkoutDateEnd);
        txtParams.put("checkout_date_start", this.checkoutDateStart);
        txtParams.put("created_end", this.createdEnd);
        txtParams.put("created_start", this.createdStart);
        txtParams.put("gids", this.gids);
        txtParams.put("hids", this.hids);
        txtParams.put("need_guest", this.needGuest);
        txtParams.put("need_message", this.needMessage);
        txtParams.put("oids", this.oids);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("rids", this.rids);
        txtParams.put("status", this.status);
        txtParams.put("tids", this.tids);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<HotelOrdersSearchResponse> getResponseClass() {
        return HotelOrdersSearchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(this.status, 1, "status");
    }
}


