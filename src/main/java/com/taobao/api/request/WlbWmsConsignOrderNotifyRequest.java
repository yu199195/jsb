package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsConsignOrderNotifyResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class WlbWmsConsignOrderNotifyRequest
        extends BaseTaobaoRequest<WlbWmsConsignOrderNotifyResponse> {
    private String alipayNo;
    private Long arAmount;
    private String carNo;
    private String carriersName;
    private String deliverRequirements;
    private Long discountAmount;
    private String extendFields;
    private Long gotAmount;
    private String invoiceInfoList;
    private Long orderAmount;
    private String orderCode;
    private Date orderCreateTime;
    private Date orderExaminationTime;
    private String orderFlag;
    private String orderItemList;
    private Date orderPayTime;
    private Long orderPriority;
    private Date orderShopCreateTime;
    private Long orderSource;
    private String orderSubSource;
    private Long orderType;
    private String pickerCall;
    private String pickerId;
    private String pickerName;
    private Long postfee;
    private String prevOrderCode;
    private String receiverInfo;
    private String remark;
    private String senderInfo;
    private Long serviceFee;
    private String storeCode;
    private String tmsServiceCode;
    private String tmsServiceName;
    private String transportMode;

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
    }

    public String getAlipayNo() {
        return this.alipayNo;
    }

    public void setArAmount(Long arAmount) {
        this.arAmount = arAmount;
    }

    public Long getArAmount() {
        return this.arAmount;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCarNo() {
        return this.carNo;
    }

    public void setCarriersName(String carriersName) {
        this.carriersName = carriersName;
    }

    public String getCarriersName() {
        return this.carriersName;
    }

    public void setDeliverRequirements(String deliverRequirements) {
        this.deliverRequirements = deliverRequirements;
    }

    public void setDeliverRequirements(Deliverrequirementswlbwmsconsignordernotify deliverRequirements) {
        this.deliverRequirements = new JSONWriter(false, true).write(deliverRequirements);
    }

    public String getDeliverRequirements() {
        return this.deliverRequirements;
    }

    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Long getDiscountAmount() {
        return this.discountAmount;
    }

    public void setExtendFields(String extendFields) {
        this.extendFields = extendFields;
    }

    public String getExtendFields() {
        return this.extendFields;
    }

    public void setGotAmount(Long gotAmount) {
        this.gotAmount = gotAmount;
    }

    public Long getGotAmount() {
        return this.gotAmount;
    }

    public void setInvoiceInfoList(String invoiceInfoList) {
        this.invoiceInfoList = invoiceInfoList;
    }

    public void setInvoiceInfoList(List<Invoicelistwlbwmsconsignordernotify> invoiceInfoList) {
        this.invoiceInfoList = new JSONWriter(false, true).write(invoiceInfoList);
    }

    public String getInvoiceInfoList() {
        return this.invoiceInfoList;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Long getOrderAmount() {
        return this.orderAmount;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public void setOrderExaminationTime(Date orderExaminationTime) {
        this.orderExaminationTime = orderExaminationTime;
    }

    public Date getOrderExaminationTime() {
        return this.orderExaminationTime;
    }

    public void setOrderFlag(String orderFlag) {
        this.orderFlag = orderFlag;
    }

    public String getOrderFlag() {
        return this.orderFlag;
    }

    public void setOrderItemList(String orderItemList) {
        this.orderItemList = orderItemList;
    }

    public void setOrderItemList(List<Orderitemlistwlbwmsconsignordernotify> orderItemList) {
        this.orderItemList = new JSONWriter(false, true).write(orderItemList);
    }

    public String getOrderItemList() {
        return this.orderItemList;
    }

    public void setOrderPayTime(Date orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public Date getOrderPayTime() {
        return this.orderPayTime;
    }

    public void setOrderPriority(Long orderPriority) {
        this.orderPriority = orderPriority;
    }

    public Long getOrderPriority() {
        return this.orderPriority;
    }

    public void setOrderShopCreateTime(Date orderShopCreateTime) {
        this.orderShopCreateTime = orderShopCreateTime;
    }

    public Date getOrderShopCreateTime() {
        return this.orderShopCreateTime;
    }

    public void setOrderSource(Long orderSource) {
        this.orderSource = orderSource;
    }

    public Long getOrderSource() {
        return this.orderSource;
    }

    public void setOrderSubSource(String orderSubSource) {
        this.orderSubSource = orderSubSource;
    }

    public String getOrderSubSource() {
        return this.orderSubSource;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setPickerCall(String pickerCall) {
        this.pickerCall = pickerCall;
    }

    public String getPickerCall() {
        return this.pickerCall;
    }

    public void setPickerId(String pickerId) {
        this.pickerId = pickerId;
    }

    public String getPickerId() {
        return this.pickerId;
    }

    public void setPickerName(String pickerName) {
        this.pickerName = pickerName;
    }

    public String getPickerName() {
        return this.pickerName;
    }

    public void setPostfee(Long postfee) {
        this.postfee = postfee;
    }

    public Long getPostfee() {
        return this.postfee;
    }

    public void setPrevOrderCode(String prevOrderCode) {
        this.prevOrderCode = prevOrderCode;
    }

    public String getPrevOrderCode() {
        return this.prevOrderCode;
    }

    public void setReceiverInfo(String receiverInfo) {
        this.receiverInfo = receiverInfo;
    }

    public void setReceiverInfo(Receiverwlbwmsconsignordernotify receiverInfo) {
        this.receiverInfo = new JSONWriter(false, true).write(receiverInfo);
    }

    public String getReceiverInfo() {
        return this.receiverInfo;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setSenderInfo(String senderInfo) {
        this.senderInfo = senderInfo;
    }

    public void setSenderInfo(Senderwlbwmsconsignordernotify senderInfo) {
        this.senderInfo = new JSONWriter(false, true).write(senderInfo);
    }

    public String getSenderInfo() {
        return this.senderInfo;
    }

    public void setServiceFee(Long serviceFee) {
        this.serviceFee = serviceFee;
    }

    public Long getServiceFee() {
        return this.serviceFee;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setTmsServiceCode(String tmsServiceCode) {
        this.tmsServiceCode = tmsServiceCode;
    }

    public String getTmsServiceCode() {
        return this.tmsServiceCode;
    }

    public void setTmsServiceName(String tmsServiceName) {
        this.tmsServiceName = tmsServiceName;
    }

    public String getTmsServiceName() {
        return this.tmsServiceName;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public String getTransportMode() {
        return this.transportMode;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.consign.order.notify";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("alipay_no", this.alipayNo);
        txtParams.put("ar_amount", this.arAmount);
        txtParams.put("car_no", this.carNo);
        txtParams.put("carriers_name", this.carriersName);
        txtParams.put("deliver_requirements", this.deliverRequirements);
        txtParams.put("discount_amount", this.discountAmount);
        txtParams.put("extend_fields", this.extendFields);
        txtParams.put("got_amount", this.gotAmount);
        txtParams.put("invoice_info_list", this.invoiceInfoList);
        txtParams.put("order_amount", this.orderAmount);
        txtParams.put("order_code", this.orderCode);
        txtParams.put("order_create_time", this.orderCreateTime);
        txtParams.put("order_examination_time", this.orderExaminationTime);
        txtParams.put("order_flag", this.orderFlag);
        txtParams.put("order_item_list", this.orderItemList);
        txtParams.put("order_pay_time", this.orderPayTime);
        txtParams.put("order_priority", this.orderPriority);
        txtParams.put("order_shop_create_time", this.orderShopCreateTime);
        txtParams.put("order_source", this.orderSource);
        txtParams.put("order_sub_source", this.orderSubSource);
        txtParams.put("order_type", this.orderType);
        txtParams.put("picker_call", this.pickerCall);
        txtParams.put("picker_id", this.pickerId);
        txtParams.put("picker_name", this.pickerName);
        txtParams.put("postfee", this.postfee);
        txtParams.put("prev_order_code", this.prevOrderCode);
        txtParams.put("receiver_info", this.receiverInfo);
        txtParams.put("remark", this.remark);
        txtParams.put("sender_info", this.senderInfo);
        txtParams.put("service_fee", this.serviceFee);
        txtParams.put("store_code", this.storeCode);
        txtParams.put("tms_service_code", this.tmsServiceCode);
        txtParams.put("tms_service_name", this.tmsServiceName);
        txtParams.put("transport_mode", this.transportMode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsConsignOrderNotifyResponse> getResponseClass() {
        return WlbWmsConsignOrderNotifyResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMinValue(this.arAmount, 0L, "arAmount");
        RequestCheckUtils.checkMinValue(this.gotAmount, 0L, "gotAmount");
        RequestCheckUtils.checkObjectMaxListSize(this.invoiceInfoList, 1000, "invoiceInfoList");
        RequestCheckUtils.checkMinValue(this.orderAmount, 0L, "orderAmount");
        RequestCheckUtils.checkNotEmpty(this.orderCode, "orderCode");
        RequestCheckUtils.checkObjectMaxListSize(this.orderItemList, 1000, "orderItemList");
        RequestCheckUtils.checkNotEmpty(this.orderType, "orderType");
        RequestCheckUtils.checkMinValue(this.serviceFee, 0L, "serviceFee");
    }

    public static class Deliverrequirementswlbwmsconsignordernotify
            extends TaobaoObject {
        private static final long serialVersionUID = 6495115229277726136L;

        @ApiField("delivery_type")
        private String deliveryType;

        @ApiField("schedule_day")
        private String scheduleDay;

        @ApiField("schedule_end")
        private String scheduleEnd;

        @ApiField("schedule_start")
        private String scheduleStart;

        @ApiField("schedule_type")
        private Long scheduleType;

        public String getDeliveryType() {
            return this.deliveryType;
        }

        public void setDeliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
        }

        public String getScheduleDay() {
            return this.scheduleDay;
        }

        public void setScheduleDay(String scheduleDay) {
            this.scheduleDay = scheduleDay;
        }

        public String getScheduleEnd() {
            return this.scheduleEnd;
        }

        public void setScheduleEnd(String scheduleEnd) {
            this.scheduleEnd = scheduleEnd;
        }

        public String getScheduleStart() {
            return this.scheduleStart;
        }

        public void setScheduleStart(String scheduleStart) {
            this.scheduleStart = scheduleStart;
        }

        public Long getScheduleType() {
            return this.scheduleType;
        }

        public void setScheduleType(Long scheduleType) {
            this.scheduleType = scheduleType;
        }
    }

    public static class Receiverwlbwmsconsignordernotify
            extends TaobaoObject {
        private static final long serialVersionUID = 3856542334282788293L;

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

        @ApiField("receiver_town")
        private String receiverTown;

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

        public String getReceiverTown() {
            return this.receiverTown;
        }

        public void setReceiverTown(String receiverTown) {
            this.receiverTown = receiverTown;
        }

        public String getReceiverZipCode() {
            return this.receiverZipCode;
        }

        public void setReceiverZipCode(String receiverZipCode) {
            this.receiverZipCode = receiverZipCode;
        }
    }

    public static class Senderwlbwmsconsignordernotify
            extends TaobaoObject {
        private static final long serialVersionUID = 3625293232519521432L;

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

        @ApiField("sender_town")
        private String senderTown;

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

        public String getSenderTown() {
            return this.senderTown;
        }

        public void setSenderTown(String senderTown) {
            this.senderTown = senderTown;
        }

        public String getSenderZipCode() {
            return this.senderZipCode;
        }

        public void setSenderZipCode(String senderZipCode) {
            this.senderZipCode = senderZipCode;
        }
    }

    public static class Orderitemwlbwmsconsignordernotify
            extends TaobaoObject {
        private static final long serialVersionUID = 2137788754999428332L;

        @ApiField("actual_price")
        private Long actualPrice;

        @ApiField("discount_amount")
        private Long discountAmount;

        @ApiField("extend_fields")
        private String extendFields;

        @ApiField("inventory_type")
        private Long inventoryType;

        @ApiField("item_ext_code")
        private String itemExtCode;

        @ApiField("item_id")
        private String itemId;

        @ApiField("item_name")
        private String itemName;

        @ApiField("item_price")
        private Long itemPrice;

        @ApiField("item_quantity")
        private Long itemQuantity;

        @ApiField("order_item_id")
        private String orderItemId;

        @ApiField("order_source_code")
        private String orderSourceCode;

        @ApiField("owner_user_id")
        private String ownerUserId;

        @ApiField("owner_user_name")
        private String ownerUserName;

        @ApiField("sub_source_code")
        private String subSourceCode;

        @ApiField("user_id")
        private String userId;

        @ApiField("user_name")
        private String userName;

        public Long getActualPrice() {
            return this.actualPrice;
        }

        public void setActualPrice(Long actualPrice) {
            this.actualPrice = actualPrice;
        }

        public Long getDiscountAmount() {
            return this.discountAmount;
        }

        public void setDiscountAmount(Long discountAmount) {
            this.discountAmount = discountAmount;
        }

        public String getExtendFields() {
            return this.extendFields;
        }

        public void setExtendFields(String extendFields) {
            this.extendFields = extendFields;
        }

        public Long getInventoryType() {
            return this.inventoryType;
        }

        public void setInventoryType(Long inventoryType) {
            this.inventoryType = inventoryType;
        }

        public String getItemExtCode() {
            return this.itemExtCode;
        }

        public void setItemExtCode(String itemExtCode) {
            this.itemExtCode = itemExtCode;
        }

        public String getItemId() {
            return this.itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        public String getItemName() {
            return this.itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public Long getItemPrice() {
            return this.itemPrice;
        }

        public void setItemPrice(Long itemPrice) {
            this.itemPrice = itemPrice;
        }

        public Long getItemQuantity() {
            return this.itemQuantity;
        }

        public void setItemQuantity(Long itemQuantity) {
            this.itemQuantity = itemQuantity;
        }

        public String getOrderItemId() {
            return this.orderItemId;
        }

        public void setOrderItemId(String orderItemId) {
            this.orderItemId = orderItemId;
        }

        public String getOrderSourceCode() {
            return this.orderSourceCode;
        }

        public void setOrderSourceCode(String orderSourceCode) {
            this.orderSourceCode = orderSourceCode;
        }

        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public void setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
        }

        public String getOwnerUserName() {
            return this.ownerUserName;
        }

        public void setOwnerUserName(String ownerUserName) {
            this.ownerUserName = ownerUserName;
        }

        public String getSubSourceCode() {
            return this.subSourceCode;
        }

        public void setSubSourceCode(String subSourceCode) {
            this.subSourceCode = subSourceCode;
        }

        public String getUserId() {
            return this.userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return this.userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }

    public static class Orderitemlistwlbwmsconsignordernotify
            extends TaobaoObject {
        private static final long serialVersionUID = 1577476315221641364L;

        @ApiField("order_item")
        private WlbWmsConsignOrderNotifyRequest.Orderitemwlbwmsconsignordernotify orderItem;

        public Orderitemwlbwmsconsignordernotify getOrderItem() {
            return this.orderItem;
        }

        public void setOrderItem(Orderitemwlbwmsconsignordernotify orderItem) {
            this.orderItem = orderItem;
        }
    }

    public static class Itemdetailwlbwmsconsignordernotify
            extends TaobaoObject {
        private static final long serialVersionUID = 1194612919865474636L;

        @ApiField("amount")
        private String amount;

        @ApiField("item_name")
        private String itemName;

        @ApiField("price")
        private String price;

        @ApiField("quantity")
        private Long quantity;

        @ApiField("unit")
        private String unit;

        public String getAmount() {
            return this.amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getItemName() {
            return this.itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public String getPrice() {
            return this.price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public Long getQuantity() {
            return this.quantity;
        }

        public void setQuantity(Long quantity) {
            this.quantity = quantity;
        }

        public String getUnit() {
            return this.unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }
    }

    public static class Detaillistwlbwmsconsignordernotify
            extends TaobaoObject {
        private static final long serialVersionUID = 5512357263296546378L;

        @ApiField("item_detail")
        private WlbWmsConsignOrderNotifyRequest.Itemdetailwlbwmsconsignordernotify itemDetail;

        public Itemdetailwlbwmsconsignordernotify getItemDetail() {
            return this.itemDetail;
        }

        public void setItemDetail(Itemdetailwlbwmsconsignordernotify itemDetail) {
            this.itemDetail = itemDetail;
        }
    }

    public static class Invoicewlbwmsconsignordernotify
            extends TaobaoObject {
        private static final long serialVersionUID = 7592766418458822916L;

        @ApiField("bill_account")
        private String billAccount;

        @ApiField("bill_content")
        private String billContent;

        @ApiField("bill_id")
        private Long billId;

        @ApiField("bill_title")
        private String billTitle;

        @ApiField("bill_type")
        private String billType;

        @ApiListField("detail_list")
        @ApiField("detaillistwlbwmsconsignordernotify")
        private List<Detaillistwlbwmsconsignordernotify> detailList;

        public String getBillAccount() {
            return this.billAccount;
        }

        public void setBillAccount(String billAccount) {
            this.billAccount = billAccount;
        }

        public String getBillContent() {
            return this.billContent;
        }

        public void setBillContent(String billContent) {
            this.billContent = billContent;
        }

        public Long getBillId() {
            return this.billId;
        }

        public void setBillId(Long billId) {
            this.billId = billId;
        }

        public String getBillTitle() {
            return this.billTitle;
        }

        public void setBillTitle(String billTitle) {
            this.billTitle = billTitle;
        }

        public String getBillType() {
            return this.billType;
        }

        public void setBillType(String billType) {
            this.billType = billType;
        }

        public List<Detaillistwlbwmsconsignordernotify> getDetailList() {
            return this.detailList;
        }

        public void setDetailList(List<Detaillistwlbwmsconsignordernotify> detailList) {
            this.detailList = detailList;
        }
    }

    public static class Invoicelistwlbwmsconsignordernotify
            extends TaobaoObject {
        private static final long serialVersionUID = 7533777693732911965L;

        @ApiField("invoice_info")
        private WlbWmsConsignOrderNotifyRequest.Invoicewlbwmsconsignordernotify invoiceInfo;

        public Invoicewlbwmsconsignordernotify getInvoiceInfo() {
            return this.invoiceInfo;
        }

        public void setInvoiceInfo(Invoicewlbwmsconsignordernotify invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
        }
    }
}


