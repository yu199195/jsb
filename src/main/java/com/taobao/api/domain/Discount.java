package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class Discount
        extends TaobaoObject {
    private static final long serialVersionUID = 8614292182634215388L;
    @ApiField("created")
    private Date created;
    @ApiListField("details")
    @ApiField("discount_detail")
    private List<DiscountDetail> details;
    @ApiField("discount_id")
    private Long discountId;
    @ApiField("modified")
    private Date modified;
    @ApiField("name")
    private String name;

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public List<DiscountDetail> getDetails() {
        return this.details;
    }

    public void setDetails(List<DiscountDetail> details) {
        this.details = details;
    }

    public Long getDiscountId() {
        return this.discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


