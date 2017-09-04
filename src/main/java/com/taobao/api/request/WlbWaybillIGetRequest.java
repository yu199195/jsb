package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWaybillIGetResponse;

import java.util.List;
import java.util.Map;

public class WlbWaybillIGetRequest
        extends BaseTaobaoRequest<WlbWaybillIGetResponse> {
    private String waybillApplyNewRequest;

    public void setWaybillApplyNewRequest(String waybillApplyNewRequest) {
        this.waybillApplyNewRequest = waybillApplyNewRequest;
    }

    public void setWaybillApplyNewRequest(WaybillApplyNewRequest waybillApplyNewRequest) {
        this.waybillApplyNewRequest = new JSONWriter(false, true).write(waybillApplyNewRequest);
    }

    public String getWaybillApplyNewRequest() {
        return this.waybillApplyNewRequest;
    }

    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_apply_new_request", this.waybillApplyNewRequest);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWaybillIGetResponse> getResponseClass() {
        return WlbWaybillIGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }

    public static class WaybillAddress
            extends TaobaoObject {
        private static final long serialVersionUID = 7881642663147124549L;

        @ApiField("address_detail")
        private String addressDetail;

        @ApiField("area")
        private String area;

        @ApiField("city")
        private String city;

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

    public static class PackageItem
            extends TaobaoObject {
        private static final long serialVersionUID = 7568674513513519152L;

        @ApiField("count")
        private Long count;

        @ApiField("item_name")
        private String itemName;

        public Long getCount() {
            return this.count;
        }

        public void setCount(Long count) {
            this.count = count;
        }

        public String getItemName() {
            return this.itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }
    }

    public static class LogisticsService
            extends TaobaoObject {
        private static final long serialVersionUID = 3245651751632415798L;

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

    public static class TradeOrderInfo
            extends TaobaoObject {
        private static final long serialVersionUID = 3467425871931757587L;

        @ApiField("consignee_address")
        private WlbWaybillIGetRequest.WaybillAddress consigneeAddress;

        @ApiField("consignee_name")
        private String consigneeName;

        @ApiField("consignee_phone")
        private String consigneePhone;

        @ApiListField("logistics_service_list")
        @ApiField("logistics_service")
        private List<LogisticsService> logisticsServiceList;

        @ApiField("order_channels_type")
        private String orderChannelsType;

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

        @ApiListField("trade_order_list")
        @ApiField("string")
        private List<String> tradeOrderList;

        @ApiField("volume")
        private Long volume;

        @ApiField("weight")
        private Long weight;

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

        public Long getWeight() {
            return this.weight;
        }

        public void setWeight(Long weight) {
            this.weight = weight;
        }
    }

    public static class WaybillApplyNewRequest
            extends TaobaoObject {
        private static final long serialVersionUID = 5382992191672755298L;

        @ApiField("cp_code")
        private String cpCode;

        @ApiField("shipping_address")
        private WlbWaybillIGetRequest.WaybillAddress shippingAddress;

        @ApiListField("trade_order_info_cols")
        @ApiField("trade_order_info")
        private List<TradeOrderInfo> tradeOrderInfoCols;

        public String getCpCode() {
            return this.cpCode;
        }

        public void setCpCode(String cpCode) {
            this.cpCode = cpCode;
        }

        public WaybillAddress getShippingAddress() {
            return this.shippingAddress;
        }

        public void setShippingAddress(WaybillAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        public List<TradeOrderInfo> getTradeOrderInfoCols() {
            return this.tradeOrderInfoCols;
        }

        public void setTradeOrderInfoCols(List<TradeOrderInfo> tradeOrderInfoCols) {
            this.tradeOrderInfoCols = tradeOrderInfoCols;
        }
    }
}


