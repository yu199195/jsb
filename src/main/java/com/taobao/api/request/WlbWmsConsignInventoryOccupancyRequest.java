package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsConsignInventoryOccupancyResponse;

import java.util.List;
import java.util.Map;

public class WlbWmsConsignInventoryOccupancyRequest
        extends BaseTaobaoRequest<WlbWmsConsignInventoryOccupancyResponse> {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void setContent(Content content) {
        this.content = new JSONWriter(false, true).write(content);
    }

    public String getContent() {
        return this.content;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.consign.inventory.occupancy";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("content", this.content);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsConsignInventoryOccupancyResponse> getResponseClass() {
        return WlbWmsConsignInventoryOccupancyResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }

    public static class Receiverinfo
            extends TaobaoObject {
        private static final long serialVersionUID = 6338183487877836436L;

        @ApiField("receiver_area")
        private String receiverArea;

        @ApiField("receiver_city")
        private String receiverCity;

        @ApiField("receiver_province")
        private String receiverProvince;

        @ApiField("receiver_town")
        private String receiverTown;

        @ApiField("receiver_zip_code")
        private String receiverZipCode;

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

    public static class Iteminventory
            extends TaobaoObject {
        private static final long serialVersionUID = 4486832393676198767L;

        @ApiField("item_code")
        private String itemCode;

        @ApiField("item_id")
        private String itemId;

        @ApiField("item_quantity")
        private Long itemQuantity;

        @ApiField("order_source_code")
        private String orderSourceCode;

        @ApiField("sub_source_code")
        private String subSourceCode;

        public String getItemCode() {
            return this.itemCode;
        }

        public void setItemCode(String itemCode) {
            this.itemCode = itemCode;
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

        public String getOrderSourceCode() {
            return this.orderSourceCode;
        }

        public void setOrderSourceCode(String orderSourceCode) {
            this.orderSourceCode = orderSourceCode;
        }

        public String getSubSourceCode() {
            return this.subSourceCode;
        }

        public void setSubSourceCode(String subSourceCode) {
            this.subSourceCode = subSourceCode;
        }
    }

    public static class Iteminventorylist
            extends TaobaoObject {
        private static final long serialVersionUID = 2885243656576956954L;

        @ApiField("item_inventory")
        private WlbWmsConsignInventoryOccupancyRequest.Iteminventory itemInventory;

        public Iteminventory getItemInventory() {
            return this.itemInventory;
        }

        public void setItemInventory(Iteminventory itemInventory) {
            this.itemInventory = itemInventory;
        }
    }

    public static class Content
            extends TaobaoObject {
        private static final long serialVersionUID = 1527173442858259363L;

        @ApiListField("item_inventory_list")
        @ApiField("iteminventorylist")
        private List<Iteminventorylist> itemInventoryList;

        @ApiField("max_store_num")
        private String maxStoreNum;

        @ApiField("order_code")
        private String orderCode;

        @ApiField("order_source")
        private Long orderSource;

        @ApiField("receiver_info")
        private WlbWmsConsignInventoryOccupancyRequest.Receiverinfo receiverInfo;

        @ApiField("store_code")
        private String storeCode;

        public List<Iteminventorylist> getItemInventoryList() {
            return this.itemInventoryList;
        }

        public void setItemInventoryList(List<Iteminventorylist> itemInventoryList) {
            this.itemInventoryList = itemInventoryList;
        }

        public String getMaxStoreNum() {
            return this.maxStoreNum;
        }

        public void setMaxStoreNum(String maxStoreNum) {
            this.maxStoreNum = maxStoreNum;
        }

        public String getOrderCode() {
            return this.orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public Long getOrderSource() {
            return this.orderSource;
        }

        public void setOrderSource(Long orderSource) {
            this.orderSource = orderSource;
        }

        public Receiverinfo getReceiverInfo() {
            return this.receiverInfo;
        }

        public void setReceiverInfo(Receiverinfo receiverInfo) {
            this.receiverInfo = receiverInfo;
        }

        public String getStoreCode() {
            return this.storeCode;
        }

        public void setStoreCode(String storeCode) {
            this.storeCode = storeCode;
        }
    }
}


