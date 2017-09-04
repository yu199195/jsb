package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ArticleSub;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class VasSubscSearchResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6491999224124392553L;
    @ApiListField("article_subs")
    @ApiField("article_sub")
    private List<ArticleSub> articleSubs;
    @ApiField("total_item")
    private Long totalItem;

    public void setArticleSubs(List<ArticleSub> articleSubs) {
        this.articleSubs = articleSubs;
    }

    public List<ArticleSub> getArticleSubs() {
        return this.articleSubs;
    }

    public void setTotalItem(Long totalItem) {
        this.totalItem = totalItem;
    }

    public Long getTotalItem() {
        return this.totalItem;
    }
}


