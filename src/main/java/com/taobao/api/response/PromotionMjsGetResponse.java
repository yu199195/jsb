package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PromotionMjs;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class PromotionMjsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1775981572239869774L;
    @ApiField("end_time")
    private String endTime;
    @ApiField("memo")
    private String memo;
    @ApiListField("mjs_list")
    @ApiField("promotion_mjs")
    private List<PromotionMjs> mjsList;
    @ApiField("mjs_name")
    private String mjsName;
    @ApiField("no_cap")
    private Boolean noCap;
    @ApiField("shop_name")
    private String shopName;
    @ApiField("start_time")
    private String startTime;

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMjsList(List<PromotionMjs> mjsList) {
        this.mjsList = mjsList;
    }

    public List<PromotionMjs> getMjsList() {
        return this.mjsList;
    }

    public void setMjsName(String mjsName) {
        this.mjsName = mjsName;
    }

    public String getMjsName() {
        return this.mjsName;
    }

    public void setNoCap(Boolean noCap) {
        this.noCap = noCap;
    }

    public Boolean getNoCap() {
        return this.noCap;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return this.shopName;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return this.startTime;
    }
}


