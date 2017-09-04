package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class Cooperation
        extends TaobaoObject {
    private static final long serialVersionUID = 4729343336226831337L;
    @ApiListField("auth_payway")
    @ApiField("string")
    private List<String> authPayway;
    @ApiField("cooperate_id")
    private Long cooperateId;
    @ApiField("distributor_id")
    private Long distributorId;
    @ApiField("distributor_nick")
    private String distributorNick;
    @ApiField("end_date")
    private Date endDate;
    @ApiField("grade_id")
    private Long gradeId;
    @ApiField("product_line")
    private String productLine;
    @ApiListField("product_line_name")
    @ApiField("string")
    private List<String> productLineName;
    @ApiField("start_date")
    private Date startDate;
    @ApiField("status")
    private String status;
    @ApiField("supplier_id")
    private Long supplierId;
    @ApiField("supplier_nick")
    private String supplierNick;
    @ApiField("trade_type")
    private String tradeType;

    public List<String> getAuthPayway() {
        return this.authPayway;
    }

    public void setAuthPayway(List<String> authPayway) {
        this.authPayway = authPayway;
    }

    public Long getCooperateId() {
        return this.cooperateId;
    }

    public void setCooperateId(Long cooperateId) {
        this.cooperateId = cooperateId;
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

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getGradeId() {
        return this.gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public String getProductLine() {
        return this.productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public List<String> getProductLineName() {
        return this.productLineName;
    }

    public void setProductLineName(List<String> productLineName) {
        this.productLineName = productLineName;
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

    public Long getSupplierId() {
        return this.supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierNick() {
        return this.supplierNick;
    }

    public void setSupplierNick(String supplierNick) {
        this.supplierNick = supplierNick;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
}


