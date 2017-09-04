package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class LimitDiscount
        extends TaobaoObject {
    private static final long serialVersionUID = 5381367348273611551L;
    @ApiField("end_time")
    private Date endTime;
    @ApiField("item_num")
    private Long itemNum;
    @ApiField("limit_discount_id")
    private Long limitDiscountId;
    @ApiField("limit_discount_name")
    private String limitDiscountName;
    @ApiField("start_time")
    private Date startTime;

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getItemNum() {
        return this.itemNum;
    }

    public void setItemNum(Long itemNum) {
        this.itemNum = itemNum;
    }

    public Long getLimitDiscountId() {
        return this.limitDiscountId;
    }

    public void setLimitDiscountId(Long limitDiscountId) {
        this.limitDiscountId = limitDiscountId;
    }

    public String getLimitDiscountName() {
        return this.limitDiscountName;
    }

    public void setLimitDiscountName(String limitDiscountName) {
        this.limitDiscountName = limitDiscountName;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}


