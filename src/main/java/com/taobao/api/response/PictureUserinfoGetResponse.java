package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.UserInfo;
import com.taobao.api.internal.mapping.ApiField;

public class PictureUserinfoGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2773117743427262148L;
    @ApiField("user_info")
    private UserInfo userInfo;

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public UserInfo getUserInfo() {
        return this.userInfo;
    }
}


