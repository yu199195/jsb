package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class Requisition
        extends TaobaoObject {
    private static final long serialVersionUID = 3788935864193275681L;
    @ApiField("dist_appraise")
    private Long distAppraise;
    @ApiField("dist_category")
    private Long distCategory;
    @ApiField("dist_category_name")
    private String distCategoryName;
    @ApiField("dist_is_xiaobao")
    private Long distIsXiaobao;
    @ApiField("dist_level")
    private Long distLevel;
    @ApiField("dist_message")
    private String distMessage;
    @ApiField("dist_open_date")
    private Date distOpenDate;
    @ApiField("dist_shop_address")
    private String distShopAddress;
    @ApiField("distributor_id")
    private Long distributorId;
    @ApiField("distributor_nick")
    private String distributorNick;
    @ApiField("gmt_create")
    private Date gmtCreate;
    @ApiField("requisition_id")
    private Long requisitionId;
    @ApiField("status")
    private Long status;

    public Long getDistAppraise() {
        return this.distAppraise;
    }

    public void setDistAppraise(Long distAppraise) {
        this.distAppraise = distAppraise;
    }

    public Long getDistCategory() {
        return this.distCategory;
    }

    public void setDistCategory(Long distCategory) {
        this.distCategory = distCategory;
    }

    public String getDistCategoryName() {
        return this.distCategoryName;
    }

    public void setDistCategoryName(String distCategoryName) {
        this.distCategoryName = distCategoryName;
    }

    public Long getDistIsXiaobao() {
        return this.distIsXiaobao;
    }

    public void setDistIsXiaobao(Long distIsXiaobao) {
        this.distIsXiaobao = distIsXiaobao;
    }

    public Long getDistLevel() {
        return this.distLevel;
    }

    public void setDistLevel(Long distLevel) {
        this.distLevel = distLevel;
    }

    public String getDistMessage() {
        return this.distMessage;
    }

    public void setDistMessage(String distMessage) {
        this.distMessage = distMessage;
    }

    public Date getDistOpenDate() {
        return this.distOpenDate;
    }

    public void setDistOpenDate(Date distOpenDate) {
        this.distOpenDate = distOpenDate;
    }

    public String getDistShopAddress() {
        return this.distShopAddress;
    }

    public void setDistShopAddress(String distShopAddress) {
        this.distShopAddress = distShopAddress;
    }

    public Long getDistributorId() {
        return this.distributorId;
    }

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    public String getDistributorNick() {
        return this.distributorNick;
    }

    public void setDistributorNick(String distributorNick) {
        this.distributorNick = distributorNick;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getRequisitionId() {
        return this.requisitionId;
    }

    public void setRequisitionId(Long requisitionId) {
        this.requisitionId = requisitionId;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}


