package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbItemAuthorizationAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7832197376697468441L;
    @ApiListField("rule_id_list")
    @ApiField("number")
    private List<Long> ruleIdList;

    public void setRuleIdList(List<Long> ruleIdList) {
        this.ruleIdList = ruleIdList;
    }

    public List<Long> getRuleIdList() {
        return this.ruleIdList;
    }
}


