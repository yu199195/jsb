package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ItemImg;
import com.taobao.api.internal.mapping.ApiField;

public class ItemJointImgResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8637831854747497192L;
    @ApiField("item_img")
    private ItemImg itemImg;

    public void setItemImg(ItemImg itemImg) {
        this.itemImg = itemImg;
    }

    public ItemImg getItemImg() {
        return this.itemImg;
    }
}


