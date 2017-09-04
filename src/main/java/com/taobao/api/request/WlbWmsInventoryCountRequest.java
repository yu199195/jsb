package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsInventoryCountResponse;

import java.util.List;
import java.util.Map;

public class WlbWmsInventoryCountRequest
        extends BaseTaobaoRequest<WlbWmsInventoryCountResponse> {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void setContent(WlbWmsInventoryCount content) {
        this.content = new JSONWriter(false, true).write(content);
    }

    public String getContent() {
        return this.content;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.inventory.count";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("content", this.content);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsInventoryCountResponse> getResponseClass() {
        return WlbWmsInventoryCountResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }

    public static class ItemListWlbWmsInventoryCount
            extends TaobaoObject {
        private static final long serialVersionUID = 5485142798613671917L;

        @ApiField("batch_code")
        private String batchCode;

        @ApiField("due_date")
        private String dueDate;

        @ApiField("inventory_type")
        private Long inventoryType;

        @ApiField("item_id")
        private String itemId;

        @ApiField("produce_code")
        private String produceCode;

        @ApiField("product_date")
        private String productDate;

        @ApiField("quantity")
        private Long quantity;

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

        public Long getInventoryType() {
            return this.inventoryType;
        }

        public void setInventoryType(Long inventoryType) {
            this.inventoryType = inventoryType;
        }

        public String getItemId() {
            return this.itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
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

        public Long getQuantity() {
            return this.quantity;
        }

        public void setQuantity(Long quantity) {
            this.quantity = quantity;
        }
    }

    public static class WlbWmsInventoryCount
            extends TaobaoObject {
        private static final long serialVersionUID = 6865843891956575523L;

        @ApiField("adjust_biz_key")
        private String adjustBizKey;

        @ApiField("adjust_reason_type")
        private String adjustReasonType;

        @ApiField("adjust_type")
        private String adjustType;

        @ApiListField("item_list")
        @ApiField("item_list_wlb_wms_inventory_count")
        private List<ItemListWlbWmsInventoryCount> itemList;

        @ApiField("order_code")
        private String orderCode;

        @ApiField("order_confirm_time")
        private String orderConfirmTime;

        @ApiField("order_type")
        private Long orderType;

        @ApiField("out_biz_code")
        private String outBizCode;

        @ApiField("remark")
        private String remark;

        @ApiField("store_code")
        private String storeCode;

        @ApiField("store_order_code")
        private String storeOrderCode;

        public String getAdjustBizKey() {
            return this.adjustBizKey;
        }

        public void setAdjustBizKey(String adjustBizKey) {
            this.adjustBizKey = adjustBizKey;
        }

        public String getAdjustReasonType() {
            return this.adjustReasonType;
        }

        public void setAdjustReasonType(String adjustReasonType) {
            this.adjustReasonType = adjustReasonType;
        }

        public String getAdjustType() {
            return this.adjustType;
        }

        public void setAdjustType(String adjustType) {
            this.adjustType = adjustType;
        }

        public List<ItemListWlbWmsInventoryCount> getItemList() {
            return this.itemList;
        }

        public void setItemList(List<ItemListWlbWmsInventoryCount> itemList) {
            this.itemList = itemList;
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

        public String getRemark() {
            return this.remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getStoreCode() {
            return this.storeCode;
        }

        public void setStoreCode(String storeCode) {
            this.storeCode = storeCode;
        }

        public String getStoreOrderCode() {
            return this.storeOrderCode;
        }

        public void setStoreOrderCode(String storeOrderCode) {
            this.storeOrderCode = storeOrderCode;
        }
    }
}


