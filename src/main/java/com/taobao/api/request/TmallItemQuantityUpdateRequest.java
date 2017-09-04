package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallItemQuantityUpdateResponse;

import java.util.List;
import java.util.Map;

public class TmallItemQuantityUpdateRequest
        extends BaseTaobaoRequest<TmallItemQuantityUpdateResponse> {
    private Long itemId;
    private Long itemQuantity;
    private String options;
    private String skuQuantities;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemQuantity(Long itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Long getItemQuantity() {
        return this.itemQuantity;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public void setOptions(UpdateItemQuantityOption options) {
        this.options = new JSONWriter(false, true).write(options);
    }

    public String getOptions() {
        return this.options;
    }

    public void setSkuQuantities(String skuQuantities) {
        this.skuQuantities = skuQuantities;
    }

    public void setSkuQuantities(List<UpdateSkuQuantity> skuQuantities) {
        this.skuQuantities = new JSONWriter(false, true).write(skuQuantities);
    }

    public String getSkuQuantities() {
        return this.skuQuantities;
    }

    public String getApiMethodName() {
        return "tmall.item.quantity.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("item_quantity", this.itemQuantity);
        txtParams.put("options", this.options);
        txtParams.put("sku_quantities", this.skuQuantities);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallItemQuantityUpdateResponse> getResponseClass() {
        return TmallItemQuantityUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
        RequestCheckUtils.checkObjectMaxListSize(this.skuQuantities, 20, "skuQuantities");
    }

    public static class UpdateSkuQuantity
            extends TaobaoObject {
        private static final long serialVersionUID = 4631642155755978199L;

        @ApiField("outer_id")
        private String outerId;

        @ApiField("properties")
        private String properties;

        @ApiField("quantity")
        private Long quantity;

        @ApiField("sku_id")
        private Long skuId;

        public String getOuterId() {
            return this.outerId;
        }

        public void setOuterId(String outerId) {
            this.outerId = outerId;
        }

        public String getProperties() {
            return this.properties;
        }

        public void setProperties(String properties) {
            this.properties = properties;
        }

        public Long getQuantity() {
            return this.quantity;
        }

        public void setQuantity(Long quantity) {
            this.quantity = quantity;
        }

        public Long getSkuId() {
            return this.skuId;
        }

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }
    }

    public static class UpdateItemQuantityOption
            extends TaobaoObject {
        private static final long serialVersionUID = 4439269629752769822L;

        @ApiField("outer_biz_key")
        private String outerBizKey;

        @ApiField("type")
        private Long type;

        public String getOuterBizKey() {
            return this.outerBizKey;
        }

        public void setOuterBizKey(String outerBizKey) {
            this.outerBizKey = outerBizKey;
        }

        public Long getType() {
            return this.type;
        }

        public void setType(Long type) {
            this.type = type;
        }
    }
}


