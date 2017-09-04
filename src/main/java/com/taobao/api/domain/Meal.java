package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Meal
        extends TaobaoObject {
    private static final long serialVersionUID = 6815674329339597745L;
    @ApiField("item_list")
    private String itemList;
    @ApiField("meal_id")
    private Long mealId;
    @ApiField("meal_memo")
    private String mealMemo;
    @ApiField("meal_name")
    private String mealName;
    @ApiField("meal_price")
    private String mealPrice;
    @ApiField("postage_id")
    private Long postageId;
    @ApiField("status")
    private String status;
    @ApiField("type_postage")
    private String typePostage;

    public String getItemList() {
        return this.itemList;
    }

    public void setItemList(String itemList) {
        this.itemList = itemList;
    }

    public Long getMealId() {
        return this.mealId;
    }

    public void setMealId(Long mealId) {
        this.mealId = mealId;
    }

    public String getMealMemo() {
        return this.mealMemo;
    }

    public void setMealMemo(String mealMemo) {
        this.mealMemo = mealMemo;
    }

    public String getMealName() {
        return this.mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealPrice() {
        return this.mealPrice;
    }

    public void setMealPrice(String mealPrice) {
        this.mealPrice = mealPrice;
    }

    public Long getPostageId() {
        return this.postageId;
    }

    public void setPostageId(Long postageId) {
        this.postageId = postageId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTypePostage() {
        return this.typePostage;
    }

    public void setTypePostage(String typePostage) {
        this.typePostage = typePostage;
    }
}


