package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.Destitemlistwlbwmsskucombinationcreateupdate;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsSkuCombinationCreateUpdateResponse;

import java.util.List;
import java.util.Map;

public class WlbWmsSkuCombinationCreateUpdateRequest
        extends BaseTaobaoRequest<WlbWmsSkuCombinationCreateUpdateResponse> {
    private String destItem;
    private String itemId;
    private String ownerUserId;
    private String proportion;

    public void setDestItem(String destItem) {
        this.destItem = destItem;
    }

    public void setDestItem(List<Destitemlistwlbwmsskucombinationcreateupdate> destItem) {
        this.destItem = new JSONWriter(false, true).write(destItem);
    }

    public String getDestItem() {
        return this.destItem;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }

    public String getProportion() {
        return this.proportion;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.sku.combination.create.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("dest_item", this.destItem);
        txtParams.put("item_id", this.itemId);
        txtParams.put("owner_user_id", this.ownerUserId);
        txtParams.put("proportion", this.proportion);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsSkuCombinationCreateUpdateResponse> getResponseClass() {
        return WlbWmsSkuCombinationCreateUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkObjectMaxListSize(this.destItem, 20, "destItem");
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(this.ownerUserId, "ownerUserId");
        RequestCheckUtils.checkNotEmpty(this.proportion, "proportion");
        RequestCheckUtils.checkMaxListSize(this.proportion, 20, "proportion");
    }
}


