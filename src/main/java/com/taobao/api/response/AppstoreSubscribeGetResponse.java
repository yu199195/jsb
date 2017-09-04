package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.UserSubscribe;
import com.taobao.api.internal.mapping.ApiField;

public class AppstoreSubscribeGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7326334573163698582L;
    @ApiField("user_subscribe")
    private UserSubscribe userSubscribe;

    public void setUserSubscribe(UserSubscribe userSubscribe) {
        this.userSubscribe = userSubscribe;
    }

    public UserSubscribe getUserSubscribe() {
        return this.userSubscribe;
    }
}


