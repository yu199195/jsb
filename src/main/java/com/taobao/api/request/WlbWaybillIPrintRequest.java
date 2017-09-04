package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWaybillIPrintResponse;

import java.util.List;
import java.util.Map;

public class WlbWaybillIPrintRequest
        extends BaseTaobaoRequest<WlbWaybillIPrintResponse> {
    private String waybillApplyPrintCheckRequest;

    public void setWaybillApplyPrintCheckRequest(String waybillApplyPrintCheckRequest) {
        this.waybillApplyPrintCheckRequest = waybillApplyPrintCheckRequest;
    }

    public void setWaybillApplyPrintCheckRequest(WaybillApplyPrintCheckRequest waybillApplyPrintCheckRequest) {
        this.waybillApplyPrintCheckRequest = new JSONWriter(false, true).write(waybillApplyPrintCheckRequest);
    }

    public String getWaybillApplyPrintCheckRequest() {
        return this.waybillApplyPrintCheckRequest;
    }

    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.print";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_apply_print_check_request", this.waybillApplyPrintCheckRequest);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWaybillIPrintResponse> getResponseClass() {
        return WlbWaybillIPrintResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }

    public static class WaybillAddress
            extends TaobaoObject {
        private static final long serialVersionUID = 3378947761354158574L;

        @ApiField("address_detail")
        private String addressDetail;

        @ApiField("area")
        private String area;

        @ApiField("city")
        private String city;

        @ApiField("division_id")
        private Long divisionId;

        @ApiField("province")
        private String province;

        @ApiField("town")
        private String town;

        public String getAddressDetail() {
            return this.addressDetail;
        }

        public void setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
        }

        public String getArea() {
            return this.area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getCity() {
            return this.city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Long getDivisionId() {
            return this.divisionId;
        }

        public void setDivisionId(Long divisionId) {
            this.divisionId = divisionId;
        }

        public String getProvince() {
            return this.province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getTown() {
            return this.town;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }

    public static class LogisticsService
            extends TaobaoObject {
        private static final long serialVersionUID = 6896174654937567667L;

        @ApiField("service_code")
        private String serviceCode;

        @ApiField("service_value4_json")
        private String serviceValue4Json;

        public String getServiceCode() {
            return this.serviceCode;
        }

        public void setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
        }

        public String getServiceValue4Json() {
            return this.serviceValue4Json;
        }

        public void setServiceValue4Json(String serviceValue4Json) {
            this.serviceValue4Json = serviceValue4Json;
        }
    }

    public static class PrintCheckInfo
            extends TaobaoObject {
        private static final long serialVersionUID = 3236787657354227359L;

        @ApiField("consignee_address")
        private WlbWaybillIPrintRequest.WaybillAddress consigneeAddress;

        @ApiField("consignee_branch_code")
        private String consigneeBranchCode;

        @ApiField("consignee_branch_name")
        private String consigneeBranchName;

        @ApiField("consignee_name")
        private String consigneeName;

        @ApiField("consignee_phone")
        private String consigneePhone;

        @ApiListField("logistics_service_list")
        @ApiField("logistics_service")
        private List<LogisticsService> logisticsServiceList;

        @ApiField("package_center_code")
        private String packageCenterCode;

        @ApiField("package_center_name")
        private String packageCenterName;

        @ApiField("print_config")
        private String printConfig;

        @ApiField("product_type")
        private String productType;

        @ApiField("real_user_id")
        private Long realUserId;

        @ApiField("send_name")
        private String sendName;

        @ApiField("send_phone")
        private String sendPhone;

        @ApiField("shipping_address")
        private WlbWaybillIPrintRequest.WaybillAddress shippingAddress;

        @ApiField("shipping_branch_code")
        private String shippingBranchCode;

        @ApiField("shipping_branch_name")
        private String shippingBranchName;

        @ApiField("short_address")
        private String shortAddress;

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

        public String getPrintConfig() {
            return this.printConfig;
        }

        public void setPrintConfig(String printConfig) {
            this.printConfig = printConfig;
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

    public static class WaybillApplyPrintCheckRequest
            extends TaobaoObject {
        private static final long serialVersionUID = 3484336511755795677L;

        @ApiField("cp_code")
        private String cpCode;

        @ApiListField("print_check_info_cols")
        @ApiField("print_check_info")
        private List<PrintCheckInfo> printCheckInfoCols;

        public String getCpCode() {
            return this.cpCode;
        }

        public void setCpCode(String cpCode) {
            this.cpCode = cpCode;
        }

        public List<PrintCheckInfo> getPrintCheckInfoCols() {
            return this.printCheckInfoCols;
        }

        public void setPrintCheckInfoCols(List<PrintCheckInfo> printCheckInfoCols) {
            this.printCheckInfoCols = printCheckInfoCols;
        }
    }
}


