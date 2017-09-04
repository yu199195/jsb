package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ScItemMap
        extends TaobaoObject {
    private static final long serialVersionUID = 2794127164174769841L;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("map_type")
    private Long mapType;
    @ApiField("rel_item_id")
    private Long relItemId;
    @ApiField("rel_outer_code")
    private String relOuterCode;
    @ApiField("rel_user_id")
    private Long relUserId;
    @ApiField("rel_user_nick")
    private String relUserNick;
    @ApiField("sku_id")
    private Long skuId;
    @ApiField("user_id")
    private Long userId;
    @ApiField("user_nick")
    private String userNick;

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getMapType() {
        return this.mapType;
    }

    public void setMapType(Long mapType) {
        this.mapType = mapType;
    }

    public Long getRelItemId() {
        return this.relItemId;
    }

    public void setRelItemId(Long relItemId) {
        this.relItemId = relItemId;
    }

    public String getRelOuterCode() {
        return this.relOuterCode;
    }

    public void setRelOuterCode(String relOuterCode) {
        this.relOuterCode = relOuterCode;
    }

    public Long getRelUserId() {
        return this.relUserId;
    }

    public void setRelUserId(Long relUserId) {
        this.relUserId = relUserId;
    }

    public String getRelUserNick() {
        return this.relUserNick;
    }

    public void setRelUserNick(String relUserNick) {
        this.relUserNick = relUserNick;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }
}


