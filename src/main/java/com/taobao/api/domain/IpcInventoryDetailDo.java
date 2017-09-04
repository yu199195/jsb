package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class IpcInventoryDetailDo
        extends TaobaoObject {
    private static final long serialVersionUID = 6217379563338848714L;
    @ApiField("biz_order_id")
    private Long bizOrderId;
    @ApiField("biz_sub_order_id")
    private Long bizSubOrderId;
    @ApiField("flag")
    private Long flag;
    @ApiField("occupy_quantity")
    private Long occupyQuantity;
    @ApiField("owner_nick")
    private String ownerNick;
    @ApiField("reserve_quantity")
    private Long reserveQuantity;
    @ApiField("sc_item_id")
    private Long scItemId;
    @ApiField("store_code")
    private String storeCode;

    public Long getBizOrderId() {
        return this.bizOrderId;
    }

    public void setBizOrderId(Long bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public Long getBizSubOrderId() {
        return this.bizSubOrderId;
    }

    public void setBizSubOrderId(Long bizSubOrderId) {
        this.bizSubOrderId = bizSubOrderId;
    }

    public Long getFlag() {
        return this.flag;
    }

    public void setFlag(Long flag) {
        this.flag = flag;
    }

    public Long getOccupyQuantity() {
        return this.occupyQuantity;
    }

    public void setOccupyQuantity(Long occupyQuantity) {
        this.occupyQuantity = occupyQuantity;
    }

    public String getOwnerNick() {
        return this.ownerNick;
    }

    public void setOwnerNick(String ownerNick) {
        this.ownerNick = ownerNick;
    }

    public Long getReserveQuantity() {
        return this.reserveQuantity;
    }

    public void setReserveQuantity(Long reserveQuantity) {
        this.reserveQuantity = reserveQuantity;
    }

    public Long getScItemId() {
        return this.scItemId;
    }

    public void setScItemId(Long scItemId) {
        this.scItemId = scItemId;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }
}


