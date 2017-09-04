package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.CainiaoCntmsMailnoGetResponse;

import java.util.List;
import java.util.Map;

public class CainiaoCntmsMailnoGetRequest
        extends BaseTaobaoRequest<CainiaoCntmsMailnoGetResponse> {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void setContent(CnTmsMailnoGetContent content) {
        this.content = new JSONWriter(false, true).write(content);
    }

    public String getContent() {
        return this.content;
    }

    public String getApiMethodName() {
        return "cainiao.cntms.mailno.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("content", this.content);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<CainiaoCntmsMailnoGetResponse> getResponseClass() {
        return CainiaoCntmsMailnoGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }

    public static class CnTmsMailnoReceiverinfo
            extends TaobaoObject {
        private static final long serialVersionUID = 1166913533331842772L;

        @ApiField("receiver_address")
        private String receiverAddress;

        @ApiField("receiver_area")
        private String receiverArea;

        @ApiField("receiver_city")
        private String receiverCity;

        @ApiField("receiver_mobile")
        private String receiverMobile;

        @ApiField("receiver_name")
        private String receiverName;

        @ApiField("receiver_nick")
        private String receiverNick;

        @ApiField("receiver_phone")
        private String receiverPhone;

        @ApiField("receiver_province")
        private String receiverProvince;

        @ApiField("receiver_zip_code")
        private String receiverZipCode;

        public String getReceiverAddress() {
            return this.receiverAddress;
        }

        public void setReceiverAddress(String receiverAddress) {
            this.receiverAddress = receiverAddress;
        }

        public String getReceiverArea() {
            return this.receiverArea;
        }

        public void setReceiverArea(String receiverArea) {
            this.receiverArea = receiverArea;
        }

        public String getReceiverCity() {
            return this.receiverCity;
        }

        public void setReceiverCity(String receiverCity) {
            this.receiverCity = receiverCity;
        }

        public String getReceiverMobile() {
            return this.receiverMobile;
        }

        public void setReceiverMobile(String receiverMobile) {
            this.receiverMobile = receiverMobile;
        }

        public String getReceiverName() {
            return this.receiverName;
        }

        public void setReceiverName(String receiverName) {
            this.receiverName = receiverName;
        }

        public String getReceiverNick() {
            return this.receiverNick;
        }

        public void setReceiverNick(String receiverNick) {
            this.receiverNick = receiverNick;
        }

        public String getReceiverPhone() {
            return this.receiverPhone;
        }

        public void setReceiverPhone(String receiverPhone) {
            this.receiverPhone = receiverPhone;
        }

        public String getReceiverProvince() {
            return this.receiverProvince;
        }

        public void setReceiverProvince(String receiverProvince) {
            this.receiverProvince = receiverProvince;
        }

        public String getReceiverZipCode() {
            return this.receiverZipCode;
        }

        public void setReceiverZipCode(String receiverZipCode) {
            this.receiverZipCode = receiverZipCode;
        }
    }

    public static class CnTmsMailnoSenderinfo
            extends TaobaoObject {
        private static final long serialVersionUID = 1452249865234388169L;

        @ApiField("sender_address")
        private String senderAddress;

        @ApiField("sender_area")
        private String senderArea;

        @ApiField("sender_city")
        private String senderCity;

        @ApiField("sender_mobile")
        private String senderMobile;

        @ApiField("sender_name")
        private String senderName;

        @ApiField("sender_phone")
        private String senderPhone;

        @ApiField("sender_province")
        private String senderProvince;

        @ApiField("sender_zip_code")
        private String senderZipCode;

        public String getSenderAddress() {
            return this.senderAddress;
        }

        public void setSenderAddress(String senderAddress) {
            this.senderAddress = senderAddress;
        }

        public String getSenderArea() {
            return this.senderArea;
        }

        public void setSenderArea(String senderArea) {
            this.senderArea = senderArea;
        }

        public String getSenderCity() {
            return this.senderCity;
        }

        public void setSenderCity(String senderCity) {
            this.senderCity = senderCity;
        }

        public String getSenderMobile() {
            return this.senderMobile;
        }

        public void setSenderMobile(String senderMobile) {
            this.senderMobile = senderMobile;
        }

        public String getSenderName() {
            return this.senderName;
        }

        public void setSenderName(String senderName) {
            this.senderName = senderName;
        }

        public String getSenderPhone() {
            return this.senderPhone;
        }

        public void setSenderPhone(String senderPhone) {
            this.senderPhone = senderPhone;
        }

        public String getSenderProvince() {
            return this.senderProvince;
        }

        public void setSenderProvince(String senderProvince) {
            this.senderProvince = senderProvince;
        }

        public String getSenderZipCode() {
            return this.senderZipCode;
        }

        public void setSenderZipCode(String senderZipCode) {
            this.senderZipCode = senderZipCode;
        }
    }

    public static class CnTmsMailnoItem
            extends TaobaoObject {
        private static final long serialVersionUID = 2388982165882447275L;

        @ApiField("item_name")
        private String itemName;

        @ApiField("item_qty")
        private Long itemQty;

        public String getItemName() {
            return this.itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public Long getItemQty() {
            return this.itemQty;
        }

        public void setItemQty(Long itemQty) {
            this.itemQty = itemQty;
        }
    }

    public static class CnTmsMailnoGetContent
            extends TaobaoObject {
        private static final long serialVersionUID = 1755862769291689935L;

        @ApiField("extend_field")
        private String extendField;

        @ApiListField("items")
        @ApiField("cn_tms_mailno_item")
        private List<CnTmsMailnoItem> items;

        @ApiField("order_code")
        private String orderCode;

        @ApiField("order_source")
        private String orderSource;

        @ApiField("package_no")
        private Long packageNo;

        @ApiField("receiver_info")
        private CainiaoCntmsMailnoGetRequest.CnTmsMailnoReceiverinfo receiverInfo;

        @ApiField("sender_info")
        private CainiaoCntmsMailnoGetRequest.CnTmsMailnoSenderinfo senderInfo;

        @ApiField("shop_code")
        private String shopCode;

        @ApiField("solutions_code")
        private String solutionsCode;

        @ApiField("trade_id")
        private String tradeId;

        public String getExtendField() {
            return this.extendField;
        }

        public void setExtendField(String extendField) {
            this.extendField = extendField;
        }

        public List<CnTmsMailnoItem> getItems() {
            return this.items;
        }

        public void setItems(List<CnTmsMailnoItem> items) {
            this.items = items;
        }

        public String getOrderCode() {
            return this.orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getOrderSource() {
            return this.orderSource;
        }

        public void setOrderSource(String orderSource) {
            this.orderSource = orderSource;
        }

        public Long getPackageNo() {
            return this.packageNo;
        }

        public void setPackageNo(Long packageNo) {
            this.packageNo = packageNo;
        }

        public CnTmsMailnoReceiverinfo getReceiverInfo() {
            return this.receiverInfo;
        }

        public void setReceiverInfo(CnTmsMailnoReceiverinfo receiverInfo) {
            this.receiverInfo = receiverInfo;
        }

        public CnTmsMailnoSenderinfo getSenderInfo() {
            return this.senderInfo;
        }

        public void setSenderInfo(CnTmsMailnoSenderinfo senderInfo) {
            this.senderInfo = senderInfo;
        }

        public String getShopCode() {
            return this.shopCode;
        }

        public void setShopCode(String shopCode) {
            this.shopCode = shopCode;
        }

        public String getSolutionsCode() {
            return this.solutionsCode;
        }

        public void setSolutionsCode(String solutionsCode) {
            this.solutionsCode = solutionsCode;
        }

        public String getTradeId() {
            return this.tradeId;
        }

        public void setTradeId(String tradeId) {
            this.tradeId = tradeId;
        }
    }
}


