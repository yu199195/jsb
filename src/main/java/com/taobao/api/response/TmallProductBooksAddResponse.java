package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ProductBooks;
import com.taobao.api.internal.mapping.ApiField;

public class TmallProductBooksAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6412954258341221442L;
    @ApiField("product_books")
    private ProductBooks productBooks;

    public void setProductBooks(ProductBooks productBooks) {
        this.productBooks = productBooks;
    }

    public ProductBooks getProductBooks() {
        return this.productBooks;
    }
}


