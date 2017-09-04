package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsConsignOrderConfirmResponse;

import java.util.List;
import java.util.Map;

public class WlbWmsConsignOrderConfirmRequest
        extends BaseTaobaoRequest<WlbWmsConsignOrderConfirmResponse> {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void setContent(WlbWmsConsignOrderConfirm content) {
        this.content = new JSONWriter(false, true).write(content);
    }

    public String getContent() {
        return this.content;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.consign.order.confirm";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("content", this.content);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsConsignOrderConfirmResponse> getResponseClass() {
        return WlbWmsConsignOrderConfirmResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }

    public static class TmsItemsWlbWmsConsignOrderConfirm
            extends TaobaoObject {
        private static final long serialVersionUID = 5497416223462968952L;

        @ApiField("batch_code")
        private String batchCode;

        @ApiField("due_date")
        private String dueDate;

        @ApiField("item_id")
        private String itemId;

        @ApiField("item_quantity")
        private Long itemQuantity;

        @ApiField("order_item_id")
        private String orderItemId;

        @ApiField("produce_code")
        private String produceCode;

        @ApiField("product_date")
        private String productDate;

        public String getBatchCode() {
            return this.batchCode;
        }

        public void setBatchCode(String batchCode) {
            this.batchCode = batchCode;
        }

        public String getDueDate() {
            return this.dueDate;
        }

        public void setDueDate(String dueDate) {
            this.dueDate = dueDate;
        }

        public String getItemId() {
            return this.itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
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

        public String getProduceCode() {
            return this.produceCode;
        }

        public void setProduceCode(String produceCode) {
            this.produceCode = produceCode;
        }

        public String getProductDate() {
            return this.productDate;
        }

        public void setProductDate(String productDate) {
            this.productDate = productDate;
        }
    }

    public static class PackageMaterialListWlbWmsConsignOrderConfirm
            extends TaobaoObject {
        private static final long serialVersionUID = 8257535971466643571L;

        @ApiField("material_quantity")
        private Long materialQuantity;

        @ApiField("material_type")
        private String materialType;

        public Long getMaterialQuantity() {
            return this.materialQuantity;
        }

        public void setMaterialQuantity(Long materialQuantity) {
            this.materialQuantity = materialQuantity;
        }

        public String getMaterialType() {
            return this.materialType;
        }

        public void setMaterialType(String materialType) {
            this.materialType = materialType;
        }
    }

    public static class TmsOrdersWlbWmsConsignOrderConfirm
            extends TaobaoObject {
        private static final long serialVersionUID = 1376697263648949538L;

        @ApiField("package_code")
        private String packageCode;

        @ApiField("package_height")
        private Long packageHeight;

        @ApiField("package_length")
        private Long packageLength;

        @ApiListField("package_material_list")
        @ApiField("package_material_list_wlb_wms_consign_order_confirm")
        private List<PackageMaterialListWlbWmsConsignOrderConfirm> packageMaterialList;

        @ApiField("package_weight")
        private Long packageWeight;

        @ApiField("package_width")
        private Long packageWidth;

        @ApiField("tms_code")
        private String tmsCode;

        @ApiListField("tms_items")
        @ApiField("tms_items_wlb_wms_consign_order_confirm")
        private List<TmsItemsWlbWmsConsignOrderConfirm> tmsItems;

        @ApiField("tms_order_code")
        private String tmsOrderCode;

        public String getPackageCode() {
            return this.packageCode;
        }

        public void setPackageCode(String packageCode) {
            this.packageCode = packageCode;
        }

        public Long getPackageHeight() {
            return this.packageHeight;
        }

        public void setPackageHeight(Long packageHeight) {
            this.packageHeight = packageHeight;
        }

        public Long getPackageLength() {
            return this.packageLength;
        }

        public void setPackageLength(Long packageLength) {
            this.packageLength = packageLength;
        }

        public List<PackageMaterialListWlbWmsConsignOrderConfirm> getPackageMaterialList() {
            return this.packageMaterialList;
        }

        public void setPackageMaterialList(List<PackageMaterialListWlbWmsConsignOrderConfirm> packageMaterialList) {
            this.packageMaterialList = packageMaterialList;
        }

        public Long getPackageWeight() {
            return this.packageWeight;
        }

        public void setPackageWeight(Long packageWeight) {
            this.packageWeight = packageWeight;
        }

        public Long getPackageWidth() {
            return this.packageWidth;
        }

        public void setPackageWidth(Long packageWidth) {
            this.packageWidth = packageWidth;
        }

        public String getTmsCode() {
            return this.tmsCode;
        }

        public void setTmsCode(String tmsCode) {
            this.tmsCode = tmsCode;
        }

        public List<TmsItemsWlbWmsConsignOrderConfirm> getTmsItems() {
            return this.tmsItems;
        }

        public void setTmsItems(List<TmsItemsWlbWmsConsignOrderConfirm> tmsItems) {
            this.tmsItems = tmsItems;
        }

        public String getTmsOrderCode() {
            return this.tmsOrderCode;
        }

        public void setTmsOrderCode(String tmsOrderCode) {
            this.tmsOrderCode = tmsOrderCode;
        }
    }

    public static class InvoinceConfirmsWlbWmsConsignOrderConfirm
            extends TaobaoObject {
        private static final long serialVersionUID = 7146446736573956464L;

        @ApiField("bill_id")
        private Long billId;

        @ApiField("invoice_code")
        private String invoiceCode;

        @ApiField("invoice_number")
        private String invoiceNumber;

        @ApiField("trade_number")
        private String tradeNumber;

        public Long getBillId() {
            return this.billId;
        }

        public void setBillId(Long billId) {
            this.billId = billId;
        }

        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        public void setInvoiceCode(String invoiceCode) {
            this.invoiceCode = invoiceCode;
        }

        public String getInvoiceNumber() {
            return this.invoiceNumber;
        }

        public void setInvoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
        }

        public String getTradeNumber() {
            return this.tradeNumber;
        }

        public void setTradeNumber(String tradeNumber) {
            this.tradeNumber = tradeNumber;
        }
    }

    public static class WlbWmsConsignOrderConfirm
            extends TaobaoObject {
        private static final long serialVersionUID = 6225618481129181625L;

        @ApiField("confirm_type")
        private Long confirmType;

        @ApiListField("invoince_confirms")
        @ApiField("invoince_confirms_wlb_wms_consign_order_confirm")
        private List<InvoinceConfirmsWlbWmsConsignOrderConfirm> invoinceConfirms;

        @ApiField("order_code")
        private String orderCode;

        @ApiField("order_confirm_time")
        private String orderConfirmTime;

        @ApiField("order_join")
        private String orderJoin;

        @ApiField("order_type")
        private Long orderType;

        @ApiField("out_biz_code")
        private String outBizCode;

        @ApiField("store_order_code")
        private String storeOrderCode;

        @ApiListField("tms_orders")
        @ApiField("tms_orders_wlb_wms_consign_order_confirm")
        private List<TmsOrdersWlbWmsConsignOrderConfirm> tmsOrders;

        public Long getConfirmType() {
            return this.confirmType;
        }

        public void setConfirmType(Long confirmType) {
            this.confirmType = confirmType;
        }

        public List<InvoinceConfirmsWlbWmsConsignOrderConfirm> getInvoinceConfirms() {
            return this.invoinceConfirms;
        }

        public void setInvoinceConfirms(List<InvoinceConfirmsWlbWmsConsignOrderConfirm> invoinceConfirms) {
            this.invoinceConfirms = invoinceConfirms;
        }

        public String getOrderCode() {
            return this.orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getOrderConfirmTime() {
            return this.orderConfirmTime;
        }

        public void setOrderConfirmTime(String orderConfirmTime) {
            this.orderConfirmTime = orderConfirmTime;
        }

        public String getOrderJoin() {
            return this.orderJoin;
        }

        public void setOrderJoin(String orderJoin) {
            this.orderJoin = orderJoin;
        }

        public Long getOrderType() {
            return this.orderType;
        }

        public void setOrderType(Long orderType) {
            this.orderType = orderType;
        }

        public String getOutBizCode() {
            return this.outBizCode;
        }

        public void setOutBizCode(String outBizCode) {
            this.outBizCode = outBizCode;
        }

        public String getStoreOrderCode() {
            return this.storeOrderCode;
        }

        public void setStoreOrderCode(String storeOrderCode) {
            this.storeOrderCode = storeOrderCode;
        }

        public List<TmsOrdersWlbWmsConsignOrderConfirm> getTmsOrders() {
            return this.tmsOrders;
        }

        public void setTmsOrders(List<TmsOrdersWlbWmsConsignOrderConfirm> tmsOrders) {
            this.tmsOrders = tmsOrders;
        }
    }
}


