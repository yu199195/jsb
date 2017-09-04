package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TradeOrderInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 1274317884973392338L;
    @ApiField("ali_order")
    private Boolean aliOrder;
    @ApiField("consignee_address")
    private WaybillAddress consigneeAddress;
    @ApiField("consignee_name")
    private String consigneeName;
    @ApiField("consignee_phone")
    private String consigneePhone;
    @ApiField("item_name")
    private String itemName;
    @ApiListField("logistics_service_list")
    @ApiField("logistics_service")
    private List<LogisticsService> logisticsServiceList;
    @ApiField("order_channels_type")
    private String orderChannelsType;
    @ApiField("order_type")
    private Long orderType;
    @ApiField("package_id")
    private String packageId;
    @ApiListField("package_items")
    @ApiField("package_item")
    private List<PackageItem> packageItems;
    @ApiField("product_type")
    private String productType;
    @ApiField("real_user_id")
    private Long realUserId;
    @ApiField("send_name")
    private String sendName;
    @ApiField("send_phone")
    private String sendPhone;
    @ApiField("short_address")
    private String shortAddress;
    @ApiListField("trade_order_list")
    @ApiField("string")
    private List<String> tradeOrderList;
    @ApiField("volume")
    private Long volume;
    @ApiField("waybill_code")
    private String waybillCode;
    @ApiField("weight")
    private Long weight;

    public Boolean getAliOrder() {
        return this.aliOrder;
    }

    public void setAliOrder(Boolean aliOrder) {
        this.aliOrder = aliOrder;
    }

    public WaybillAddress getConsigneeAddress() {
        return this.consigneeAddress;
    }

    public void setConsigneeAddress(WaybillAddress consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneeName() {
        return this.consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneePhone() {
        return this.consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public List<LogisticsService> getLogisticsServiceList() {
        return this.logisticsServiceList;
    }

    public void setLogisticsServiceList(List<LogisticsService> logisticsServiceList) {
        this.logisticsServiceList = logisticsServiceList;
    }

    public String getOrderChannelsType() {
        return this.orderChannelsType;
    }

    public void setOrderChannelsType(String orderChannelsType) {
        this.orderChannelsType = orderChannelsType;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public String getPackageId() {
        return this.packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public List<PackageItem> getPackageItems() {
        return this.packageItems;
    }

    public void setPackageItems(List<PackageItem> packageItems) {
        this.packageItems = packageItems;
    }

    public String getProductType() {
        return this.productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Long getRealUserId() {
        return this.realUserId;
    }

    public void setRealUserId(Long realUserId) {
        this.realUserId = realUserId;
    }

    public String getSendName() {
        return this.sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getSendPhone() {
        return this.sendPhone;
    }

    public void setSendPhone(String sendPhone) {
        this.sendPhone = sendPhone;
    }

    public String getShortAddress() {
        return this.shortAddress;
    }

    public void setShortAddress(String shortAddress) {
        this.shortAddress = shortAddress;
    }

    public List<String> getTradeOrderList() {
        return this.tradeOrderList;
    }

    public void setTradeOrderList(List<String> tradeOrderList) {
        this.tradeOrderList = tradeOrderList;
    }

    public Long getVolume() {
        return this.volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public String getWaybillCode() {
        return this.waybillCode;
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }

    public Long getWeight() {
        return this.weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }
}


