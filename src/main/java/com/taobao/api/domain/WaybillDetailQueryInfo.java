package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class WaybillDetailQueryInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 4547465216319196551L;
    @ApiField("consignee_address")
    private WaybillAddress consigneeAddress;
    @ApiField("consignee_branch_code")
    private String consigneeBranchCode;
    @ApiField("consignee_branch_name")
    private String consigneeBranchName;
    @ApiField("consignee_name")
    private String consigneeName;
    @ApiField("consignee_phone")
    private String consigneePhone;
    @ApiField("cp_code")
    private String cpCode;
    @ApiField("create_time")
    private Date createTime;
    @ApiField("last_print_time")
    private Date lastPrintTime;
    @ApiListField("logistics_service_list")
    @ApiField("logistics_service")
    private List<LogisticsService> logisticsServiceList;
    @ApiField("package_center_code")
    private String packageCenterCode;
    @ApiField("package_center_name")
    private String packageCenterName;
    @ApiField("package_id")
    private String packageId;
    @ApiListField("package_items")
    @ApiField("package_item")
    private List<PackageItem> packageItems;
    @ApiField("pickup_time")
    private Date pickupTime;
    @ApiField("print_config")
    private String printConfig;
    @ApiField("print_count")
    private Long printCount;
    @ApiField("product_type")
    private String productType;
    @ApiField("real_user_id")
    private Long realUserId;
    @ApiField("send_name")
    private String sendName;
    @ApiField("send_phone")
    private String sendPhone;
    @ApiField("shipping_address")
    private WaybillAddress shippingAddress;
    @ApiField("shipping_branch_code")
    private String shippingBranchCode;
    @ApiField("shipping_branch_name")
    private String shippingBranchName;
    @ApiField("short_address")
    private String shortAddress;
    @ApiField("sign_time")
    private Date signTime;
    @ApiField("status")
    private Long status;
    @ApiListField("trade_order_list")
    @ApiField("string")
    private List<String> tradeOrderList;
    @ApiField("volume")
    private Long volume;
    @ApiField("waybill_code")
    private String waybillCode;
    @ApiField("weight")
    private Long weight;

    public WaybillAddress getConsigneeAddress() {
        return this.consigneeAddress;
    }

    public void setConsigneeAddress(WaybillAddress consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneeBranchCode() {
        return this.consigneeBranchCode;
    }

    public void setConsigneeBranchCode(String consigneeBranchCode) {
        this.consigneeBranchCode = consigneeBranchCode;
    }

    public String getConsigneeBranchName() {
        return this.consigneeBranchName;
    }

    public void setConsigneeBranchName(String consigneeBranchName) {
        this.consigneeBranchName = consigneeBranchName;
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

    public String getCpCode() {
        return this.cpCode;
    }

    public void setCpCode(String cpCode) {
        this.cpCode = cpCode;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastPrintTime() {
        return this.lastPrintTime;
    }

    public void setLastPrintTime(Date lastPrintTime) {
        this.lastPrintTime = lastPrintTime;
    }

    public List<LogisticsService> getLogisticsServiceList() {
        return this.logisticsServiceList;
    }

    public void setLogisticsServiceList(List<LogisticsService> logisticsServiceList) {
        this.logisticsServiceList = logisticsServiceList;
    }

    public String getPackageCenterCode() {
        return this.packageCenterCode;
    }

    public void setPackageCenterCode(String packageCenterCode) {
        this.packageCenterCode = packageCenterCode;
    }

    public String getPackageCenterName() {
        return this.packageCenterName;
    }

    public void setPackageCenterName(String packageCenterName) {
        this.packageCenterName = packageCenterName;
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

    public Date getPickupTime() {
        return this.pickupTime;
    }

    public void setPickupTime(Date pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getPrintConfig() {
        return this.printConfig;
    }

    public void setPrintConfig(String printConfig) {
        this.printConfig = printConfig;
    }

    public Long getPrintCount() {
        return this.printCount;
    }

    public void setPrintCount(Long printCount) {
        this.printCount = printCount;
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

    public WaybillAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public void setShippingAddress(WaybillAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getShippingBranchCode() {
        return this.shippingBranchCode;
    }

    public void setShippingBranchCode(String shippingBranchCode) {
        this.shippingBranchCode = shippingBranchCode;
    }

    public String getShippingBranchName() {
        return this.shippingBranchName;
    }

    public void setShippingBranchName(String shippingBranchName) {
        this.shippingBranchName = shippingBranchName;
    }

    public String getShortAddress() {
        return this.shortAddress;
    }

    public void setShortAddress(String shortAddress) {
        this.shortAddress = shortAddress;
    }

    public Date getSignTime() {
        return this.signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
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


