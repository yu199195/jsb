package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class DiscountDetail
        extends TaobaoObject {
    private static final long serialVersionUID = 1267784325387369338L;
    @ApiField("created")
    private Date created;
    @ApiField("detail_id")
    private Long detailId;
    @ApiField("discount_type")
    private String discountType;
    @ApiField("discount_value")
    private Long discountValue;
    @ApiField("modified")
    private Date modified;
    @ApiField("target_id")
    private Long targetId;
    @ApiField("target_name")
    private String targetName;
    @ApiField("target_type")
    private String targetType;

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getDetailId() {
        return this.detailId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public String getDiscountType() {
        return this.discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public Long getDiscountValue() {
        return this.discountValue;
    }

    public void setDiscountValue(Long discountValue) {
        this.discountValue = discountValue;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Long getTargetId() {
        return this.targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public String getTargetName() {
        return this.targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getTargetType() {
        return this.targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }
}


