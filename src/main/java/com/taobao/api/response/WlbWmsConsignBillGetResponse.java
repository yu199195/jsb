package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class WlbWmsConsignBillGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6841944944425697278L;
    @ApiListField("consign_send_info_list")
    @ApiField("consignsendinfolist")
    private List<Consignsendinfolist> consignSendInfoList;

    public void setConsignSendInfoList(List<Consignsendinfolist> consignSendInfoList) {
        this.consignSendInfoList = consignSendInfoList;
    }

    public List<Consignsendinfolist> getConsignSendInfoList() {
        return this.consignSendInfoList;
    }

    public static class Inventoryitem
            extends TaobaoObject {
        private static final long serialVersionUID = 5755933497241932243L;

        @ApiField("batch_code")
        private String batchCode;

        @ApiField("due_date")
        private Date dueDate;

        @ApiField("inventory_type")
        private Long inventoryType;

        @ApiField("item_qty")
        private Long itemQty;

        @ApiField("produce_area")
        private String produceArea;

        @ApiField("produce_code")
        private String produceCode;

        @ApiField("produce_date")
        private Date produceDate;

        public String getBatchCode() {
            return this.batchCode;
        }

        public void setBatchCode(String batchCode) {
            this.batchCode = batchCode;
        }

        public Date getDueDate() {
            return this.dueDate;
        }

        public void setDueDate(Date dueDate) {
            this.dueDate = dueDate;
        }

        public Long getInventoryType() {
            return this.inventoryType;
        }

        public void setInventoryType(Long inventoryType) {
            this.inventoryType = inventoryType;
        }

        public Long getItemQty() {
            return this.itemQty;
        }

        public void setItemQty(Long itemQty) {
            this.itemQty = itemQty;
        }

        public String getProduceArea() {
            return this.produceArea;
        }

        public void setProduceArea(String produceArea) {
            this.produceArea = produceArea;
        }

        public String getProduceCode() {
            return this.produceCode;
        }

        public void setProduceCode(String produceCode) {
            this.produceCode = produceCode;
        }

        public Date getProduceDate() {
            return this.produceDate;
        }

        public void setProduceDate(Date produceDate) {
            this.produceDate = produceDate;
        }
    }

    public static class Inventoryitemlist
            extends TaobaoObject {
        private static final long serialVersionUID = 3816161617571334269L;

        @ApiField("inventory_item")
        private Inventoryitem inventoryItem;

        public Inventoryitem getInventoryItem() {
            return this.inventoryItem;
        }

        public void setInventoryItem(Inventoryitem inventoryItem) {
            this.inventoryItem = inventoryItem;
        }
    }

    public static class Orderitem
            extends TaobaoObject {
        private static final long serialVersionUID = 3651693752527824278L;

        @ApiListField("inventory_item_list")
        @ApiField("inventoryitemlist")
        private List<Inventoryitemlist> inventoryItemList;

        @ApiField("item_code")
        private String itemCode;

        @ApiField("item_id")
        private String itemId;

        @ApiField("order_item_id")
        private String orderItemId;

        @ApiField("order_source_code")
        private String orderSourceCode;

        public List<Inventoryitemlist> getInventoryItemList() {
            return this.inventoryItemList;
        }

        public void setInventoryItemList(List<Inventoryitemlist> inventoryItemList) {
            this.inventoryItemList = inventoryItemList;
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
    }

    public static class Orderitemlist
            extends TaobaoObject {
        private static final long serialVersionUID = 3261857285661232343L;

        @ApiField("order_item")
        private Orderitem orderItem;

        public Orderitem getOrderItem() {
            return this.orderItem;
        }

        public void setOrderItem(Orderitem orderItem) {
            this.orderItem = orderItem;
        }
    }

    public static class Packagematerial
            extends TaobaoObject {
        private static final long serialVersionUID = 8523317363289689137L;

        @ApiField("material_quantity")
        private String materialQuantity;

        @ApiField("material_type")
        private String materialType;

        public String getMaterialQuantity() {
            return this.materialQuantity;
        }

        public void setMaterialQuantity(String materialQuantity) {
            this.materialQuantity = materialQuantity;
        }

        public String getMaterialType() {
            return this.materialType;
        }

        public void setMaterialType(String materialType) {
            this.materialType = materialType;
        }
    }

    public static class Packagemateriallist
            extends TaobaoObject {
        private static final long serialVersionUID = 7584127675237513819L;

        @ApiField("package_material")
        private Packagematerial packageMaterial;

        public Packagematerial getPackageMaterial() {
            return this.packageMaterial;
        }

        public void setPackageMaterial(Packagematerial packageMaterial) {
            this.packageMaterial = packageMaterial;
        }
    }

    public static class Tmsitem
            extends TaobaoObject {
        private static final long serialVersionUID = 2757474273276791313L;

        @ApiField("item_code")
        private String itemCode;

        @ApiField("item_id")
        private String itemId;

        @ApiField("item_qty")
        private Long itemQty;

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

        public Long getItemQty() {
            return this.itemQty;
        }

        public void setItemQty(Long itemQty) {
            this.itemQty = itemQty;
        }
    }

    public static class Tmsitemlist
            extends TaobaoObject {
        private static final long serialVersionUID = 7195364332213479976L;

        @ApiField("tms_item")
        private Tmsitem tmsItem;

        public Tmsitem getTmsItem() {
            return this.tmsItem;
        }

        public void setTmsItem(Tmsitem tmsItem) {
            this.tmsItem = tmsItem;
        }
    }

    public static class Tmsorder
            extends TaobaoObject {
        private static final long serialVersionUID = 5443142768836794765L;

        @ApiField("package_code")
        private String packageCode;

        @ApiField("package_height")
        private Long packageHeight;

        @ApiField("package_length")
        private Long packageLength;

        @ApiListField("package_material_list")
        @ApiField("packagemateriallist")
        private List<Packagemateriallist> packageMaterialList;

        @ApiField("package_weight")
        private Long packageWeight;

        @ApiField("package_width")
        private Long packageWidth;

        @ApiField("tms_code")
        private String tmsCode;

        @ApiListField("tms_item_list")
        @ApiField("tmsitemlist")
        private List<Tmsitemlist> tmsItemList;

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

        public List<Packagemateriallist> getPackageMaterialList() {
            return this.packageMaterialList;
        }

        public void setPackageMaterialList(List<Packagemateriallist> packageMaterialList) {
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

        public List<Tmsitemlist> getTmsItemList() {
            return this.tmsItemList;
        }

        public void setTmsItemList(List<Tmsitemlist> tmsItemList) {
            this.tmsItemList = tmsItemList;
        }

        public String getTmsOrderCode() {
            return this.tmsOrderCode;
        }

        public void setTmsOrderCode(String tmsOrderCode) {
            this.tmsOrderCode = tmsOrderCode;
        }
    }

    public static class Tmsorderlist
            extends TaobaoObject {
        private static final long serialVersionUID = 3229447776838895881L;

        @ApiField("tms_order")
        private Tmsorder tmsOrder;

        public Tmsorder getTmsOrder() {
            return this.tmsOrder;
        }

        public void setTmsOrder(Tmsorder tmsOrder) {
            this.tmsOrder = tmsOrder;
        }
    }

    public static class Invoinceconfirm
            extends TaobaoObject {
        private static final long serialVersionUID = 1363194627995377758L;

        @ApiField("bill_id")
        private String billId;

        @ApiField("invoice_code")
        private String invoiceCode;

        @ApiField("invoice_number")
        private String invoiceNumber;

        public String getBillId() {
            return this.billId;
        }

        public void setBillId(String billId) {
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
    }

    public static class Invoinceconfirmlist
            extends TaobaoObject {
        private static final long serialVersionUID = 3876629947193265826L;

        @ApiField("invoince_confirm")
        private Invoinceconfirm invoinceConfirm;

        public Invoinceconfirm getInvoinceConfirm() {
            return this.invoinceConfirm;
        }

        public void setInvoinceConfirm(Invoinceconfirm invoinceConfirm) {
            this.invoinceConfirm = invoinceConfirm;
        }
    }

    public static class Consignsendinfo
            extends TaobaoObject {
        private static final long serialVersionUID = 3754796239294262269L;

        @ApiField("cn_order_code")
        private String cnOrderCode;

        @ApiField("confirm_time")
        private Date confirmTime;

        @ApiListField("invoince_confirm_list")
        @ApiField("invoinceconfirmlist")
        private List<Invoinceconfirmlist> invoinceConfirmList;

        @ApiField("order_code")
        private String orderCode;

        @ApiListField("order_item_list")
        @ApiField("orderitemlist")
        private List<Orderitemlist> orderItemList;

        @ApiField("order_type")
        private Long orderType;

        @ApiField("status")
        private String status;

        @ApiField("store_code")
        private String storeCode;

        @ApiListField("tms_order_list")
        @ApiField("tmsorderlist")
        private List<Tmsorderlist> tmsOrderList;

        public String getCnOrderCode() {
            return this.cnOrderCode;
        }

        public void setCnOrderCode(String cnOrderCode) {
            this.cnOrderCode = cnOrderCode;
        }

        public Date getConfirmTime() {
            return this.confirmTime;
        }

        public void setConfirmTime(Date confirmTime) {
            this.confirmTime = confirmTime;
        }

        public List<Invoinceconfirmlist> getInvoinceConfirmList() {
            return this.invoinceConfirmList;
        }

        public void setInvoinceConfirmList(List<Invoinceconfirmlist> invoinceConfirmList) {
            this.invoinceConfirmList = invoinceConfirmList;
        }

        public String getOrderCode() {
            return this.orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public List<Orderitemlist> getOrderItemList() {
            return this.orderItemList;
        }

        public void setOrderItemList(List<Orderitemlist> orderItemList) {
            this.orderItemList = orderItemList;
        }

        public Long getOrderType() {
            return this.orderType;
        }

        public void setOrderType(Long orderType) {
            this.orderType = orderType;
        }

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStoreCode() {
            return this.storeCode;
        }

        public void setStoreCode(String storeCode) {
            this.storeCode = storeCode;
        }

        public List<Tmsorderlist> getTmsOrderList() {
            return this.tmsOrderList;
        }

        public void setTmsOrderList(List<Tmsorderlist> tmsOrderList) {
            this.tmsOrderList = tmsOrderList;
        }
    }

    public static class Consignsendinfolist
            extends TaobaoObject {
        private static final long serialVersionUID = 4566983881791616162L;

        @ApiField("consign_send_info")
        private Consignsendinfo consignSendInfo;

        public Consignsendinfo getConsignSendInfo() {
            return this.consignSendInfo;
        }

        public void setConsignSendInfo(Consignsendinfo consignSendInfo) {
            this.consignSendInfo = consignSendInfo;
        }
    }
}


