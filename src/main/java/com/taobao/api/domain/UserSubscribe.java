package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class UserSubscribe
        extends TaobaoObject {
    private static final long serialVersionUID = 3338678286374867394L;
    @ApiField("end_date")
    private Date endDate;
    @ApiField("start_date")
    private Date startDate;
    @ApiField("status")
    private String status;
    @ApiField("version_no")
    private Long versionNo;

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getVersionNo() {
        return this.versionNo;
    }

    public void setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
    }
}


