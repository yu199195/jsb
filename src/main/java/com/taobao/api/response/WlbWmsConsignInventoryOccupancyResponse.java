package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbWmsConsignInventoryOccupancyResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2525125268986724279L;
    @ApiField("is_retry")
    private Boolean isRetry;
    @ApiListField("item_inventory_list")
    @ApiField("iteminventorylist")
    private List<Iteminventorylist> itemInventoryList;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("wl_error_code")
    private String wlErrorCode;
    @ApiField("wl_error_msg")
    private String wlErrorMsg;
    @ApiField("wl_success")
    private String wlSuccess;

    public void setIsRetry(Boolean isRetry) {
        this.isRetry = isRetry;
    }

    public Boolean getIsRetry() {
        return this.isRetry;
    }

    public void setItemInventoryList(List<Iteminventorylist> itemInventoryList) {
        this.itemInventoryList = itemInventoryList;
    }

    public List<Iteminventorylist> getItemInventoryList() {
        return this.itemInventoryList;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setWlErrorCode(String wlErrorCode) {
        this.wlErrorCode = wlErrorCode;
    }

    public String getWlErrorCode() {
        return this.wlErrorCode;
    }

    public void setWlErrorMsg(String wlErrorMsg) {
        this.wlErrorMsg = wlErrorMsg;
    }

    public String getWlErrorMsg() {
        return this.wlErrorMsg;
    }

    public void setWlSuccess(String wlSuccess) {
        this.wlSuccess = wlSuccess;
    }

    public String getWlSuccess() {
        return this.wlSuccess;
    }

    public static class Iteminventory
            extends TaobaoObject {
        private static final long serialVersionUID = 7191155813834138555L;

        @ApiField("comb_item_id")
        private String combItemId;

        @ApiField("error_code")
        private String errorCode;

        @ApiField("error_msg")
        private String errorMsg;

        @ApiField("item_code")
        private String itemCode;

        @ApiField("item_id")
        private String itemId;

        @ApiField("item_ocpy_qty")
        private Long itemOcpyQty;

        @ApiField("order_source_code")
        private String orderSourceCode;

        @ApiField("store_code")
        private String storeCode;

        @ApiField("sub_source_code")
        private String subSourceCode;

        @ApiField("success")
        private Boolean success;

        public String getCombItemId() {
            return this.combItemId;
        }

        public void setCombItemId(String combItemId) {
            this.combItemId = combItemId;
        }

        public String getErrorCode() {
            return this.errorCode;
        }

        public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        public String getErrorMsg() {
            return this.errorMsg;
        }

        public void setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
        }

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

        public Long getItemOcpyQty() {
            return this.itemOcpyQty;
        }

        public void setItemOcpyQty(Long itemOcpyQty) {
            this.itemOcpyQty = itemOcpyQty;
        }

        public String getOrderSourceCode() {
            return this.orderSourceCode;
        }

        public void setOrderSourceCode(String orderSourceCode) {
            this.orderSourceCode = orderSourceCode;
        }

        public String getStoreCode() {
            return this.storeCode;
        }

        public void setStoreCode(String storeCode) {
            this.storeCode = storeCode;
        }

        public String getSubSourceCode() {
            return this.subSourceCode;
        }

        public void setSubSourceCode(String subSourceCode) {
            this.subSourceCode = subSourceCode;
        }

        public Boolean getSuccess() {
            return this.success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }
    }

    public static class Iteminventorylist
            extends TaobaoObject {
        private static final long serialVersionUID = 8719688644635598156L;

        @ApiField("item_inventory")
        private Iteminventory itemInventory;

        public Iteminventory getItemInventory() {
            return this.itemInventory;
        }

        public void setItemInventory(Iteminventory itemInventory) {
            this.itemInventory = itemInventory;
        }
    }
}


