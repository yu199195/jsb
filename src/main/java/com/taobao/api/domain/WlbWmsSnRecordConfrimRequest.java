package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbWmsSnRecordConfrimRequest
        extends TaobaoObject {
    private static final long serialVersionUID = 8893681769349997134L;
    @ApiListField("item_list")
    @ApiField("item_listwlbwmssnrecordconfrim")
    private List<ItemListwlbwmssnrecordconfrim> itemList;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("order_type")
    private Long orderType;
    @ApiField("out_biz_code")
    private String outBizCode;
    @ApiField("owner_user_id")
    private String ownerUserId;
    @ApiField("store_code")
    private String storeCode;
    @ApiField("store_order_code")
    private String storeOrderCode;

    public List<ItemListwlbwmssnrecordconfrim> getItemList() {
        return this.itemList;
    }

    public void setItemList(List<ItemListwlbwmssnrecordconfrim> itemList) {
        this.itemList = itemList;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public String getOutBizCode() {
        return this.outBizCode;
    }

    public void setOutBizCode(String outBizCode) {
        this.outBizCode = outBizCode;
    }

    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreOrderCode() {
        return this.storeOrderCode;
    }

    public void setStoreOrderCode(String storeOrderCode) {
        this.storeOrderCode = storeOrderCode;
    }
}


