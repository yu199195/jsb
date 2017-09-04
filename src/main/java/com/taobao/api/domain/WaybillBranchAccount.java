package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WaybillBranchAccount
        extends TaobaoObject {
    private static final long serialVersionUID = 6435289629795564827L;
    @ApiField("allocated_quantity")
    private Long allocatedQuantity;
    @ApiField("branch_code")
    private String branchCode;
    @ApiField("branch_name")
    private String branchName;
    @ApiField("cancel_quantity")
    private Long cancelQuantity;
    @ApiField("cp_code")
    private String cpCode;
    @ApiField("print_quantity")
    private Long printQuantity;
    @ApiField("quantity")
    private Long quantity;
    @ApiField("seller_id")
    private Long sellerId;
    @ApiListField("shipp_address_cols")
    @ApiField("waybill_address")
    private List<WaybillAddress> shippAddressCols;

    public Long getAllocatedQuantity() {
        return this.allocatedQuantity;
    }

    public void setAllocatedQuantity(Long allocatedQuantity) {
        this.allocatedQuantity = allocatedQuantity;
    }

    public String getBranchCode() {
        return this.branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return this.branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Long getCancelQuantity() {
        return this.cancelQuantity;
    }

    public void setCancelQuantity(Long cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }

    public String getCpCode() {
        return this.cpCode;
    }

    public void setCpCode(String cpCode) {
        this.cpCode = cpCode;
    }

    public Long getPrintQuantity() {
        return this.printQuantity;
    }

    public void setPrintQuantity(Long printQuantity) {
        this.printQuantity = printQuantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public List<WaybillAddress> getShippAddressCols() {
        return this.shippAddressCols;
    }

    public void setShippAddressCols(List<WaybillAddress> shippAddressCols) {
        this.shippAddressCols = shippAddressCols;
    }
}


