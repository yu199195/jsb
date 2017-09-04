package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbWmsInventoryLackUpload
        extends TaobaoObject {
    private static final long serialVersionUID = 4468934962829843231L;
    @ApiField("create_time")
    private String createTime;
    @ApiListField("item_list")
    @ApiField("item_list_wlb_wms_inventory_lack_upload")
    private List<ItemListWlbWmsInventoryLackUpload> itemList;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("out_biz_code")
    private String outBizCode;
    @ApiField("store_code")
    private String storeCode;
    @ApiField("store_order_code")
    private String storeOrderCode;
    @ApiField("strore_code")
    private String stroreCode;

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<ItemListWlbWmsInventoryLackUpload> getItemList() {
        return this.itemList;
    }

    public void setItemList(List<ItemListWlbWmsInventoryLackUpload> itemList) {
        this.itemList = itemList;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOutBizCode() {
        return this.outBizCode;
    }

    public void setOutBizCode(String outBizCode) {
        this.outBizCode = outBizCode;
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

    public String getStroreCode() {
        return this.stroreCode;
    }

    public void setStroreCode(String stroreCode) {
        this.stroreCode = stroreCode;
    }
}


