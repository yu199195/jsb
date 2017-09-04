package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class LimitDiscountDetail
        extends TaobaoObject {
    private static final long serialVersionUID = 7252611421144835972L;
    @ApiField("end_time")
    private Date endTime;
    @ApiField("item_discount")
    private String itemDiscount;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("limit_discount_name")
    private String limitDiscountName;
    @ApiField("limit_num")
    private Long limitNum;
    @ApiField("start_time")
    private Date startTime;

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getItemDiscount() {
        return this.itemDiscount;
    }

    public void setItemDiscount(String itemDiscount) {
        this.itemDiscount = itemDiscount;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getLimitDiscountName() {
        return this.limitDiscountName;
    }

    public void setLimitDiscountName(String limitDiscountName) {
        this.limitDiscountName = limitDiscountName;
    }

    public Long getLimitNum() {
        return this.limitNum;
    }

    public void setLimitNum(Long limitNum) {
        this.limitNum = limitNum;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}


