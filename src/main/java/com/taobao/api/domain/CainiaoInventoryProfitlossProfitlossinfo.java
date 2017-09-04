package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class CainiaoInventoryProfitlossProfitlossinfo
        extends TaobaoObject {
    private static final long serialVersionUID = 6521632289953172291L;
    @ApiField("cn_order_code")
    private String cnOrderCode;
    @ApiField("created_time")
    private Date createdTime;
    @ApiListField("order_item_list")
    @ApiField("cainiao_inventory_profitloss_orderitemlist")
    private List<CainiaoInventoryProfitlossOrderitemlist> orderItemList;
    @ApiField("order_type")
    private Long orderType;
    @ApiField("remark")
    private String remark;
    @ApiField("store_code")
    private String storeCode;

    public String getCnOrderCode() {
        return this.cnOrderCode;
    }

    public void setCnOrderCode(String cnOrderCode) {
        this.cnOrderCode = cnOrderCode;
    }

    public Date getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public List<CainiaoInventoryProfitlossOrderitemlist> getOrderItemList() {
        return this.orderItemList;
    }

    public void setOrderItemList(List<CainiaoInventoryProfitlossOrderitemlist> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }
}


