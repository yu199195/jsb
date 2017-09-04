package com.taobao.api;

public class ApiRuleException
        extends ApiException {
    private static final long serialVersionUID = -7787145910600194272L;

    public ApiRuleException(String errCode, String errMsg) {
        super(errCode, errMsg);
    }
}


