package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsConsignInventoryReleaseResponse;

import java.util.List;
import java.util.Map;

public class WlbWmsConsignInventoryReleaseRequest
        extends BaseTaobaoRequest<WlbWmsConsignInventoryReleaseResponse> {
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
        return "taobao.wlb.wms.consign.inventory.release";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("content", this.content);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsConsignInventoryReleaseResponse> getResponseClass() {
        return WlbWmsConsignInventoryReleaseResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }

    public static class Iteminventory
            extends TaobaoObject {
        private static final long serialVersionUID = 4546575772832575688L;

        @ApiField("item_code")
        private String itemCode;

        @ApiField("item_id")
        private String itemId;

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
        private static final long serialVersionUID = 4841348979621465632L;

        @ApiField("item_inventory")
        private WlbWmsConsignInventoryReleaseRequest.Iteminventory itemInventory;

        public Iteminventory getItemInventory() {
            return this.itemInventory;
        }

        public void setItemInventory(Iteminventory itemInventory) {
            this.itemInventory = itemInventory;
        }
    }

    public static class Content
            extends TaobaoObject {
        private static final long serialVersionUID = 1484857591153325731L;

        @ApiListField("item_inventory_list")
        @ApiField("iteminventorylist")
        private List<Iteminventorylist> itemInventoryList;

        @ApiField("order_code")
        private String orderCode;

        @ApiField("order_source")
        private Long orderSource;

        public List<Iteminventorylist> getItemInventoryList() {
            return this.itemInventoryList;
        }

        public void setItemInventoryList(List<Iteminventorylist> itemInventoryList) {
            this.itemInventoryList = itemInventoryList;
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
    }
}


