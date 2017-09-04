package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SubAccountInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class SubusersGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4835434913452717794L;
    @ApiListField("subaccounts")
    @ApiField("sub_account_info")
    private List<SubAccountInfo> subaccounts;

    public void setSubaccounts(List<SubAccountInfo> subaccounts) {
        this.subaccounts = subaccounts;
    }

    public List<SubAccountInfo> getSubaccounts() {
        return this.subaccounts;
    }
}


