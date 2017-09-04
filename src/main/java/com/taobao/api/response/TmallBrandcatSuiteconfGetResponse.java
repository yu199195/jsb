package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SuiteConfDO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TmallBrandcatSuiteconfGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1581953692744435324L;
    @ApiListField("suite_conf_list")
    @ApiField("suite_conf_d_o")
    private List<SuiteConfDO> suiteConfList;

    public void setSuiteConfList(List<SuiteConfDO> suiteConfList) {
        this.suiteConfList = suiteConfList;
    }

    public List<SuiteConfDO> getSuiteConfList() {
        return this.suiteConfList;
    }
}


