package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class CainiaoWaybillIiGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3748413974868424859L;
    @ApiListField("modules")
    @ApiField("waybill_cloud_print_response")
    private List<WaybillCloudPrintResponse> modules;

    public void setModules(List<WaybillCloudPrintResponse> modules) {
        this.modules = modules;
    }

    public List<WaybillCloudPrintResponse> getModules() {
        return this.modules;
    }

    public static class WaybillCloudPrintResponse
            extends TaobaoObject {
        private static final long serialVersionUID = 1273273372915274396L;

        @ApiField("encoding_type")
        private Long encodingType;

        @ApiField("object_id")
        private String objectId;

        @ApiField("print_data")
        private String printData;

        @ApiField("signature")
        private String signature;

        @ApiField("template_url")
        private String templateUrl;

        @ApiField("waybill_code")
        private String waybillCode;

        public Long getEncodingType() {
            return this.encodingType;
        }

        public void setEncodingType(Long encodingType) {
            this.encodingType = encodingType;
        }

        public String getObjectId() {
            return this.objectId;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public String getPrintData() {
            return this.printData;
        }

        public void setPrintData(String printData) {
            this.printData = printData;
        }

        public String getSignature() {
            return this.signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
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


