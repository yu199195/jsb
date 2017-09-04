package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.CainiaoWaybillIiUpdateResponse;

import java.util.List;
import java.util.Map;

public class CainiaoWaybillIiUpdateRequest
        extends BaseTaobaoRequest<CainiaoWaybillIiUpdateResponse> {
    private String paramWaybillCloudPrintUpdateRequest;

    public void setParamWaybillCloudPrintUpdateRequest(String paramWaybillCloudPrintUpdateRequest) {
        this.paramWaybillCloudPrintUpdateRequest = paramWaybillCloudPrintUpdateRequest;
    }

    public void setParamWaybillCloudPrintUpdateRequest(WaybillCloudPrintUpdateRequest paramWaybillCloudPrintUpdateRequest) {
        this.paramWaybillCloudPrintUpdateRequest = new JSONWriter(false, true).write(paramWaybillCloudPrintUpdateRequest);
    }

    public String getParamWaybillCloudPrintUpdateRequest() {
        return this.paramWaybillCloudPrintUpdateRequest;
    }

    public String getApiMethodName() {
        return "cainiao.waybill.ii.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("param_waybill_cloud_print_update_request", this.paramWaybillCloudPrintUpdateRequest);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<CainiaoWaybillIiUpdateResponse> getResponseClass() {
        return CainiaoWaybillIiUpdateResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }

    public static class Item
            extends TaobaoObject {
        private static final long serialVersionUID = 8123185929298893961L;

        @ApiField("count")
        private Long count;

        @ApiField("name")
        private String name;

        public Long getCount() {
            return this.count;
        }

        public void setCount(Long count) {
            this.count = count;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class PackageInfoDto
            extends TaobaoObject {
        private static final long serialVersionUID = 7474687782463925165L;

        @ApiListField("items")
        @ApiField("item")
        private List<Item> items;

        @ApiField("volume")
        private Long volume;

        @ApiField("weight")
        private Long weight;

        public List<Item> getItems() {
            return this.items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
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

    public static class AddressDto
            extends TaobaoObject {
        private static final long serialVersionUID = 4532236117799172479L;

        @ApiField("city")
        private String city;

        @ApiField("detail")
        private String detail;

        @ApiField("district")
        private String district;

        @ApiField("province")
        private String province;

        @ApiField("town")
        private String town;

        public String getCity() {
            return this.city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDetail() {
            return this.detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public String getDistrict() {
            return this.district;
        }

        public void setDistrict(String district) {
            this.district = district;
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

    public static class UserInfoDto
            extends TaobaoObject {
        private static final long serialVersionUID = 8373665682289727257L;

        @ApiField("address")
        private CainiaoWaybillIiUpdateRequest.AddressDto address;

        @ApiField("mobile")
        private String mobile;

        @ApiField("name")
        private String name;

        @ApiField("phone")
        private String phone;

        public AddressDto getAddress() {
            return this.address;
        }

        public void setAddress(AddressDto address) {
            this.address = address;
        }

        public String getMobile() {
            return this.mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return this.phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    public static class WaybillCloudPrintUpdateRequest
            extends TaobaoObject {
        private static final long serialVersionUID = 3269351796343989954L;

        @ApiField("cp_code")
        private String cpCode;

        @ApiField("logistics_services")
        private String logisticsServices;

        @ApiField("object_id")
        private String objectId;

        @ApiField("package_info")
        private CainiaoWaybillIiUpdateRequest.PackageInfoDto packageInfo;

        @ApiField("recipient")
        private CainiaoWaybillIiUpdateRequest.UserInfoDto recipient;

        @ApiField("sender")
        private CainiaoWaybillIiUpdateRequest.UserInfoDto sender;

        @ApiField("template_url")
        private String templateUrl;

        @ApiField("waybill_code")
        private String waybillCode;

        public String getCpCode() {
            return this.cpCode;
        }

        public void setCpCode(String cpCode) {
            this.cpCode = cpCode;
        }

        public String getLogisticsServices() {
            return this.logisticsServices;
        }

        public void setLogisticsServices(String logisticsServices) {
            this.logisticsServices = logisticsServices;
        }

        public String getObjectId() {
            return this.objectId;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public PackageInfoDto getPackageInfo() {
            return this.packageInfo;
        }

        public void setPackageInfo(PackageInfoDto packageInfo) {
            this.packageInfo = packageInfo;
        }

        public UserInfoDto getRecipient() {
            return this.recipient;
        }

        public void setRecipient(UserInfoDto recipient) {
            this.recipient = recipient;
        }

        public UserInfoDto getSender() {
            return this.sender;
        }

        public void setSender(UserInfoDto sender) {
            this.sender = sender;
        }

        public String getTemplateUrl() {
            return this.templateUrl;
        }

        public void setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
        }

        public String getWaybillCode() {
            return this.waybillCode;
        }

        public void setWaybillCode(String waybillCode) {
            this.waybillCode = waybillCode;
        }
    }
}


