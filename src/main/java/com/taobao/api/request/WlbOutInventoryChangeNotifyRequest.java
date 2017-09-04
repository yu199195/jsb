package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbOutInventoryChangeNotifyResponse;

import java.util.Map;

public class WlbOutInventoryChangeNotifyRequest
        extends BaseTaobaoRequest<WlbOutInventoryChangeNotifyResponse> {
    private Long changeCount;
    private Long itemId;
    private String opType;
    private String orderSourceCode;
    private String outBizCode;
    private Long resultCount;
    private String source;
    private String storeCode;
    private String type;

    public void setChangeCount(Long changeCount) {
        this.changeCount = changeCount;
    }

    public Long getChangeCount() {
        return this.changeCount;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public String getOpType() {
        return this.opType;
    }

    public void setOrderSourceCode(String orderSourceCode) {
        this.orderSourceCode = orderSourceCode;
    }

    public String getOrderSourceCode() {
        return this.orderSourceCode;
    }

    public void setOutBizCode(String outBizCode) {
        this.outBizCode = outBizCode;
    }

    public String getOutBizCode() {
        return this.outBizCode;
    }

    public void setResultCount(Long resultCount) {
        this.resultCount = resultCount;
    }

    public Long getResultCount() {
        return this.resultCount;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String getApiMethodName() {
        return "taobao.wlb.out.inventory.change.notify";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("change_count", this.changeCount);
        txtParams.put("item_id", this.itemId);
        txtParams.put("op_type", this.opType);
        txtParams.put("order_source_code", this.orderSourceCode);
        txtParams.put("out_biz_code", this.outBizCode);
        txtParams.put("result_count", this.resultCount);
        txtParams.put("source", this.source);
        txtParams.put("store_code", this.storeCode);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbOutInventoryChangeNotifyResponse> getResponseClass() {
        return WlbOutInventoryChangeNotifyResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.changeCount, "changeCount");
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(this.opType, "opType");
        RequestCheckUtils.checkNotEmpty(this.outBizCode, "outBizCode");
        RequestCheckUtils.checkNotEmpty(this.resultCount, "resultCount");
        RequestCheckUtils.checkNotEmpty(this.source, "source");
        RequestCheckUtils.checkNotEmpty(this.type, "type");
    }
}


