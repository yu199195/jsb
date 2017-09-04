package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ArticleBizOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class VasOrderSearchResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2129241447815451419L;
    @ApiListField("article_biz_orders")
    @ApiField("article_biz_order")
    private List<ArticleBizOrder> articleBizOrders;
    @ApiField("total_item")
    private Long totalItem;

    public void setArticleBizOrders(List<ArticleBizOrder> articleBizOrders) {
        this.articleBizOrders = articleBizOrders;
    }

    public List<ArticleBizOrder> getArticleBizOrders() {
        return this.articleBizOrders;
    }

    public void setTotalItem(Long totalItem) {
        this.totalItem = totalItem;
    }

    public Long getTotalItem() {
        return this.totalItem;
    }
}


