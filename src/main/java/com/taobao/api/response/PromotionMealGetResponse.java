package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Meal;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class PromotionMealGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7653886557428834734L;
    @ApiListField("meal_list")
    @ApiField("meal")
    private List<Meal> mealList;

    public void setMealList(List<Meal> mealList) {
        this.mealList = mealList;
    }

    public List<Meal> getMealList() {
        return this.mealList;
    }
}


