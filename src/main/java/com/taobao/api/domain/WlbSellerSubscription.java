package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class WlbSellerSubscription
        extends TaobaoObject {
    private static final long serialVersionUID = 2335824474275432147L;
    @ApiField("end_date")
    private Date endDate;
    @ApiField("gmt_create")
    private Date gmtCreate;
    @ApiField("gmt_modified")
    private Date gmtModified;
    @ApiField("id")
    private Long id;
    @ApiField("is_own_service")
    private Long isOwnService;
    @ApiField("parent_id")
    private Long parentId;
    @ApiField("provider_user_id")
    private Long providerUserId;
    @ApiField("remark")
    private String remark;
    @ApiField("service_alias")
    private String serviceAlias;
    @ApiField("service_code")
    private String serviceCode;
    @ApiField("service_id")
    private Long serviceId;
    @ApiField("service_name")
    private String serviceName;
    @ApiField("service_type")
    private String serviceType;
    @ApiField("start_date")
    private Date startDate;
    @ApiField("status")
    private String status;
    @ApiField("subscriber_user_id")
    private Long subscriberUserId;
    @ApiField("subscriber_user_nick")
    private String subscriberUserNick;
    @ApiField("wlb_partner_address")
    private WlbPartnerAddress wlbPartnerAddress;
    @ApiField("wlb_partner_contact")
    private WlbPartnerContact wlbPartnerContact;

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIsOwnService() {
        return this.isOwnService;
    }

    public void setIsOwnService(Long isOwnService) {
        this.isOwnService = isOwnService;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getProviderUserId() {
        return this.providerUserId;
    }

    public void setProviderUserId(Long providerUserId) {
        this.providerUserId = providerUserId;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getServiceAlias() {
        return this.serviceAlias;
    }

    public void setServiceAlias(String serviceAlias) {
        this.serviceAlias = serviceAlias;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public Long getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
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

    public Long getSubscriberUserId() {
        return this.subscriberUserId;
    }

    public void setSubscriberUserId(Long subscriberUserId) {
        this.subscriberUserId = subscriberUserId;
    }

    public String getSubscriberUserNick() {
        return this.subscriberUserNick;
    }

    public void setSubscriberUserNick(String subscriberUserNick) {
        this.subscriberUserNick = subscriberUserNick;
    }

    public WlbPartnerAddress getWlbPartnerAddress() {
        return this.wlbPartnerAddress;
    }

    public void setWlbPartnerAddress(WlbPartnerAddress wlbPartnerAddress) {
        this.wlbPartnerAddress = wlbPartnerAddress;
    }

    public WlbPartnerContact getWlbPartnerContact() {
        return this.wlbPartnerContact;
    }

    public void setWlbPartnerContact(WlbPartnerContact wlbPartnerContact) {
        this.wlbPartnerContact = wlbPartnerContact;
    }
}


