package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WaybillApplySubscriptionInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 1176751631178341758L;
    @ApiListField("branch_account_cols")
    @ApiField("waybill_branch_account")
    private List<WaybillBranchAccount> branchAccountCols;
    @ApiField("cp_code")
    private String cpCode;
    @ApiField("cp_type")
    private Long cpType;
    @ApiField("result")
    private Long result;

    public List<WaybillBranchAccount> getBranchAccountCols() {
        return this.branchAccountCols;
    }

    public void setBranchAccountCols(List<WaybillBranchAccount> branchAccountCols) {
        this.branchAccountCols = branchAccountCols;
    }

    public String getCpCode() {
        return this.cpCode;
    }

    public void setCpCode(String cpCode) {
        this.cpCode = cpCode;
    }

    public Long getCpType() {
        return this.cpType;
    }

    public void setCpType(Long cpType) {
        this.cpType = cpType;
    }

    public Long getResult() {
        return this.result;
    }

    public void setResult(Long result) {
        this.result = result;
    }
}


