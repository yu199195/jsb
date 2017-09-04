package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class DeliveryTemplate
        extends TaobaoObject {
    private static final long serialVersionUID = 4615821325744481734L;
    @ApiField("address")
    private String address;
    @ApiField("assumer")
    private Long assumer;
    @ApiField("consign_area_id")
    private Long consignAreaId;
    @ApiField("created")
    private Date created;
    @ApiListField("fee_list")
    @ApiField("top_fee")
    private List<TopFee> feeList;
    @ApiField("modified")
    private Date modified;
    @ApiField("name")
    private String name;
    @ApiField("supports")
    private String supports;
    @ApiField("template_id")
    private Long templateId;
    @ApiField("template_type")
    private Long templateType;
    @ApiField("valuation")
    private Long valuation;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAssumer() {
        return this.assumer;
    }

    public void setAssumer(Long assumer) {
        this.assumer = assumer;
    }

    public Long getConsignAreaId() {
        return this.consignAreaId;
    }

    public void setConsignAreaId(Long consignAreaId) {
        this.consignAreaId = consignAreaId;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public List<TopFee> getFeeList() {
        return this.feeList;
    }

    public void setFeeList(List<TopFee> feeList) {
        this.feeList = feeList;
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

    public String getSupports() {
        return this.supports;
    }

    public void setSupports(String supports) {
        this.supports = supports;
    }

    public Long getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getTemplateType() {
        return this.templateType;
    }

    public void setTemplateType(Long templateType) {
        this.templateType = templateType;
    }

    public Long getValuation() {
        return this.valuation;
    }

    public void setValuation(Long valuation) {
        this.valuation = valuation;
    }
}


