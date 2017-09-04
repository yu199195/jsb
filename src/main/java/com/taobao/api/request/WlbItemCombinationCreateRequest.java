package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemCombinationCreateResponse;

import java.util.Map;

public class WlbItemCombinationCreateRequest
        extends BaseTaobaoRequest<WlbItemCombinationCreateResponse> {
    private String destItemList;
    private Long itemId;
    private String proportionList;

    public void setDestItemList(String destItemList) {
        this.destItemList = destItemList;
    }

    public String getDestItemList() {
        return this.destItemList;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setProportionList(String proportionList) {
        this.proportionList = proportionList;
    }

    public String getProportionList() {
        return this.proportionList;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.combination.create";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("dest_item_list", this.destItemList);
        txtParams.put("item_id", this.itemId);
        txtParams.put("proportion_list", this.proportionList);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbItemCombinationCreateResponse> getResponseClass() {
        return WlbItemCombinationCreateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.destItemList, "destItemList");
        RequestCheckUtils.checkMaxListSize(this.destItemList, 20, "destItemList");
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
        RequestCheckUtils.checkMaxListSize(this.proportionList, 20, "proportionList");
    }
}


