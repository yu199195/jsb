package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LoginUser;
import com.taobao.api.internal.mapping.ApiField;

public class FenxiaoLoginUserGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7219718349785442191L;
    @ApiField("login_user")
    private LoginUser loginUser;

    public void setLoginUser(LoginUser loginUser) {
        this.loginUser = loginUser;
    }

    public LoginUser getLoginUser() {
        return this.loginUser;
    }
}


