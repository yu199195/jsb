package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class FenxiaoItemRecord
        extends TaobaoObject {
    private static final long serialVersionUID = 2167264744245623235L;
    @ApiField("created")
    private Date created;
    @ApiField("distributor_id")
    private Long distributorId;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("modified")
    private Date modified;
    @ApiField("product_id")
    private Long productId;
    @ApiField("trade_type")
    private String tradeType;

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getDistributorId() {
        return this.distributorId;
    }

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
}


