package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.User;
import com.taobao.api.internal.mapping.ApiField;

public class UserSellerGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4732639939349197114L;
    @ApiField("user")
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }
}


