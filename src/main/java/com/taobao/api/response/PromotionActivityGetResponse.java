package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Activity;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class PromotionActivityGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4148794548419924693L;
    @ApiListField("activitys")
    @ApiField("activity")
    private List<Activity> activitys;

    public void setActivitys(List<Activity> activitys) {
        this.activitys = activitys;
    }

    public List<Activity> getActivitys() {
        return this.activitys;
    }
}


