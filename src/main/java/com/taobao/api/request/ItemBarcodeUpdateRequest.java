package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemBarcodeUpdateResponse;

import java.util.Map;

public class ItemBarcodeUpdateRequest
        extends BaseTaobaoRequest<ItemBarcodeUpdateResponse> {
    private Boolean isforce;
    private String itemBarcode;
    private Long itemId;
    private String skuBarcodes;
    private String skuIds;
    private String src;

    public void setIsforce(Boolean isforce) {
        this.isforce = isforce;
    }

    public Boolean getIsforce() {
        return this.isforce;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
    }

    public String getItemBarcode() {
        return this.itemBarcode;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setSkuBarcodes(String skuBarcodes) {
        this.skuBarcodes = skuBarcodes;
    }

    public String getSkuBarcodes() {
        return this.skuBarcodes;
    }

    public void setSkuIds(String skuIds) {
        this.skuIds = skuIds;
    }

    public String getSkuIds() {
        return this.skuIds;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getSrc() {
        return this.src;
    }

    public String getApiMethodName() {
        return "taobao.item.barcode.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("isforce", this.isforce);
        txtParams.put("item_barcode", this.itemBarcode);
        txtParams.put("item_id", this.itemId);
        txtParams.put("sku_barcodes", this.skuBarcodes);
        txtParams.put("sku_ids", this.skuIds);
        txtParams.put("src", this.src);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemBarcodeUpdateResponse> getResponseClass() {
        return ItemBarcodeUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
    }
}


